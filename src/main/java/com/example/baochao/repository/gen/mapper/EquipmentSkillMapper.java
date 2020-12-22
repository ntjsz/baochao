package com.example.baochao.repository.gen.mapper;

import static com.example.baochao.repository.gen.mapper.EquipmentSkillDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.baochao.repository.gen.model.EquipmentSkill;
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
public interface EquipmentSkillMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    BasicColumn[] selectList = BasicColumn.columnList(id, equipmentId, category0, category1, category2, effectNum, effectValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EquipmentSkill> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<EquipmentSkill> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EquipmentSkillResult")
    Optional<EquipmentSkill> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EquipmentSkillResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="equipment_id", property="equipmentId", jdbcType=JdbcType.INTEGER),
        @Result(column="category_0", property="category0", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_1", property="category1", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_2", property="category2", jdbcType=JdbcType.VARCHAR),
        @Result(column="effect_num", property="effectNum", jdbcType=JdbcType.INTEGER),
        @Result(column="effect_value", property="effectValue", jdbcType=JdbcType.VARCHAR)
    })
    List<EquipmentSkill> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int insert(EquipmentSkill record) {
        return MyBatis3Utils.insert(this::insert, record, equipmentSkill, c ->
            c.map(id).toProperty("id")
            .map(equipmentId).toProperty("equipmentId")
            .map(category0).toProperty("category0")
            .map(category1).toProperty("category1")
            .map(category2).toProperty("category2")
            .map(effectNum).toProperty("effectNum")
            .map(effectValue).toProperty("effectValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int insertMultiple(Collection<EquipmentSkill> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, equipmentSkill, c ->
            c.map(id).toProperty("id")
            .map(equipmentId).toProperty("equipmentId")
            .map(category0).toProperty("category0")
            .map(category1).toProperty("category1")
            .map(category2).toProperty("category2")
            .map(effectNum).toProperty("effectNum")
            .map(effectValue).toProperty("effectValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int insertSelective(EquipmentSkill record) {
        return MyBatis3Utils.insert(this::insert, record, equipmentSkill, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(equipmentId).toPropertyWhenPresent("equipmentId", record::getEquipmentId)
            .map(category0).toPropertyWhenPresent("category0", record::getCategory0)
            .map(category1).toPropertyWhenPresent("category1", record::getCategory1)
            .map(category2).toPropertyWhenPresent("category2", record::getCategory2)
            .map(effectNum).toPropertyWhenPresent("effectNum", record::getEffectNum)
            .map(effectValue).toPropertyWhenPresent("effectValue", record::getEffectValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default Optional<EquipmentSkill> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default List<EquipmentSkill> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default List<EquipmentSkill> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default Optional<EquipmentSkill> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, equipmentSkill, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    static UpdateDSL<UpdateModel> updateAllColumns(EquipmentSkill record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(equipmentId).equalTo(record::getEquipmentId)
                .set(category0).equalTo(record::getCategory0)
                .set(category1).equalTo(record::getCategory1)
                .set(category2).equalTo(record::getCategory2)
                .set(effectNum).equalTo(record::getEffectNum)
                .set(effectValue).equalTo(record::getEffectValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EquipmentSkill record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(equipmentId).equalToWhenPresent(record::getEquipmentId)
                .set(category0).equalToWhenPresent(record::getCategory0)
                .set(category1).equalToWhenPresent(record::getCategory1)
                .set(category2).equalToWhenPresent(record::getCategory2)
                .set(effectNum).equalToWhenPresent(record::getEffectNum)
                .set(effectValue).equalToWhenPresent(record::getEffectValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int updateByPrimaryKey(EquipmentSkill record) {
        return update(c ->
            c.set(equipmentId).equalTo(record::getEquipmentId)
            .set(category0).equalTo(record::getCategory0)
            .set(category1).equalTo(record::getCategory1)
            .set(category2).equalTo(record::getCategory2)
            .set(effectNum).equalTo(record::getEffectNum)
            .set(effectValue).equalTo(record::getEffectValue)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    default int updateByPrimaryKeySelective(EquipmentSkill record) {
        return update(c ->
            c.set(equipmentId).equalToWhenPresent(record::getEquipmentId)
            .set(category0).equalToWhenPresent(record::getCategory0)
            .set(category1).equalToWhenPresent(record::getCategory1)
            .set(category2).equalToWhenPresent(record::getCategory2)
            .set(effectNum).equalToWhenPresent(record::getEffectNum)
            .set(effectValue).equalToWhenPresent(record::getEffectValue)
            .where(id, isEqualTo(record::getId))
        );
    }
}