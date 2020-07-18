package com.promote.website.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InfoDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source Table: info")
	public static final Info info = new Info();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.info_id")
	public static final SqlColumn<Integer> infoId = info.infoId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.title")
	public static final SqlColumn<String> title = info.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.infos")
	public static final SqlColumn<String> infos = info.infos;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.time")
	public static final SqlColumn<Date> time = info.time;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.user_id")
	public static final SqlColumn<Integer> userId = info.userId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source Table: info")
	public static final class Info extends SqlTable {
		public final SqlColumn<Integer> infoId = column("info_id", JDBCType.INTEGER);
		public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);
		public final SqlColumn<String> infos = column("infos", JDBCType.VARCHAR);
		public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

		public Info() {
			super("info");
		}
	}
}