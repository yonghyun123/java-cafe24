package chapter18;

import java.io.IOException;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HandleException().test();
	}
	
	private void test(){
		try{
			Person person = new Person("john",-10);
		}catch(IOException e){
			System.out.println("exception catched");
			e.printStackTrace();
		}finally{
			System.out.println("execute finally block");
		}
	}
	class Person{
		private String name;
		private int age;
		public Person(String name,int get) throws IOException{
			if(age<0){
				throw new IOException("invalid input age:"+age);
			}
		}
	}
	class IllegalParamException extends Exception{
		public IllegalParamException(String msg){
			super(msg);
		}
	}

}
