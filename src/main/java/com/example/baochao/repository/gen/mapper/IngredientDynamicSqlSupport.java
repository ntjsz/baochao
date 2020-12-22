package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IngredientDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ingredient")
    public static final Ingredient ingredient = new Ingredient();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.id")
    public static final SqlColumn<Integer> id = ingredient.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ingredient.name")
    public static final SqlColumn<String> name = ingredient.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ingredient")
    public static final class Ingredient extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Ingredient() {
            super("ingredient");
        }
    }
}