package com.example.baochao.domain.common.skill.effect;

import com.example.baochao.util.DataChecker;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum SkillEffectCondition {
    SELF("Self"),
    PARTIAL("Partial"),
    GLOBAL("Global"),
    UNKNOWN("unknown");

    private final String name;

    SkillEffectCondition(String name) {
        this.name = name;
    }

    private static final Map<String, SkillEffectCondition> map = Arrays.stream(SkillEffectCondition.values())
            .collect(Collectors.toMap(
                    SkillEffectCondition::getName, Function.identity()));
    private static final Set<String> unknownSet = DataChecker.getUnknownPool(SkillEffectCondition.class);

    public static SkillEffectCondition from(String name) {
        SkillEffectCondition type = map.getOrDefault(name, UNKNOWN);
        if (UNKNOWN.equals(type)) {
            unknownSet.add(name);
        }
        return type;
    }
}
