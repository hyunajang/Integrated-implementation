package com.haeyo.biz.user.impl;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.haeyo.biz.user.UserService;
import com.haeyo.biz.user.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAOMybatis userDAO;

	@Autowired
	HttpSession session;
	
	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("유저서비스");
		return userDAO.getUser(vo);
	}
//	public UserVO uploadBoard(UserVO vo) throws Exception {
//		MultipartFile uploadFile = vo.getUploadFile(); //파일 업로드 객체 생성
//		System.out.println("uploadBoard() 처리 중");
//		if(!uploadFile.isEmpty()) {
//			String tPic = uploadFile.getOriginalFilename();
//			String rootPath = httpSession.getServletContext().getRealPath("/");
//			String attachPath ="/WEB-INF/boardImages/";
//			System.out.println(rootPath+attachPath+uPic);
//			uploadFile.transferTo(new File(rootPath+attachPath+uPic)); //해당 경로에 받은 이름의 파일을 만들어 저장
//			vo.settPic(uPic);
//		}
//		return vo;
//	}
}
