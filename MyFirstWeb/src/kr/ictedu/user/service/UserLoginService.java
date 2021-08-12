package kr.ictedu.user.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserLoginService implements IUserService {
	
	public void execute(HttpServletRequest request,
			HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			//폼에서 날린 데이터 받기
			String uid = request.getParameter("uid");
			String upw = request.getParameter("upw");
			UsersVO user = new UsersVO();
			user.setUid(uid);
			user.setUpw(upw);
			
			System.out.println("입력된 아이디 : " + uid);
			System.out.println("입력된 비밀번호 : " + upw);
			
			HttpSession session=null;
			session = request.getSession();
			
			// 그거 넣어서 dao 호출
			UsersDAO dao = UsersDAO.getInstance();
			int resultCode=dao.usersLogin(user);
			System.out.println("resultCode = "+ resultCode);
			//세션 쓰는법
			//통과시 세션 발급
			
			if(resultCode==1 ) {
			session.setAttribute("i_s", uid);
			session.setAttribute("p_s", upw);
			}
			else if(resultCode==0){
			session.setAttribute("login", "fail");
			
				
			}
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
