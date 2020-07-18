package com.promote.website.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InfoMessageDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source Table: info_message")
	public static final InfoMessage infoMessage = new InfoMessage();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source field: info_message.info_message_id")
	public static final SqlColumn<Integer> infoMessageId = infoMessage.infoMessageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source field: info_message.info_id")
	public static final SqlColumn<Integer> infoId = infoMessage.infoId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source field: info_message.message_id")
	public static final SqlColumn<Integer> messageId = infoMessage.messageId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source Table: info_message")
	public static final class InfoMessage extends SqlTable {
		public final SqlColumn<Integer> infoMessageId = column("info_message_id", JDBCType.INTEGER);
		public final SqlColumn<Integer> infoId = column("info_id", JDBCType.INTEGER);
		public final SqlColumn<Integer> messageId = column("message_id", JDBCType.INTEGER);

		public InfoMessage() {
			super("info_message");
		}
	}
}