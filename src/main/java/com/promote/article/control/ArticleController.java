package com.promote.article.control;

import java.util.Date;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.dynamic.sql.SqlColumn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.promote.article.service.InfoService;
import com.promote.user.service.UserService;
import com.promote.website.model.Info;
import com.promote.website.model.User;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Resource
	private InfoService service;
	
	/*
	 * @RequestMapping("/my") public String setImg(HttpServletRequest request) {
	 * System.out.println("manage---"); HttpSession session = request.getSession();
	 * String name = (String)session.getAttribute("username"); User user =
	 * service.findByName(name); //User u = user.get();
	 * session.setAttribute("userMessage", user);
	 * 
	 * 
	 * return "setting"; }
	 */
	@RequestMapping("/my")
	public String myArticla(HttpServletRequest request) {
		
		Integer userid = (Integer)request.getSession().getAttribute("userId");
		service.findArticleById(userid,request);
		
		
		return "myboke";
	}
	
	@RequestMapping("/delete")
	public String deleteInfo(HttpServletRequest request) {
		String infoId = request.getParameter("infoId");
		int tag = service.deleteInfoById(infoId);
		System.out.println(tag);
		return "redirect:my";
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(HttpServletRequest request) {
		String infoId = request.getParameter("infoId");
		Info info = service.findInfoById(infoId);
		request.getSession().setAttribute("info", info);
		return "updateboke";
	}

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update1(HttpServletRequest request,
			@RequestParam("infoId") String infoId,
			@RequestParam("title") String title, 
			@RequestParam("infos") String infos) {
		Integer userId =(Integer) request.getSession().getAttribute("userId");
		Info info = new Info();
		info.setInfoId(Integer.valueOf(infoId));
		info.setTitle(title);
		info.setTime(new Date());
		info.setInfos(infos);
		info.setUserId(userId);
		
		int result = service.updateInfo(info);
		return "redirect:my";
		
	}
	
	
}
