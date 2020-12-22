package com.example.baochao.repository.gen.model;

import javax.annotation.Generated;

public class Equipment {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.rarity")
    private Integer rarity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.source")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.skill")
    private String skill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.rarity")
    public Integer getRarity() {
        return rarity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.rarity")
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.source")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.source")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.skill")
    public String getSkill() {
        return skill;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.skill")
    public void setSkill(String skill) {
        this.skill = skill;
    }
}