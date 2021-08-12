package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("i_s");
		
		if(idSession== null) {
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
		}
	try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		
		String bid = request.getParameter("bid");
		BoardDAO dao = BoardDAO.getInstance();
		
		
		int resultCode =dao.delete(bid);
		
		if(resultCode == 1 ) {
			System.out.println("글삭제 정상 작동");
		} else {
			System.out.println("글삭제 실패");
		}
		
		
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
}
}
