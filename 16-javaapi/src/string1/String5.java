package string1;

public class String5 {
	
	public static void main(String[] args) {
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		//replace는 찾아바꾸기입니다.
		//.replace("찾을단어", "바꿀단어"); 순으로 입력합니다.
		
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		report = report.replace("김영수", "신우람");
		// replace --> 해당 값을 리턴만 해줄 뿐!
		// 즉, report.replace("김영수","신우람");
		// -> "안녕하세요. 리포트 보고자는 신우람, 신우람입니다." 라는 값을 리턴만 해줌.
		// report 값을 변화시켜 주진 않는다! 
		
		// so, report = report.replace(); 라고 써서 report 라는 변수에 대입시켜줘야함.
		System.out.println(report);
		
	}
}
