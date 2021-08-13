package kr.ictedu.user.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserJoinService implements IUserService{
	
	public void execute(HttpServletRequest request,
			HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("i_s");
		// 로그인 되어 있다면(로그인 세션이 null이 아니라면?)
		// 로그인 화면으로 포워딩
		if(idSession!= null) {
			try {
				// 서비스 내부에서 포워딩 시키면
				// 리다이렉트가 아니기 때문에 실행됨
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp =
				request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
			// 로그인 되어 있지 않다면 join 서비스 로직 실행
		} else {
			
			String uid = request.getParameter("id");
			String upw = request.getParameter("pw");
			String uname = request.getParameter("name");
			String email = request.getParameter("email");
					
			UsersDAO dao = UsersDAO.getInstance();
			UsersVO user = new UsersVO(uid, upw, uname, email);
			
			int joinResult = dao.joinUsers(user);
			
			if(joinResult==1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		
	}
	}
	
}

