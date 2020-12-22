package com.example.baochao.repository.gen.model;

import javax.annotation.Generated;

public class EquipmentSkill {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.equipment_id")
    private Integer equipmentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_0")
    private String category0;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_1")
    private String category1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_2")
    private String category2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_num")
    private Integer effectNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_value")
    private String effectValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.equipment_id")
    public Integer getEquipmentId() {
        return equipmentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.equipment_id")
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_0")
    public String getCategory0() {
        return category0;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_0")
    public void setCategory0(String category0) {
        this.category0 = category0;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_1")
    public String getCategory1() {
        return category1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_1")
    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_2")
    public String getCategory2() {
        return category2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_2")
    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_num")
    public Integer getEffectNum() {
        return effectNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_num")
    public void setEffectNum(Integer effectNum) {
        this.effectNum = effectNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_value")
    public String getEffectValue() {
        return effectValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_value")
    public void setEffectValue(String effectValue) {
        this.effectValue = effectValue;
    }
}