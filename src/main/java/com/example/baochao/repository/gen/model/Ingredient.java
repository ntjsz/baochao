package com.example.baochao.repository.gen.model;

import javax.annotation.Generated;

public class Ingredient {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.name")
    public void setName(String name) {
        this.name = name;
    }
}