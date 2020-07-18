package com.promote.website.model;

import javax.annotation.Generated;

public class InfoMessage {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_message_id")
	private Integer infoMessageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_id")
	private Integer infoId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.message_id")
	private Integer messageId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_message_id")
	public Integer getInfoMessageId() {
		return infoMessageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_message_id")
	public void setInfoMessageId(Integer infoMessageId) {
		this.infoMessageId = infoMessageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_id")
	public Integer getInfoId() {
		return infoId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.info_id")
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.message_id")
	public Integer getMessageId() {
		return messageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source field: info_message.message_id")
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
}