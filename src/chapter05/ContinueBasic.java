package chapter05;

public class ContinueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int count = 0;
		while(num++ < 100){
			if(num % 5 != 0 || num % 7 != 0){
				continue;
			}
			count++;
			System.out.println(num+","+count);
		}
	}

}
