package chapter18;

public class FinallyTest {
	public static boolean divider(int num1, int num2){
		try{
			int result = num1/num2;
			System.out.println("result:"+result);
			return true;
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally {
			System.out.println("finally expr");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean divOk = divider(4,2);
		if(divOk)
			System.out.println("ok");
		else
			System.out.println("error");
		divOk = divider(4,0);
		if(divOk)
			System.out.println("ok");
		else
			System.out.println("error");
		
	}


}
