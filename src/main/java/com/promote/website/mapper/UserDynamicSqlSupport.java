package com.promote.website.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;
import java.util.Date;

public final class UserDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.573+08:00", comments = "Source Table: user")
	public static final User user = new User();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.573+08:00", comments = "Source field: user.user_id")
	public static final SqlColumn<Integer> userId = user.userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.574+08:00", comments = "Source field: user.username")
	public static final SqlColumn<String> username = user.username;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.575+08:00", comments = "Source field: user.password")
	public static final SqlColumn<String> password = user.password;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.575+08:00", comments = "Source field: user.emil")
	public static final SqlColumn<String> emil = user.emil;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.575+08:00", comments = "Source field: user.img")
	public static final SqlColumn<String> img = user.img;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.575+08:00", comments = "Source field: user.lasttime")
	public static final SqlColumn<Date> lasttime = user.lasttime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.575+08:00", comments = "Source field: user.authority")
	public static final SqlColumn<Integer> authority = user.authority;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.573+08:00", comments = "Source Table: user")
	public static final class User extends SqlTable {
		public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);
		public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);
		public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);
		public final SqlColumn<String> emil = column("emil", JDBCType.VARCHAR);
		public final SqlColumn<String> img = column("img", JDBCType.VARCHAR);
		public final SqlColumn<Date> lasttime = column("lasttime", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> authority = column("authority", JDBCType.INTEGER);

		public User() {
			super("user");
		}
	}
}