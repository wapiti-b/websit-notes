package com.promote.user.control;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.omg.CORBA.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promote.user.service.UserService;
import com.promote.website.mapper.UserDynamicSqlSupport;
import com.promote.website.mapper.UserMapper;
import com.promote.website.model.Info;
import com.promote.website.model.User;

@Controller
public class UserControl {

	@Resource
	private UserService service;
	
	@RequestMapping("/logout")
	public String logiout(HttpServletRequest request){
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		session.removeAttribute("username");
		session.removeAttribute("userId");
		service.setTimeByName(username);
		return "redirect:main";
	}
	

	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String regester(@RequestParam("username") String name, @RequestParam("password") String password,
			@RequestParam("email") String email, HttpServletRequest request){
		User user = new User();
		user.setUsername(name);
		user.setPassword(password);
		user.setEmil(email);
		user.setLasttime(new Date());
		
		if(service.insert(user)) {
			System.out.println("注册成功");
			return "login";
		}else {
			System.out.println("注册失败");
			return "register";
		}	
	}
	
	@RequestMapping("/ForgetPassword")
	public String forgetpassword(){
		System.out.println("regester------");
		return "ForgetPassword";
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("user") String name, 
			@RequestParam("password") String password,
			HttpServletRequest request) {

		HttpSession session = request.getSession();
		System.out.println("login----");
		User user = new User();
		user.setUsername(name);
		user.setPassword(password);
		user = service.findUser(user);
		
		if(name.equals(user.getUsername())) {
			session.setAttribute("username", name);
			session.setAttribute("userId",user.getUserId());
			List<Info> infolist = service.findAllInfo();
			request.getSession().setAttribute("infolist", infolist);
			System.out.println("登录成功");
			return "main";
		}else {
			request.setAttribute("result", "用户名或密码错误，请重新输入");
			System.out.println("登录失败");
			//重定向
			//return "redirect:login";
			return"login";
		}
	}
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login1(HttpServletRequest request){
		System.out.println("login_____________");

		if(request.getSession().getAttribute("userId")!=null) {
			return "main";
		}
		//测试
		return "login";
	}
	
	

	@RequestMapping("/main")
	public String main(HttpServletRequest request) {
		
		List<Info> infolist = service.findAllInfo();
		request.getSession().setAttribute("infolist", infolist);
		
		
		return "main";
	}
	
	@RequestMapping("/index")
	public String index() {
		
		return "main";
	}
	
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String register1() {
		
		return "register";
	}
	
	@RequestMapping("/boke")
	public String boke() {
		System.out.println("boke--------");
		return "boke";
	}
	
	
}
