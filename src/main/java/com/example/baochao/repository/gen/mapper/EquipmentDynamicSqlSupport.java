package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EquipmentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    public static final Equipment equipment = new Equipment();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.id")
    public static final SqlColumn<Integer> id = equipment.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.name")
    public static final SqlColumn<String> name = equipment.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.rarity")
    public static final SqlColumn<Integer> rarity = equipment.rarity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.source")
    public static final SqlColumn<String> source = equipment.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: equipment.skill")
    public static final SqlColumn<String> skill = equipment.skill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: equipment")
    public static final class Equipment extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> rarity = column("rarity", JDBCType.INTEGER);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> skill = column("skill", JDBCType.VARCHAR);

        public Equipment() {
            super("equipment");
        }
    }
}