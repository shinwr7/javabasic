package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO1 {
	public static void main(String[] args) throws IOException {
		//외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		//변수를 만들고 거기에 파일 경로를 적습니다.
		//main메서드에 반드시 throws IOException 을 작성해야 합니다.
		//FileOutputStream output = new FileOutputStream("c:/io/test.txt");
		
		// 간편한 사용을 위해 FileOutputStream자료형 대신
		// FileWriter 자료형을 쓸 수 있다.
		FileWriter output = new FileWriter("c:/io/test.txt");
		
		// .write("내용") 을 이용해 메모장 내부에 필기할 수 있다.
		// 단, 줄바꿈이 자동으로 안되기 때문에 줄바꿈이 필요한 부분에
		// \n을 붙이면 됩니다.
		output.write("쓰고싶은 내용 작성");
		output.write("한줄 더 작성");
		
	}
}
