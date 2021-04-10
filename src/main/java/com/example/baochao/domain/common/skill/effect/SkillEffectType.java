package com.example.baochao.domain.common.skill.effect;

import com.example.baochao.util.DataChecker;
import lombok.Getter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum SkillEffectType {
    BAKE("Bake"),
    USE_FISH("UseFish"),
    GOLD_GAIN("Gold_Gain"),
    GUEST_DROP_COUNT("GuestDropCount"),
    GUEST_APEAR_RATE("GuestApearRate"),
    SPICY("Spicy"),
    TASTY("Tasty"),
    USEFRY("UseFry"),
    BITTER("Bitter"),
    FRY("Fry"),
    MAXEQUIPLIMIT("MaxEquipLimit"),
    BOIL("Boil"),
    MEAT("Meat"),
    KNIFE("Knife"),
    OPENTIME("OpenTime"),
    USE_TASTY("UseTasty"),
    STIRFRY("Stirfry"),
    FISH("Fish"),
    USE_KNIFE("UseKnife"),
    CREATION("Creation"),
    USE_SOUR("UseSour"),
    REJUVENATION("Rejuvenation"),
    USE_BITTER("UseBitter"),
    USE_BOIL("UseBoil"),
    USE_VEGETABLE("UseVegetable"),
    USE_SPICY("UseSpicy"),
    USE_CREATION("UseCreation"),
    USE_MEAT("UseMeat"),
    EXPLORE_TIME("ExploreTime"),
    MUTI_EQUIPMENT_SKILL("MutiEquipmentSkill"),
    USE_ALL("UseAll"),
    USE_SALTY("UseSalty"),
    STEAM("Steam"),
    USE_STIRFRY("UseStirfry"),
    USE_STEAM("UseSteam"),
    SWEET("Sweet"),
    USE_SWEET("UseSweet"),
    MATERIAL_GAIN("Material_Gain"),
    SALTY("Salty"),
    USE_BAKE("UseBake"),
    VEGETABLE("Vegetable"),
    SOUR("Sour"),
    UNKNOWN("unknown");

    private final String name;

    SkillEffectType(String name) {
        this.name = name;
    }

    private static final Map<String, SkillEffectType> map = Arrays.stream(SkillEffectType.values())
            .collect(Collectors.toMap(
                    SkillEffectType::getName, Function.identity()));
    private static final Set<String> unknownSet = DataChecker.getUnknownPool(SkillEffectType.class);

    public static SkillEffectType from(String name) {
        SkillEffectType type = map.getOrDefault(name, UNKNOWN);
        if (UNKNOWN.equals(type)) {
            unknownSet.add(name);
        }
        return type;
    }
}
