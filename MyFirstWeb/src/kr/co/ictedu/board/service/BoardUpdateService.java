package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardUpdateService implements IBoardService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
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
