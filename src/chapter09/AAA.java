package chapter09;

public class AAA {
	public AAA() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA inst = new AAA();
	}
}

class BBB{
	private BBB(){
		
	}
	public void make(){
//		AAA inst = new AAA();
	}
}
/*
 * public class는 접근이 어디서든 가능하지만 default 생성자는 같은 패키지 안에서만 사용된다.
 * default class는 같은 패키지 안에서만 접근 가능하며 생성자가 public이어도 다른 패키지에서는 사용x
 * 
 * private 생성자는 같은 패키지에서도 객체 생성 불가
 * 메인이 선언된 클래스 안에서만 private 생성할 수 있
 * 
 * 
 */
 