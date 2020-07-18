package com.promote.website.model;

import javax.annotation.Generated;

public class Collect {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.collect_id")
	private Integer collectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.user_id")
	private Integer userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.info_id")
	private Integer infoId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.collect_id")
	public Integer getCollectId() {
		return collectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.collect_id")
	public void setCollectId(Integer collectId) {
		this.collectId = collectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.user_id")
	public Integer getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.user_id")
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.info_id")
	public Integer getInfoId() {
		return infoId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source field: collect.info_id")
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
}