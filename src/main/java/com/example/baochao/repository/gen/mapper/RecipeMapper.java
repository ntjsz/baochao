package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.RecipeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.Recipe;
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
public interface RecipeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, rarity, unlock, stirfry, boil, knife, fry, bake, steam, price, extraPrice, duration, countLimit, source, flavor);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Recipe> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Recipe> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RecipeResult")
    Optional<Recipe> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RecipeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="rarity", property="rarity", jdbcType=JdbcType.INTEGER),
        @Result(column="unlock", property="unlock", jdbcType=JdbcType.VARCHAR),
        @Result(column="stirfry", property="stirfry", jdbcType=JdbcType.INTEGER),
        @Result(column="boil", property="boil", jdbcType=JdbcType.INTEGER),
        @Result(column="knife", property="knife", jdbcType=JdbcType.INTEGER),
        @Result(column="fry", property="fry", jdbcType=JdbcType.INTEGER),
        @Result(column="bake", property="bake", jdbcType=JdbcType.INTEGER),
        @Result(column="steam", property="steam", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="extra_price", property="extraPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="count_limit", property="countLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="flavor", property="flavor", jdbcType=JdbcType.VARCHAR)
    })
    List<Recipe> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int insert(Recipe record) {
        return MyBatis3Utils.insert(this::insert, record, recipe, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(unlock).toProperty("unlock")
            .map(stirfry).toProperty("stirfry")
            .map(boil).toProperty("boil")
            .map(knife).toProperty("knife")
            .map(fry).toProperty("fry")
            .map(bake).toProperty("bake")
            .map(steam).toProperty("steam")
            .map(price).toProperty("price")
            .map(extraPrice).toProperty("extraPrice")
            .map(duration).toProperty("duration")
            .map(countLimit).toProperty("countLimit")
            .map(source).toProperty("source")
            .map(flavor).toProperty("flavor")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int insertMultiple(Collection<Recipe> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, recipe, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(unlock).toProperty("unlock")
            .map(stirfry).toProperty("stirfry")
            .map(boil).toProperty("boil")
            .map(knife).toProperty("knife")
            .map(fry).toProperty("fry")
            .map(bake).toProperty("bake")
            .map(steam).toProperty("steam")
            .map(price).toProperty("price")
            .map(extraPrice).toProperty("extraPrice")
            .map(duration).toProperty("duration")
            .map(countLimit).toProperty("countLimit")
            .map(source).toProperty("source")
            .map(flavor).toProperty("flavor")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int insertSelective(Recipe record) {
        return MyBatis3Utils.insert(this::insert, record, recipe, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(rarity).toPropertyWhenPresent("rarity", record::getRarity)
            .map(unlock).toPropertyWhenPresent("unlock", record::getUnlock)
            .map(stirfry).toPropertyWhenPresent("stirfry", record::getStirfry)
            .map(boil).toPropertyWhenPresent("boil", record::getBoil)
            .map(knife).toPropertyWhenPresent("knife", record::getKnife)
            .map(fry).toPropertyWhenPresent("fry", record::getFry)
            .map(bake).toPropertyWhenPresent("bake", record::getBake)
            .map(steam).toPropertyWhenPresent("steam", record::getSteam)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(extraPrice).toPropertyWhenPresent("extraPrice", record::getExtraPrice)
            .map(duration).toPropertyWhenPresent("duration", record::getDuration)
            .map(countLimit).toPropertyWhenPresent("countLimit", record::getCountLimit)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(flavor).toPropertyWhenPresent("flavor", record::getFlavor)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default Optional<Recipe> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default List<Recipe> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default List<Recipe> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default Optional<Recipe> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, recipe, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    static UpdateDSL<UpdateModel> updateAllColumns(Recipe record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(rarity).equalTo(record::getRarity)
                .set(unlock).equalTo(record::getUnlock)
                .set(stirfry).equalTo(record::getStirfry)
                .set(boil).equalTo(record::getBoil)
                .set(knife).equalTo(record::getKnife)
                .set(fry).equalTo(record::getFry)
                .set(bake).equalTo(record::getBake)
                .set(steam).equalTo(record::getSteam)
                .set(price).equalTo(record::getPrice)
                .set(extraPrice).equalTo(record::getExtraPrice)
                .set(duration).equalTo(record::getDuration)
                .set(countLimit).equalTo(record::getCountLimit)
                .set(source).equalTo(record::getSource)
                .set(flavor).equalTo(record::getFlavor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Recipe record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(rarity).equalToWhenPresent(record::getRarity)
                .set(unlock).equalToWhenPresent(record::getUnlock)
                .set(stirfry).equalToWhenPresent(record::getStirfry)
                .set(boil).equalToWhenPresent(record::getBoil)
                .set(knife).equalToWhenPresent(record::getKnife)
                .set(fry).equalToWhenPresent(record::getFry)
                .set(bake).equalToWhenPresent(record::getBake)
                .set(steam).equalToWhenPresent(record::getSteam)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(extraPrice).equalToWhenPresent(record::getExtraPrice)
                .set(duration).equalToWhenPresent(record::getDuration)
                .set(countLimit).equalToWhenPresent(record::getCountLimit)
                .set(source).equalToWhenPresent(record::getSource)
                .set(flavor).equalToWhenPresent(record::getFlavor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int updateByPrimaryKey(Recipe record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(rarity).equalTo(record::getRarity)
            .set(unlock).equalTo(record::getUnlock)
            .set(stirfry).equalTo(record::getStirfry)
            .set(boil).equalTo(record::getBoil)
            .set(knife).equalTo(record::getKnife)
            .set(fry).equalTo(record::getFry)
            .set(bake).equalTo(record::getBake)
            .set(steam).equalTo(record::getSteam)
            .set(price).equalTo(record::getPrice)
            .set(extraPrice).equalTo(record::getExtraPrice)
            .set(duration).equalTo(record::getDuration)
            .set(countLimit).equalTo(record::getCountLimit)
            .set(source).equalTo(record::getSource)
            .set(flavor).equalTo(record::getFlavor)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: recipe")
    default int updateByPrimaryKeySelective(Recipe record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(rarity).equalToWhenPresent(record::getRarity)
            .set(unlock).equalToWhenPresent(record::getUnlock)
            .set(stirfry).equalToWhenPresent(record::getStirfry)
            .set(boil).equalToWhenPresent(record::getBoil)
            .set(knife).equalToWhenPresent(record::getKnife)
            .set(fry).equalToWhenPresent(record::getFry)
            .set(bake).equalToWhenPresent(record::getBake)
            .set(steam).equalToWhenPresent(record::getSteam)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(extraPrice).equalToWhenPresent(record::getExtraPrice)
            .set(duration).equalToWhenPresent(record::getDuration)
            .set(countLimit).equalToWhenPresent(record::getCountLimit)
            .set(source).equalToWhenPresent(record::getSource)
            .set(flavor).equalToWhenPresent(record::getFlavor)
            .where(id, isEqualTo(record::getId))
        );
    }
}