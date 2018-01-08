
package chapter03;

public class ConstantInPren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1+5;
		num = 3;
		System.out.println(num);
		float num2 = 12.45f;
	
		double e1 = 7.125;
//		java에서는 원래 double로 변환시키기 때문에 그냥 float는 에러 
		float e2 = 7.125f;
		//java는 원래 int로 변환시키기 때문에 에러 
		long n2 = 15000000000000l;
		
		long n3 = 1234567890123111112l;
		int n4 = (int)n3;
		System.out.println(n3);
		System.out.println(n4);
	}
}