package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.EquipmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.Equipment;
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
public interface EquipmentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, rarity, source, skill);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Equipment> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Equipment> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EquipmentResult")
    Optional<Equipment> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EquipmentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="rarity", property="rarity", jdbcType=JdbcType.INTEGER),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="skill", property="skill", jdbcType=JdbcType.VARCHAR)
    })
    List<Equipment> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int insert(Equipment record) {
        return MyBatis3Utils.insert(this::insert, record, equipment, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(source).toProperty("source")
            .map(skill).toProperty("skill")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int insertMultiple(Collection<Equipment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, equipment, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(rarity).toProperty("rarity")
            .map(source).toProperty("source")
            .map(skill).toProperty("skill")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int insertSelective(Equipment record) {
        return MyBatis3Utils.insert(this::insert, record, equipment, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(rarity).toPropertyWhenPresent("rarity", record::getRarity)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(skill).toPropertyWhenPresent("skill", record::getSkill)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default Optional<Equipment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default List<Equipment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default List<Equipment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default Optional<Equipment> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, equipment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    static UpdateDSL<UpdateModel> updateAllColumns(Equipment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(rarity).equalTo(record::getRarity)
                .set(source).equalTo(record::getSource)
                .set(skill).equalTo(record::getSkill);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Equipment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(rarity).equalToWhenPresent(record::getRarity)
                .set(source).equalToWhenPresent(record::getSource)
                .set(skill).equalToWhenPresent(record::getSkill);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int updateByPrimaryKey(Equipment record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(rarity).equalTo(record::getRarity)
            .set(source).equalTo(record::getSource)
            .set(skill).equalTo(record::getSkill)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    default int updateByPrimaryKeySelective(Equipment record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(rarity).equalToWhenPresent(record::getRarity)
            .set(source).equalToWhenPresent(record::getSource)
            .set(skill).equalToWhenPresent(record::getSkill)
            .where(id, isEqualTo(record::getId))
        );
    }
}