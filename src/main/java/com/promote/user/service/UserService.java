package com.promote.user.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.BindableColumn;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import com.promote.website.model.*;
import com.promote.website.model.User;
import com.promote.website.mapper.*;
import com.promote.website.mapper.UserDynamicSqlSupport.*;
import org.mybatis.dynamic.sql.SqlBuilder.*;
import org.mybatis.dynamic.sql.SqlColumn;

import static org.mybatis.dynamic.sql.SqlBuilder.*;  // import MyBatis Dynamic SQL where support


@Service
public class UserService {
	
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	public User findUser(User u) {
		User user = new User();
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            SqlColumn<String> name = com.promote.website.mapper.UserDynamicSqlSupport.username;
            SqlColumn<String> password = com.promote.website.mapper.UserDynamicSqlSupport.password;
            List<User> listuser = mapper.select(c->
            		c.where(password,isEqualTo(u.getPassword())).and(name,isEqualTo(u.getUsername())));
            if(!listuser.isEmpty()) {
            	 user = listuser.get(0);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return user;
	}

	public boolean insert(User user) {
		boolean tag = false;
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper2 = session.getMapper(UserMapper.class);
		
		
		List<User> listuser = mapper2.select(c->
		c.where(UserDynamicSqlSupport.username,isEqualTo(user.getUsername())));
		
		if(listuser.isEmpty()) {
			return false;
		}
		
		
		
		
		int insert = mapper2.insert(user);
		session.commit();
		session.close();
		if(insert >=1) tag=true;
		return tag;
	}

	public User findByName(String name) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		SqlColumn<String> n = com.promote.website.mapper.UserDynamicSqlSupport.username;
		//Optional<User> user = mapper.selectOne(c->c.where(n,isEqualTo(name)));
		List<User> listuser = mapper.select(c->c.where(n,isEqualTo(name)));
		User user = listuser.get(0);
		session.commit();
		session.close();
		return user;
	}

	public int updatePw(String username, String pw2) {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		int update = mapper.update(c->c.set(UserDynamicSqlSupport.password).
				equalTo(pw2).
				where(UserDynamicSqlSupport.username,isEqualTo(username)));
		session.commit();
		session.close();
		return update;
	}

	public List<Info> findAllInfo() {
	
		SqlSession session = sqlSessionFactory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		List<Info> infolist = mapper.select(c->c);
		for (Info info : infolist) {
			
			System.out.println(info.getTitle());
		}
		session.close();
		return infolist;
		
	}

	public boolean insertInfos(HttpServletRequest request, String title, String infos) {
		// TODO Auto-generated method stub
		
		SqlSession session = sqlSessionFactory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		Integer uid = (Integer) request.getSession().getAttribute("userId");
		System.out.println(uid);
		//Integer userId = Integer.parseInt(uid);
		//System.out.println(userId);
		
		
		Info info = new Info();
		
		info.setTitle(title);
		info.setInfos(infos);
		Date date = new Date();
		info.setTime(date);
		info.setUserId(uid);
		int result = mapper.insert(info);
		
		if(result >=1) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public Info findInfoById(String infoId) {
		
		SqlSession session = sqlSessionFactory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		
		List<Info> infos = mapper.select(c->
				c.where(InfoDynamicSqlSupport.infoId,isEqualTo(Integer.valueOf(infoId))));
		Info info = infos.get(0);
		session.close();
		return info;
	
		
	}

	public void setTimeByName(String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		int update = mapper.update(c->
				c.set(UserDynamicSqlSupport.lasttime).
				equalTo(new Date()).
				where(UserDynamicSqlSupport.username,isEqualTo(username)));
		if(update > 0) {
			System.out.println("更新成功");
		}
		session.commit();
		session.close();
	
	}

	public List<Info> findByLike(String infoName) {
		String title = "%"+infoName+"%";
		SqlSession session = sqlSessionFactory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		List<Info> infolist = mapper.select(c->c.where(InfoDynamicSqlSupport.title,isLike(title)));
		for (Info info : infolist) {
			System.out.println(info.getTitle());
		}
		session.close();
		return infolist;
	}

	
	
	
}
