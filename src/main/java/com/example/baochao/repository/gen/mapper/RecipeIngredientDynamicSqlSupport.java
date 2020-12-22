package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RecipeIngredientDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    public static final RecipeIngredient recipeIngredient = new RecipeIngredient();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.id")
    public static final SqlColumn<Integer> id = recipeIngredient.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.recipe_id")
    public static final SqlColumn<Integer> recipeId = recipeIngredient.recipeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_id")
    public static final SqlColumn<Integer> ingredientId = recipeIngredient.ingredientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_count")
    public static final SqlColumn<Integer> ingredientCount = recipeIngredient.ingredientCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    public static final class RecipeIngredient extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> recipeId = column("recipe_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> ingredientId = column("ingredient_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> ingredientCount = column("ingredient_count", JDBCType.INTEGER);

        public RecipeIngredient() {
            super("recipe_ingredient");
        }
    }
}