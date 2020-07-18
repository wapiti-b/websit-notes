package com.promote.website.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MessageDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source Table: message")
	public static final Message message = new Message();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.message_id")
	public static final SqlColumn<Integer> messageId = message.messageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.messages")
	public static final SqlColumn<String> messages = message.messages;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.time")
	public static final SqlColumn<Date> time = message.time;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source Table: message")
	public static final class Message extends SqlTable {
		public final SqlColumn<Integer> messageId = column("message_id", JDBCType.INTEGER);
		public final SqlColumn<String> messages = column("messages", JDBCType.VARCHAR);
		public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

		public Message() {
			super("message");
		}
	}
}