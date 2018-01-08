package chapter02;

public class UnicodeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		char ch2 = '한';
		char ch3 = 65;
		char ch4 = 54620;
		
		byte t1 = 20;	
		char t2 = 10;
		short t3 =1;
		int t4 = 30;
		long t5 = 30;
		float t6 = 30.0f;
		double t7 = 30;
		
		int a = 9/0;
		System.out.println(a);

/*
		t1 = t7;
		t2 = t7;
		t3 = t7;
		t4 = t7;
		t5 = t7;
		t6 = t7;
		
//		byte to char
//		char to byte
		t1 = t2; // x
		t2 = t1; // x
		
//		short to byte
		t1 = t3; //x
//		byte to short
		t3 = t1; //o
		
//		int to byte 
		t1 = t4; //x
//		byte to int
		t4 = t1;
		*/
		t7 = t1;
		t5 = t1;
		
		
	
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}

}
