package chapter06;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(square(5));
	}
	public static int square(int num){
		if(num == 1) return 1;
		return 2 * square(--num);
	}

}
