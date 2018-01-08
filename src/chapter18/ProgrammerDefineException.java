package chapter18;

import java.io.IOException;
import java.util.Scanner;

class AgeInputException extends RuntimeException{
	public AgeInputException(){
		super("nonono");
	}
}

public class ProgrammerDefineException {
	public static void main(String[] args){
		System.out.println("나이를 입력하세요");
			int age;
			try {
				age = readAge();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("안들어와?");
				e.printStackTrace();
				
			} 
//			finally{
//				System.out.println("ddd");
//			}

	}
	
	public static int readAge() throws IOException{
		int age = -1;
		
		if(age<0){
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}
	
}
