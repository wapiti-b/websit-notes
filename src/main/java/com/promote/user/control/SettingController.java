package com.promote.user.control;

import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.dynamic.sql.SqlColumn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.promote.user.service.UserService;
import com.promote.website.model.User;

@Controller
@RequestMapping("/setting")
public class SettingController {

	@Resource
	private UserService service;
	
	
	@RequestMapping("/manage")
	public String setImg(HttpServletRequest request) {
		System.out.println("manage---");
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("username");
		User user = service.findByName(name);
		session.setAttribute("userMessage", user);
		return "setting";
	}
	
	@RequestMapping(value="/changePw",method = RequestMethod.GET)
	public String changePw(HttpServletRequest request) {
		
		return "changePw";
	}
	
	@RequestMapping(value="/changePw",method = RequestMethod.POST)
	public String changePw(HttpServletRequest request,
			@RequestParam("username") String username,
			@RequestParam("password1") String pw1,
			@RequestParam("password3") String pw2) {
		request.getSession().setAttribute("message", "密码错误，请重试");
		User u = new User();
		u.setUsername(username);
		u.setPassword(pw1);
		u = service.findUser(u);
		if(!username.equals(u.getUsername())) {
			request.setAttribute("message", "密码错误，请重试");
			return "changePw";
		}else {
			int result = service.updatePw(username,pw2);
			System.out.println(result);
			if(result <=0) {
				request.setAttribute("message","系统出错");
				return "changePw";
			}
			request.setAttribute("message","修改成功");
			request.getSession().removeAttribute("userId");
			request.getSession().removeAttribute("username");
			
			return "redirect:../login";
		}
		
	}
	
	
	
}
