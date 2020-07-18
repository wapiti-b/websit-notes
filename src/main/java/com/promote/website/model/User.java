package com.promote.website.model;

import javax.annotation.Generated;
import java.util.Date;

public class User {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.561+08:00", comments = "Source field: user.user_id")
	private Integer userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.565+08:00", comments = "Source field: user.username")
	private String username;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.password")
	private String password;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.emil")
	private String emil;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.img")
	private String img;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.lasttime")
	private Date lasttime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.567+08:00", comments = "Source field: user.authority")
	private Integer authority;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.565+08:00", comments = "Source field: user.user_id")
	public Integer getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.565+08:00", comments = "Source field: user.user_id")
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.565+08:00", comments = "Source field: user.username")
	public String getUsername() {
		return username;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.username")
	public void setUsername(String username) {
		this.username = username;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.password")
	public String getPassword() {
		return password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.password")
	public void setPassword(String password) {
		this.password = password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.emil")
	public String getEmil() {
		return emil;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.emil")
	public void setEmil(String emil) {
		this.emil = emil;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.img")
	public String getImg() {
		return img;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.566+08:00", comments = "Source field: user.img")
	public void setImg(String img) {
		this.img = img;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.567+08:00", comments = "Source field: user.lasttime")
	public Date getLasttime() {
		return lasttime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.567+08:00", comments = "Source field: user.lasttime")
	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.567+08:00", comments = "Source field: user.authority")
	public Integer getAuthority() {
		return authority;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.567+08:00", comments = "Source field: user.authority")
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}
}