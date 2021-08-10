package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardDetailService implements IBoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		
		//url 에 묻어온 글 번호를  getParameter 를 이용해 얻습니다. 
		String bId = request.getParameter("bid"); 
								
		// DAO 를 생성합니다
		BoardDAO dao = BoardDAO.getInstance();
		
		// DAO 에 글 번호를 넘겨서 detail 페이지 데이터를 얻어옵니다.
		BoardVO board = dao.getBoardDetail(bId);
		// 포워딩을 위해 setAttribute()로 데이터를 실어줍니다.
		request.setAttribute("board", board);
		
		
	}
}
