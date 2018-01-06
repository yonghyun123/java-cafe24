package chapter19;

public class ObjectEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 	아주 중요한 개념이다.
		
		String str1 = "aaa";
		String str2 = new String("aaa");
		String str3 = new String("aaa");
		String str4 = "aaa";
		
		System.out.println(str2 == str3); //false;
		System.out.println(str2 == str3); //false;
		System.out.println(str1.equals(str2)); //true;
		System.out.println(str1 == str4); //true;
	}
}
