package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// 구현 클래스이기 때문에 implements를 합니다.
public class BoardWriteService implements IBoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response)
	{
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
		// get Parameter로 폼에서 쏜 데이터를 받아옵니다.
		try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String bTitle = request.getParameter("title");
		String bWriter = (String)session.getAttribute("i_s");
		String bContent = request.getParameter("content");
		// dao 생성
		BoardDAO dao = BoardDAO.getInstance();
		// VO 생성
		BoardVO board = new BoardVO();
		board.setBname(bWriter);
		board.setBtitle(bTitle);
		board.setBcontent(bContent);
		int result = dao.write(board);
		
		if(result==1) {
			System.out.println("글쓰기 정상 작동");
		} else {
			System.out.println("글쓰기 실패");
			
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
