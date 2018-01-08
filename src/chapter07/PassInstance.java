package chapter07;


/**
 * @author yonghyun
 *
 */

class Number{ // public을 사용하는 클래스는 파일이름과 똑같은 클래스 뿐
	int num = 0;
	
	public void addNum(int n){
		num +=n;
	}
	
	public int getNumber(){
		return num;
	}
}

public class PassInstance {
	static String a ="";
	String c = "";
	static{
		a+="A";
	}
	public PassInstance(){
		a+="C";
	}
	
	{
		a+="B";
		c+="B";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		PassInstance a = new PassInstance();
		System.out.println(a.a);
		System.out.println(a.c);
		
		
		Number nInst = new Number();
		System.out.println("메소드 호출 전:"+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후:"+nInst.getNumber());
	}
	
	public static void simpleMethod(Number numb){
		numb.addNum(12);
	}
}
