package com.haeyo.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haeyo.biz.user.UserService;
import com.haeyo.biz.user.UserVO;

@Controller
@SessionAttributes("user")
public class UserLoginController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/insertUser.do")
	public String insertUser(UserVO vo) {
		
//		vo = userService.uploadUser(vo)
		System.out.println(vo.getuName());
		userService.insertUser(vo);
		System.out.println("인서트유저두 컨트롤러");
		return "index";
	}
	
	@PostMapping("/login.do")
	public String login(UserVO vo, Model model) {
		System.out.println("로그인 처리");
		model.addAttribute("user", userService.getUser(vo));
		System.out.println(model);
		return "index";
	}
}
