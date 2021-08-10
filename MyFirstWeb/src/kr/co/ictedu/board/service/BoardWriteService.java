package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// 구현 클래스이기 때문에 implements를 합니다.
public class BoardWriteService implements IBoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response)
	{
		// get Parameter로 폼에서 쏜 데이터를 받아옵니다.
		try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String bTitle = request.getParameter("title");
		String bWriter = request.getParameter("writer");
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
