package chapter19;

import java.util.Arrays;

public class ObjectEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 	아주 중요한 개념이다.
		
		String str1 = "aaa";
		String str2 = new String("aaa");
		String str3 = new String("aaa");
		String str4 = "aaa";
		
		str2 = "abcd";
		System.out.println(str2);
		
		int[] arr= { 1,2,3,4,5};
		int[] arr4 = arr;
		
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		for(int i = 0; i < arr3.length; i++){
			arr3[i] = i+1;
		}
		
		System.out.println(str2 == str3); //false;
		System.out.println(str2 == str3); //false;
		System.out.println(str1.equals(str2)); //true;
		System.out.println(str1 == str4); //true;
		System.out.println(arr.equals(arr4)); //true
		System.out.println(Arrays.equals(arr, arr2)); //배열안에 들어있는 값 비교
		
	}
}
