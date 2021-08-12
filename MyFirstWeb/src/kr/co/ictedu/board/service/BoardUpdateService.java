package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardUpdateService implements IBoardService{
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
			
			
			BoardDAO dao = BoardDAO.getInstance();
			
			BoardVO board = new BoardVO();
			String bid = request.getParameter("bid");
			String btitle = request.getParameter("btitle");
			String bcontent = request.getParameter("bcontent");
			String bhit = request.getParameter("bhit");
			String bname = request.getParameter("bname");
			Timestamp bdate = new Timestamp(System.currentTimeMillis());
			
			board.setBid(Integer.parseInt(bid));
			board.setBtitle(btitle);
			board.setBcontent(bcontent);
			board.setBhit(Integer.parseInt(bhit));
			board.setBname(bname);
			board.setBdate(bdate);
			
			int resultCode = dao.update(board);
			
			if(resultCode==1) {
				System.out.println("업데이트 완료");
			} else {
				System.out.println("업데이트 실패");
			}
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
