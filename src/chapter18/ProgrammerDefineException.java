package chapter18;

import java.util.Scanner;

class AgeInputException extends Exception{
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
			} catch (AgeInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static int readAge() throws AgeInputException{
		Scanner key = new Scanner(System.in);
		int age = key.nextInt();
		
		if(age<0){
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}
	
}
