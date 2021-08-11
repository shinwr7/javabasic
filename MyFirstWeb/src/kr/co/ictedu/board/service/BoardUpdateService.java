package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardUpdateService implements IBoardService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			String bid = request.getParameter("bid");
			String btitle = request.getParameter("btitle");
			String bcontent = request.getParameter("bcontent");
			
			BoardDAO dao = BoardDAO.getInstance();
			
			int resultCode = dao.update(bid, btitle, bcontent);
			
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
