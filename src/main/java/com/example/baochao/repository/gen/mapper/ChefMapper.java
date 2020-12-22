package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.ChefDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.Chef;
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
public interface ChefMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, rarity, stirfry, boil, knife, fry, bake, steam, skill, meat, fish, vegetable, flour, practiceMission, practiceSkill, source, sex, sweet, sour, spicy, salty, bitter, fresh);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Chef> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Chef> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ChefResult")
    Optional<Chef> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ChefResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="rarity", property="rarity", jdbcType=JdbcType.INTEGER),
        @Result(column="stirfry", property="stirfry", jdbcType=JdbcType.INTEGER),
        @Result(column="boil", property="boil", jdbcType=JdbcType.INTEGER),
        @Result(column="knife", property="knife", jdbcType=JdbcType.INTEGER),
        @Result(column="fry", property="fry", jdbcType=JdbcType.INTEGER),
        @Result(column="bake", property="bake", jdbcType=JdbcType.INTEGER),
        @Result(column="steam", property="steam", jdbcType=JdbcType.INTEGER),
        @Result(column="skill", property="skill", jdbcType=JdbcType.VARCHAR),
        @Result(column="meat", property="meat", jdbcType=JdbcType.INTEGER),
        @Result(column="fish", property="fish", jdbcType=JdbcType.INTEGER),
        @Result(column="vegetable", property="vegetable", jdbcType=JdbcType.INTEGER),
        @Result(column="flour", property="flour", jdbcType=JdbcType.INTEGER),
        @Result(column="practice_mission", property="practiceMission", jdbcType=JdbcType.VARCHAR),
        @Result(column="practice_skill", property="practiceSkill", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="sweet", property="sweet", jdbcType=JdbcType.INTEGER),
        @Result(column="sour", property="sour", jdbcType=JdbcType.INTEGER),
        @Result(column="spicy", property="spicy", jdbcType=JdbcType.INTEGER),
        @Result(column="salty", property="salty", jdbcType=JdbcType.INTEGER),
        @Result(column="bitter", property="bitter", jdbcType=JdbcType.INTEGER),
        @Result(column="fresh", property="fresh", jdbcType=JdbcType.INTEGER)
    })
    List<Chef> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int insert(Chef record) {
        return MyBatis3Utils.insert(this::insert, record, chef, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(stirfry).toProperty("stirfry")
            .map(boil).toProperty("boil")
            .map(knife).toProperty("knife")
            .map(fry).toProperty("fry")
            .map(bake).toProperty("bake")
            .map(steam).toProperty("steam")
            .map(skill).toProperty("skill")
            .map(meat).toProperty("meat")
            .map(fish).toProperty("fish")
            .map(vegetable).toProperty("vegetable")
            .map(flour).toProperty("flour")
            .map(practiceMission).toProperty("practiceMission")
            .map(practiceSkill).toProperty("practiceSkill")
            .map(source).toProperty("source")
            .map(sex).toProperty("sex")
            .map(sweet).toProperty("sweet")
            .map(sour).toProperty("sour")
            .map(spicy).toProperty("spicy")
            .map(salty).toProperty("salty")
            .map(bitter).toProperty("bitter")
            .map(fresh).toProperty("fresh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int insertMultiple(Collection<Chef> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, chef, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(stirfry).toProperty("stirfry")
            .map(boil).toProperty("boil")
            .map(knife).toProperty("knife")
            .map(fry).toProperty("fry")
            .map(bake).toProperty("bake")
            .map(steam).toProperty("steam")
            .map(skill).toProperty("skill")
            .map(meat).toProperty("meat")
            .map(fish).toProperty("fish")
            .map(vegetable).toProperty("vegetable")
            .map(flour).toProperty("flour")
            .map(practiceMission).toProperty("practiceMission")
            .map(practiceSkill).toProperty("practiceSkill")
            .map(source).toProperty("source")
            .map(sex).toProperty("sex")
            .map(sweet).toProperty("sweet")
            .map(sour).toProperty("sour")
            .map(spicy).toProperty("spicy")
            .map(salty).toProperty("salty")
            .map(bitter).toProperty("bitter")
            .map(fresh).toProperty("fresh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int insertSelective(Chef record) {
        return MyBatis3Utils.insert(this::insert, record, chef, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(rarity).toPropertyWhenPresent("rarity", record::getRarity)
            .map(stirfry).toPropertyWhenPresent("stirfry", record::getStirfry)
            .map(boil).toPropertyWhenPresent("boil", record::getBoil)
            .map(knife).toPropertyWhenPresent("knife", record::getKnife)
            .map(fry).toPropertyWhenPresent("fry", record::getFry)
            .map(bake).toPropertyWhenPresent("bake", record::getBake)
            .map(steam).toPropertyWhenPresent("steam", record::getSteam)
            .map(skill).toPropertyWhenPresent("skill", record::getSkill)
            .map(meat).toPropertyWhenPresent("meat", record::getMeat)
            .map(fish).toPropertyWhenPresent("fish", record::getFish)
            .map(vegetable).toPropertyWhenPresent("vegetable", record::getVegetable)
            .map(flour).toPropertyWhenPresent("flour", record::getFlour)
            .map(practiceMission).toPropertyWhenPresent("practiceMission", record::getPracticeMission)
            .map(practiceSkill).toPropertyWhenPresent("practiceSkill", record::getPracticeSkill)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(sweet).toPropertyWhenPresent("sweet", record::getSweet)
            .map(sour).toPropertyWhenPresent("sour", record::getSour)
            .map(spicy).toPropertyWhenPresent("spicy", record::getSpicy)
            .map(salty).toPropertyWhenPresent("salty", record::getSalty)
            .map(bitter).toPropertyWhenPresent("bitter", record::getBitter)
            .map(fresh).toPropertyWhenPresent("fresh", record::getFresh)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default Optional<Chef> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default List<Chef> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default List<Chef> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default Optional<Chef> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, chef, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    static UpdateDSL<UpdateModel> updateAllColumns(Chef record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(rarity).equalTo(record::getRarity)
                .set(stirfry).equalTo(record::getStirfry)
                .set(boil).equalTo(record::getBoil)
                .set(knife).equalTo(record::getKnife)
                .set(fry).equalTo(record::getFry)
                .set(bake).equalTo(record::getBake)
                .set(steam).equalTo(record::getSteam)
                .set(skill).equalTo(record::getSkill)
                .set(meat).equalTo(record::getMeat)
                .set(fish).equalTo(record::getFish)
                .set(vegetable).equalTo(record::getVegetable)
                .set(flour).equalTo(record::getFlour)
                .set(practiceMission).equalTo(record::getPracticeMission)
                .set(practiceSkill).equalTo(record::getPracticeSkill)
                .set(source).equalTo(record::getSource)
                .set(sex).equalTo(record::getSex)
                .set(sweet).equalTo(record::getSweet)
                .set(sour).equalTo(record::getSour)
                .set(spicy).equalTo(record::getSpicy)
                .set(salty).equalTo(record::getSalty)
                .set(bitter).equalTo(record::getBitter)
                .set(fresh).equalTo(record::getFresh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Chef record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(rarity).equalToWhenPresent(record::getRarity)
                .set(stirfry).equalToWhenPresent(record::getStirfry)
                .set(boil).equalToWhenPresent(record::getBoil)
                .set(knife).equalToWhenPresent(record::getKnife)
                .set(fry).equalToWhenPresent(record::getFry)
                .set(bake).equalToWhenPresent(record::getBake)
                .set(steam).equalToWhenPresent(record::getSteam)
                .set(skill).equalToWhenPresent(record::getSkill)
                .set(meat).equalToWhenPresent(record::getMeat)
                .set(fish).equalToWhenPresent(record::getFish)
                .set(vegetable).equalToWhenPresent(record::getVegetable)
                .set(flour).equalToWhenPresent(record::getFlour)
                .set(practiceMission).equalToWhenPresent(record::getPracticeMission)
                .set(practiceSkill).equalToWhenPresent(record::getPracticeSkill)
                .set(source).equalToWhenPresent(record::getSource)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(sweet).equalToWhenPresent(record::getSweet)
                .set(sour).equalToWhenPresent(record::getSour)
                .set(spicy).equalToWhenPresent(record::getSpicy)
                .set(salty).equalToWhenPresent(record::getSalty)
                .set(bitter).equalToWhenPresent(record::getBitter)
                .set(fresh).equalToWhenPresent(record::getFresh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int updateByPrimaryKey(Chef record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(rarity).equalTo(record::getRarity)
            .set(stirfry).equalTo(record::getStirfry)
            .set(boil).equalTo(record::getBoil)
            .set(knife).equalTo(record::getKnife)
            .set(fry).equalTo(record::getFry)
            .set(bake).equalTo(record::getBake)
            .set(steam).equalTo(record::getSteam)
            .set(skill).equalTo(record::getSkill)
            .set(meat).equalTo(record::getMeat)
            .set(fish).equalTo(record::getFish)
            .set(vegetable).equalTo(record::getVegetable)
            .set(flour).equalTo(record::getFlour)
            .set(practiceMission).equalTo(record::getPracticeMission)
            .set(practiceSkill).equalTo(record::getPracticeSkill)
            .set(source).equalTo(record::getSource)
            .set(sex).equalTo(record::getSex)
            .set(sweet).equalTo(record::getSweet)
            .set(sour).equalTo(record::getSour)
            .set(spicy).equalTo(record::getSpicy)
            .set(salty).equalTo(record::getSalty)
            .set(bitter).equalTo(record::getBitter)
            .set(fresh).equalTo(record::getFresh)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: chef")
    default int updateByPrimaryKeySelective(Chef record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(rarity).equalToWhenPresent(record::getRarity)
            .set(stirfry).equalToWhenPresent(record::getStirfry)
            .set(boil).equalToWhenPresent(record::getBoil)
            .set(knife).equalToWhenPresent(record::getKnife)
            .set(fry).equalToWhenPresent(record::getFry)
            .set(bake).equalToWhenPresent(record::getBake)
            .set(steam).equalToWhenPresent(record::getSteam)
            .set(skill).equalToWhenPresent(record::getSkill)
            .set(meat).equalToWhenPresent(record::getMeat)
            .set(fish).equalToWhenPresent(record::getFish)
            .set(vegetable).equalToWhenPresent(record::getVegetable)
            .set(flour).equalToWhenPresent(record::getFlour)
            .set(practiceMission).equalToWhenPresent(record::getPracticeMission)
            .set(practiceSkill).equalToWhenPresent(record::getPracticeSkill)
            .set(source).equalToWhenPresent(record::getSource)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(sweet).equalToWhenPresent(record::getSweet)
            .set(sour).equalToWhenPresent(record::getSour)
            .set(spicy).equalToWhenPresent(record::getSpicy)
            .set(salty).equalToWhenPresent(record::getSalty)
            .set(bitter).equalToWhenPresent(record::getBitter)
            .set(fresh).equalToWhenPresent(record::getFresh)
            .where(id, isEqualTo(record::getId))
        );
    }
}