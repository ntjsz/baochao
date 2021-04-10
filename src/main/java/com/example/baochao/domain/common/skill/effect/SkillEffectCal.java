package com.example.baochao.domain.common.skill.effect;

import com.example.baochao.util.DataChecker;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum SkillEffectCal {
    PERCENT("Percent"),
    ABS("Abs"),
    UNKNOWN("unknown");

    private final String name;

    SkillEffectCal(String name) {
        this.name = name;
    }

    private static final Map<String, SkillEffectCal> map = Arrays.stream(SkillEffectCal.values())
            .collect(Collectors.toMap(
                    SkillEffectCal::getName, Function.identity()));
    private static final Set<String> unknownSet = DataChecker.getUnknownPool(SkillEffectCal.class);

    public static SkillEffectCal from(String name) {
        SkillEffectCal type = map.getOrDefault(name, UNKNOWN);
        if (UNKNOWN.equals(type)) {
            unknownSet.add(name);
        }
        return type;
    }
}
