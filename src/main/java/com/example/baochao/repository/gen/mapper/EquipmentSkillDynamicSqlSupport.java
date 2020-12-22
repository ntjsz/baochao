package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EquipmentSkillDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    public static final EquipmentSkill equipmentSkill = new EquipmentSkill();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.id")
    public static final SqlColumn<Integer> id = equipmentSkill.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.equipment_id")
    public static final SqlColumn<Integer> equipmentId = equipmentSkill.equipmentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_0")
    public static final SqlColumn<String> category0 = equipmentSkill.category0;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_1")
    public static final SqlColumn<String> category1 = equipmentSkill.category1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.category_2")
    public static final SqlColumn<String> category2 = equipmentSkill.category2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_num")
    public static final SqlColumn<Integer> effectNum = equipmentSkill.effectNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment_skill.effect_value")
    public static final SqlColumn<String> effectValue = equipmentSkill.effectValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment_skill")
    public static final class EquipmentSkill extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> equipmentId = column("equipment_id", JDBCType.INTEGER);

        public final SqlColumn<String> category0 = column("category_0", JDBCType.VARCHAR);

        public final SqlColumn<String> category1 = column("category_1", JDBCType.VARCHAR);

        public final SqlColumn<String> category2 = column("category_2", JDBCType.VARCHAR);

        public final SqlColumn<Integer> effectNum = column("effect_num", JDBCType.INTEGER);

        public final SqlColumn<String> effectValue = column("effect_value", JDBCType.VARCHAR);

        public EquipmentSkill() {
            super("equipment_skill");
        }
    }
}