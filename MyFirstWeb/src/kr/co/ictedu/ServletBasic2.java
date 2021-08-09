package kr.co.ictedu;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ServletBasic2
 */
@WebServlet("/mango")
public class ServletBasic2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public void init(ServletConfig config) throws ServletException {
		// 요청이 들어왔을때 처음에 실행할 로직을 작성하는 부분 
		// init() 메서드는 서블릿 객체 생성시 1번 자동호출 됩니다.
		System.out.println("망고 시작");
		
	}
	
	
    public ServletBasic2() {
        super();
        System.out.println("망고 생성");
    }
    
    
    public void destroy() {
		// 소멸자 메서드, 서블릿 객체가 메모리에서 삭제될 때 호출(소멸시 1회만)
		System.out.println("망고 소멸");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식으로만 접속가능합니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// doGet, doPost 시리즈는 해당 메서드 내부에서
		// 파라미터로 선언한 request, response 내장 객체를 기본으로 
		// 쓸 수 있고, 추가로 내부에 세션이나 쿠키등을 선언해서 쓸 수도 있습니다.
		// HttpSession session;
		// HttpCookie cookie;
		// 폼에서 넘겨준 데이터 UTF-8로 인코딩
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// request.getParameter를 이용해 폼에서 날린 데이터 받기
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		// 폼에서 날려준 데이터 콘솔에 찍기
		System.out.println("이름  : "+ name);
		System.out.println("비번  : "+ pw);
	}

}
