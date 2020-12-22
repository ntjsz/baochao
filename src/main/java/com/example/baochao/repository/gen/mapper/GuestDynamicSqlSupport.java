package com.example.baochao.repository.gen.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GuestDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: guest")
    public static final Guest guest = new Guest();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: guest.id")
    public static final SqlColumn<Integer> id = guest.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: guest.name")
    public static final SqlColumn<String> name = guest.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: guest")
    public static final class Guest extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Guest() {
            super("guest");
        }
    }
}