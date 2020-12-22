package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.RecipeIngredientDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.RecipeIngredient;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RecipeIngredientMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    BasicColumn[] selectList = BasicColumn.columnList(id, recipeId, ingredientId, ingredientCount);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RecipeIngredient> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RecipeIngredient> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RecipeIngredientResult")
    Optional<RecipeIngredient> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RecipeIngredientResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="recipe_id", property="recipeId", jdbcType=JdbcType.INTEGER),
        @Result(column="ingredient_id", property="ingredientId", jdbcType=JdbcType.INTEGER),
        @Result(column="ingredient_count", property="ingredientCount", jdbcType=JdbcType.INTEGER)
    })
    List<RecipeIngredient> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int insert(RecipeIngredient record) {
        return MyBatis3Utils.insert(this::insert, record, recipeIngredient, c ->
            c.map(id).toProperty("id")
            .map(recipeId).toProperty("recipeId")
            .map(ingredientId).toProperty("ingredientId")
            .map(ingredientCount).toProperty("ingredientCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int insertMultiple(Collection<RecipeIngredient> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, recipeIngredient, c ->
            c.map(id).toProperty("id")
            .map(recipeId).toProperty("recipeId")
            .map(ingredientId).toProperty("ingredientId")
            .map(ingredientCount).toProperty("ingredientCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int insertSelective(RecipeIngredient record) {
        return MyBatis3Utils.insert(this::insert, record, recipeIngredient, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(recipeId).toPropertyWhenPresent("recipeId", record::getRecipeId)
            .map(ingredientId).toPropertyWhenPresent("ingredientId", record::getIngredientId)
            .map(ingredientCount).toPropertyWhenPresent("ingredientCount", record::getIngredientCount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default Optional<RecipeIngredient> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default List<RecipeIngredient> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default List<RecipeIngredient> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default Optional<RecipeIngredient> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, recipeIngredient, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    static UpdateDSL<UpdateModel> updateAllColumns(RecipeIngredient record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(recipeId).equalTo(record::getRecipeId)
                .set(ingredientId).equalTo(record::getIngredientId)
                .set(ingredientCount).equalTo(record::getIngredientCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RecipeIngredient record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(recipeId).equalToWhenPresent(record::getRecipeId)
                .set(ingredientId).equalToWhenPresent(record::getIngredientId)
                .set(ingredientCount).equalToWhenPresent(record::getIngredientCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int updateByPrimaryKey(RecipeIngredient record) {
        return update(c ->
            c.set(recipeId).equalTo(record::getRecipeId)
            .set(ingredientId).equalTo(record::getIngredientId)
            .set(ingredientCount).equalTo(record::getIngredientCount)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_ingredient")
    default int updateByPrimaryKeySelective(RecipeIngredient record) {
        return update(c ->
            c.set(recipeId).equalToWhenPresent(record::getRecipeId)
            .set(ingredientId).equalToWhenPresent(record::getIngredientId)
            .set(ingredientCount).equalToWhenPresent(record::getIngredientCount)
            .where(id, isEqualTo(record::getId))
        );
    }
}