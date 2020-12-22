package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.RecipeGuestDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.RecipeGuest;
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
public interface RecipeGuestMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    BasicColumn[] selectList = BasicColumn.columnList(id, recipeId, guestId, rune);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RecipeGuest> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RecipeGuest> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RecipeGuestResult")
    Optional<RecipeGuest> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RecipeGuestResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="recipe_id", property="recipeId", jdbcType=JdbcType.INTEGER),
        @Result(column="guest_id", property="guestId", jdbcType=JdbcType.INTEGER),
        @Result(column="rune", property="rune", jdbcType=JdbcType.VARCHAR)
    })
    List<RecipeGuest> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int insert(RecipeGuest record) {
        return MyBatis3Utils.insert(this::insert, record, recipeGuest, c ->
            c.map(id).toProperty("id")
            .map(recipeId).toProperty("recipeId")
            .map(guestId).toProperty("guestId")
            .map(rune).toProperty("rune")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int insertMultiple(Collection<RecipeGuest> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, recipeGuest, c ->
            c.map(id).toProperty("id")
            .map(recipeId).toProperty("recipeId")
            .map(guestId).toProperty("guestId")
            .map(rune).toProperty("rune")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int insertSelective(RecipeGuest record) {
        return MyBatis3Utils.insert(this::insert, record, recipeGuest, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(recipeId).toPropertyWhenPresent("recipeId", record::getRecipeId)
            .map(guestId).toPropertyWhenPresent("guestId", record::getGuestId)
            .map(rune).toPropertyWhenPresent("rune", record::getRune)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default Optional<RecipeGuest> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default List<RecipeGuest> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default List<RecipeGuest> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default Optional<RecipeGuest> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, recipeGuest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    static UpdateDSL<UpdateModel> updateAllColumns(RecipeGuest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(recipeId).equalTo(record::getRecipeId)
                .set(guestId).equalTo(record::getGuestId)
                .set(rune).equalTo(record::getRune);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RecipeGuest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(recipeId).equalToWhenPresent(record::getRecipeId)
                .set(guestId).equalToWhenPresent(record::getGuestId)
                .set(rune).equalToWhenPresent(record::getRune);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int updateByPrimaryKey(RecipeGuest record) {
        return update(c ->
            c.set(recipeId).equalTo(record::getRecipeId)
            .set(guestId).equalTo(record::getGuestId)
            .set(rune).equalTo(record::getRune)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe_guest")
    default int updateByPrimaryKeySelective(RecipeGuest record) {
        return update(c ->
            c.set(recipeId).equalToWhenPresent(record::getRecipeId)
            .set(guestId).equalToWhenPresent(record::getGuestId)
            .set(rune).equalToWhenPresent(record::getRune)
            .where(id, isEqualTo(record::getId))
        );
    }
}