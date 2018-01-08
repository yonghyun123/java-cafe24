package chapter09;

public class AAA {
	private AAA() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA inst = new AAA();
//		BBB inst1 = new BBB();
		
//		inst1.num = 3;
//		System.out.println(inst1.num);
	}
}

class BBB{
	protected int num;
	private BBB(){
		
	}
	public void make(){
//		AAA inst = new AAA();
		BBB inst2 = new BBB();
	}
}
/*
 * public class는 접근이 어디서든 가능하지만 default 생성자는 같은 패키지 안에서만 사용된다.
 * default class는 같은 패키지 안에서만 접근 가능하며 생성자가 public이어도 다른 패키지에서는 사용x
 * protected 변수는 상속을 하지 않았더라도 같은 패키지 안에 있으면 접근가능
 * 
 * private 생성자는 같은 패키지에서도 객체 생성 불가
 * private 생성자는 같은 클래스 내에서만 객체생성 가능
 * 
 * 
 */
 