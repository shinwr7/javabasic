package kr.co.ictedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatternServlet
 */
// *.do 로 잡힌 패턴은 .do로 끝나는 접속주소를 모두 잡아옵니다. 
// 확장자 패턴은 /를 빼고 작성합니다. 
@WebServlet("*.do")
public class PatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatternServlet() {
        super();
        System.out.println("확장자 패턴 생성");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("확장자 패턴 서버 연결");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("확장자 패턴 소멸");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}
	
	// 만약 요청 메서드(get, post) 상관 없이 처리하게 만들고 싶다면
	// 메서드 하나를 더 만들어서 요청한다. 
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// doGet에 있던 모든 코드를 가져옵니다.
		
		// 확장자 패턴에서 확장자를 포함한 주소값을 가져오기 위해서
		// 아래 코드를 사용합니다.
		// 로컬호스트 8181 뒤의 uri 패턴을 잡아오는 메서드!
		String uri = request.getRequestURI();
		System.out.println("uri패턴 : "+ uri);
		
		
		// 콘솔이 아닌 사용자가 확인할 수 있도록 .jsp 화면에
		// 변수에 담긴 자료를 찍는 out.print(); 사용을 위한
		// 사전 준비
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// jsp 파일이 html 형식으로 이루어져 있음을 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if(uri.equals("/MyFirstWeb/join.do")) {
			System.out.println("회원가입 요청 확인");
		} else if(uri.equals("/MyFirstWeb/login.do")) {
			System.out.println("로그인 요청 확인");
		} else if(uri.equals("/MyFirstWeb/update.do")) {
			System.out.println("수정 요청 확인");
		} else if(uri.equals("/MyFirstWeb/delete.do")) {
			System.out.println("탈퇴 요청 확인");
			
			//게시판
		} else if(uri.equals("/MyFirstWeb/write.do")) {
			System.out.println("글쓰기 창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/update.do")) {
			System.out.println("글 수정창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/delete.do")) {
			System.out.println("글 삭제창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/select.do")) {
			System.out.println("글 조회창으로 이동합니다.");
		}else {
			out.print("잘못된 패턴입니다.");
		}
	}
	
	

}
