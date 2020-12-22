package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RecipeGuestDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    public static final RecipeGuest recipeGuest = new RecipeGuest();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.id")
    public static final SqlColumn<Integer> id = recipeGuest.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.recipe_id")
    public static final SqlColumn<Integer> recipeId = recipeGuest.recipeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.guest_id")
    public static final SqlColumn<Integer> guestId = recipeGuest.guestId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.rune")
    public static final SqlColumn<String> rune = recipeGuest.rune;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    public static final class RecipeGuest extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> recipeId = column("recipe_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> guestId = column("guest_id", JDBCType.INTEGER);

        public final SqlColumn<String> rune = column("rune", JDBCType.VARCHAR);

        public RecipeGuest() {
            super("recipe_guest");
        }
    }
}