package com.promote.user.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.promote.user.service.UserService;
import com.promote.website.model.Info;

@Controller
@RequestMapping("/info")
public class InfoController {

	@Resource
	private UserService service;
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(@RequestParam("title") String title, 
			@RequestParam("infos") String infos,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		boolean result = service.insertInfos(request,title,infos);
		if(!result) {}//失败	
		return"redirect:../main";
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.GET)
	public String insert2(HttpServletRequest request) {
		if(null == request.getSession().getAttribute("userId")) {
			System.out.println("请先登录");
			return "login";
		}else {
		
		return "infoInsert";
		}
	}
	
	
	@RequestMapping(value="/display",method = RequestMethod.GET)
	public String display(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String infoId = request.getParameter("infoId");
		System.out.println(infoId);
		Info info = service.findInfoById(infoId);
		session.setAttribute("info", info);
		return "display";
	}
	
	@RequestMapping(value="/findByLike",method=RequestMethod.POST)
	public String find(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String infoName = request.getParameter("infoName");
		System.out.println(infoName);
		List<Info> infolist = service.findByLike(infoName);
		session.setAttribute("infolist", infolist);
		return "boke";
		
	}
}
