package com.promote.website.model;

import java.util.Date;
import javax.annotation.Generated;

public class Info {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.info_id")
	private Integer infoId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.title")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.infos")
	private String infos;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.time")
	private Date time;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.user_id")
	private Integer userId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.info_id")
	public Integer getInfoId() {
		return infoId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.info_id")
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.title")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.title")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.infos")
	public String getInfos() {
		return infos;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.infos")
	public void setInfos(String infos) {
		this.infos = infos;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.time")
	public Date getTime() {
		return time;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.time")
	public void setTime(Date time) {
		this.time = time;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.user_id")
	public Integer getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.593+08:00", comments = "Source field: info.user_id")
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}