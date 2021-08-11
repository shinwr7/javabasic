package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
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
