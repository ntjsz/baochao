package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RecipeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    public static final Recipe recipe = new Recipe();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.id")
    public static final SqlColumn<Integer> id = recipe.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.name")
    public static final SqlColumn<String> name = recipe.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.rarity")
    public static final SqlColumn<Integer> rarity = recipe.rarity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.unlock")
    public static final SqlColumn<String> unlock = recipe.unlock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.stirfry")
    public static final SqlColumn<Integer> stirfry = recipe.stirfry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.boil")
    public static final SqlColumn<Integer> boil = recipe.boil;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.knife")
    public static final SqlColumn<Integer> knife = recipe.knife;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.fry")
    public static final SqlColumn<Integer> fry = recipe.fry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.bake")
    public static final SqlColumn<Integer> bake = recipe.bake;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.steam")
    public static final SqlColumn<Integer> steam = recipe.steam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.price")
    public static final SqlColumn<Integer> price = recipe.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.extra_price")
    public static final SqlColumn<Integer> extraPrice = recipe.extraPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.duration")
    public static final SqlColumn<Integer> duration = recipe.duration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.count_limit")
    public static final SqlColumn<Integer> countLimit = recipe.countLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.source")
    public static final SqlColumn<String> source = recipe.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe.flavor")
    public static final SqlColumn<String> flavor = recipe.flavor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    public static final class Recipe extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> rarity = column("rarity", JDBCType.INTEGER);

        public final SqlColumn<String> unlock = column("unlock", JDBCType.VARCHAR);

        public final SqlColumn<Integer> stirfry = column("stirfry", JDBCType.INTEGER);

        public final SqlColumn<Integer> boil = column("boil", JDBCType.INTEGER);

        public final SqlColumn<Integer> knife = column("knife", JDBCType.INTEGER);

        public final SqlColumn<Integer> fry = column("fry", JDBCType.INTEGER);

        public final SqlColumn<Integer> bake = column("bake", JDBCType.INTEGER);

        public final SqlColumn<Integer> steam = column("steam", JDBCType.INTEGER);

        public final SqlColumn<Integer> price = column("price", JDBCType.INTEGER);

        public final SqlColumn<Integer> extraPrice = column("extra_price", JDBCType.INTEGER);

        public final SqlColumn<Integer> duration = column("duration", JDBCType.INTEGER);

        public final SqlColumn<Integer> countLimit = column("count_limit", JDBCType.INTEGER);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> flavor = column("flavor", JDBCType.VARCHAR);

        public Recipe() {
            super("recipe");
        }
    }
}