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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number nInst = new Number();
		System.out.println("메소드 호출 전:"+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후:"+nInst.getNumber());
	}
	
	public static void simpleMethod(Number numb){
		numb.addNum(12);
	}
}
