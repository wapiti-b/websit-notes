package com.promote.website.model;

import java.util.Date;
import javax.annotation.Generated;

public class Message {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.message_id")
	private Integer messageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.messages")
	private String messages;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.time")
	private Date time;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.message_id")
	public Integer getMessageId() {
		return messageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.message_id")
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.messages")
	public String getMessages() {
		return messages;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.messages")
	public void setMessages(String messages) {
		this.messages = messages;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.time")
	public Date getTime() {
		return time;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source field: message.time")
	public void setTime(Date time) {
		this.time = time;
	}
}