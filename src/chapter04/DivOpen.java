package chapter04;

public class DivOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수형 나눗셈: " + 7/3);
		System.out.println("실수형 나눗셈: " + 7/3.0);
		System.out.println("복합형 나눗셈: " + 7/3.0f);
		System.out.println("복합형 나눗셈: " + 7.0f/3);
		System.out.println("복합형 나눗셈: " + 7f/3);
		System.out.println("복합형 나눗셈: " + 7.0/3.0);
		System.out.println("복합형 나눗셈: " + 7f/3);
		System.out.println("복합형 나눗셈: " + 7/(float)3);
		int n = 3;
		float n2 = 2.3f;
		int n3 = (int)n2;
		System.out.println(n+n2);

	}

}
