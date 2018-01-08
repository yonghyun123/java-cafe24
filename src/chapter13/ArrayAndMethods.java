package chapter13;

import chapter14.Test01;

public class ArrayAndMethods extends Test01{
	
	public void show(){
		Test01 t = new Test01();
		
	}
	
	public static int[] addAllArray(int[] ar, int addVal){
		for(int i = 0; i < ar.length; i++){
			ar[i] += addVal;
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5};
		int []ref;
		
		Test01 a = new Test01();
		
		
		ref = addAllArray(arr, 7);
		if(arr==ref)
			System.out.println("same");
		else
			System.out.println("not same");
		
		for(int i = 0; i < ref.length; i++){
			System.out.print(arr[i] + " ");
			System.out.print(ref[i]);
			System.out.println("");
		}
		for(int i : ref){
			System.out.print(i+" ");
			System.out.println();
		}
	}

}
