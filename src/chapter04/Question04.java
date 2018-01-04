package chapter04;

/**
 * @author yonghyun
 *
 */
public class Question04 {

	public static void main(String[] args) {
		byte num = 7;
		// TODO Auto-generated method stub
		System.out.println(~num);// question1
		
		int num2 = 15678;
		System.out.println((num2>>2) & 1); //획기적이다
		System.out.println((num2>>4) & 1);
		
	}

}
