package com.promote.article.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.stereotype.Service;

import com.promote.website.mapper.InfoDynamicSqlSupport;
import com.promote.website.mapper.InfoMapper;
import com.promote.website.model.Info;

import static org.mybatis.dynamic.sql.SqlBuilder.*;  // import MyBatis Dynamic SQL where support

import java.util.List;

@Service
public class InfoService {
	
	@Resource
	private SqlSessionFactory sqlSessionFactory;

	public void findArticleById(Integer userid,HttpServletRequest request) {
		HttpSession session = request.getSession();
		SqlSession sqlsession = sqlSessionFactory.openSession();
		InfoMapper mapper = sqlsession.getMapper(InfoMapper.class);
		
		List<Info> myInfoList = mapper.select(c->
				c.where(com.promote.website.mapper.InfoDynamicSqlSupport.userId,isEqualTo(userid)));
		
		session.setAttribute("infolist", myInfoList);
		sqlsession.close();
		
	}

	public int deleteInfoById(String infoId) {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		InfoMapper mapper = sqlsession.getMapper(InfoMapper.class);
		int result = mapper.deleteByPrimaryKey(Integer.valueOf(infoId));
		sqlsession.close();
		return result;
			
	}

	public int updateInfo(Info info) {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		InfoMapper mapper = sqlsession.getMapper(InfoMapper.class);
		int result = mapper.updateByPrimaryKey(info);
		return result;
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
	
	/*
	 * //降序 public List<Info> findAllInfoDesc() {
	 * 
	 * SqlSession session = sqlSessionFactory.openSession(); InfoMapper mapper =
	 * session.getMapper(InfoMapper.class); List<Info> infolist =
	 * mapper.select(c->c); for (Info info : infolist) {
	 * 
	 * System.out.println(info.getTitle()); } session.close(); return infolist;
	 * 
	 * }
	 * 
	 * //升序 public List<Info> findAllInfoAsc() {
	 * 
	 * SqlSession session = sqlSessionFactory.openSession(); InfoMapper mapper =
	 * session.getMapper(InfoMapper.class); List<Info> infolist =
	 * mapper.select(c->c); for (Info info : infolist) {
	 * 
	 * System.out.println(info.getTitle()); } session.close(); return infolist;
	 * 
	 * }
	 */
	
	
}
