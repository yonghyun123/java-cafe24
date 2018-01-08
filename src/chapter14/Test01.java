package chapter14;

import chapter19.Super;

class SuperObject {
	SuperObject(){
		System.out.println("super");
	}
	public void paint(){
		draw();
	}
	public  void draw(){
		draw(); // 이게 모야 시
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject{
	static int a;
	int b;
	SubObject(){
		System.out.println("sub");
	}
	public void paint(){
		super.draw();
	}
//	public void draw(){
//		System.out.println("sub object");
//	}
}

class SubObject2 extends SubObject{
	public SubObject2() {
		System.out.println("sub2");
	}
	public void draw(){
		System.out.println("sub object2");
	}
}
public class Test01 {
	protected int test1;
	public static void main(String[] args){
		SuperObject b = new SubObject2();
		
//		b.paint();
	}
}


