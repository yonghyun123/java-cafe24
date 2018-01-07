package chapter24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class MyInfo{
	String info;
	public MyInfo(String info){
		this.info = info;
	}
	public String toString(){
		return info;
	}
}

public class Question24 {

	public static void main(String[] args) {
		
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이%d, 몸무게 %dkg입니다",24,75);
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("println.txt");
			PrintStream out = new PrintStream(os);
			out.println("제 소개를 하겠습니다.");
			out.println(mInfo);
			out.printf("나이%d, 몸무게 %dkg입니다",24,75);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
