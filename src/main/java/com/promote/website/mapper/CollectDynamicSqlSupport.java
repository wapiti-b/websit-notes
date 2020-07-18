package com.promote.website.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CollectDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	public static final Collect collect = new Collect();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.collect_id")
	public static final SqlColumn<Integer> collectId = collect.collectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.user_id")
	public static final SqlColumn<Integer> userId = collect.userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.info_id")
	public static final SqlColumn<Integer> infoId = collect.infoId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	public static final class Collect extends SqlTable {
		public final SqlColumn<Integer> collectId = column("collect_id", JDBCType.INTEGER);
		public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);
		public final SqlColumn<Integer> infoId = column("info_id", JDBCType.INTEGER);

		public Collect() {
			super("collect");
		}
	}
}