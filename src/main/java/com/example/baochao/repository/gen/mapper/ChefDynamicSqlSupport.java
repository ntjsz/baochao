package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ChefDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    public static final Chef chef = new Chef();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.id")
    public static final SqlColumn<Integer> id = chef.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.name")
    public static final SqlColumn<String> name = chef.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.rarity")
    public static final SqlColumn<Integer> rarity = chef.rarity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.stirfry")
    public static final SqlColumn<Integer> stirfry = chef.stirfry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.boil")
    public static final SqlColumn<Integer> boil = chef.boil;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.knife")
    public static final SqlColumn<Integer> knife = chef.knife;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.fry")
    public static final SqlColumn<Integer> fry = chef.fry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.bake")
    public static final SqlColumn<Integer> bake = chef.bake;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.steam")
    public static final SqlColumn<Integer> steam = chef.steam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.skill")
    public static final SqlColumn<String> skill = chef.skill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.meat")
    public static final SqlColumn<Integer> meat = chef.meat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.fish")
    public static final SqlColumn<Integer> fish = chef.fish;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.vegetable")
    public static final SqlColumn<Integer> vegetable = chef.vegetable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.flour")
    public static final SqlColumn<Integer> flour = chef.flour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.practice_mission")
    public static final SqlColumn<String> practiceMission = chef.practiceMission;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.practice_skill")
    public static final SqlColumn<String> practiceSkill = chef.practiceSkill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.source")
    public static final SqlColumn<String> source = chef.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.sex")
    public static final SqlColumn<Integer> sex = chef.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.sweet")
    public static final SqlColumn<Integer> sweet = chef.sweet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.sour")
    public static final SqlColumn<Integer> sour = chef.sour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.spicy")
    public static final SqlColumn<Integer> spicy = chef.spicy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.salty")
    public static final SqlColumn<Integer> salty = chef.salty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.bitter")
    public static final SqlColumn<Integer> bitter = chef.bitter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: chef.fresh")
    public static final SqlColumn<Integer> fresh = chef.fresh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    public static final class Chef extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> rarity = column("rarity", JDBCType.INTEGER);

        public final SqlColumn<Integer> stirfry = column("stirfry", JDBCType.INTEGER);

        public final SqlColumn<Integer> boil = column("boil", JDBCType.INTEGER);

        public final SqlColumn<Integer> knife = column("knife", JDBCType.INTEGER);

        public final SqlColumn<Integer> fry = column("fry", JDBCType.INTEGER);

        public final SqlColumn<Integer> bake = column("bake", JDBCType.INTEGER);

        public final SqlColumn<Integer> steam = column("steam", JDBCType.INTEGER);

        public final SqlColumn<String> skill = column("skill", JDBCType.VARCHAR);

        public final SqlColumn<Integer> meat = column("meat", JDBCType.INTEGER);

        public final SqlColumn<Integer> fish = column("fish", JDBCType.INTEGER);

        public final SqlColumn<Integer> vegetable = column("vegetable", JDBCType.INTEGER);

        public final SqlColumn<Integer> flour = column("flour", JDBCType.INTEGER);

        public final SqlColumn<String> practiceMission = column("practice_mission", JDBCType.VARCHAR);

        public final SqlColumn<String> practiceSkill = column("practice_skill", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sex = column("sex", JDBCType.INTEGER);

        public final SqlColumn<Integer> sweet = column("sweet", JDBCType.INTEGER);

        public final SqlColumn<Integer> sour = column("sour", JDBCType.INTEGER);

        public final SqlColumn<Integer> spicy = column("spicy", JDBCType.INTEGER);

        public final SqlColumn<Integer> salty = column("salty", JDBCType.INTEGER);

        public final SqlColumn<Integer> bitter = column("bitter", JDBCType.INTEGER);

        public final SqlColumn<Integer> fresh = column("fresh", JDBCType.INTEGER);

        public Chef() {
            super("chef");
        }
    }
}