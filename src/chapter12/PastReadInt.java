package chapter12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PastReadInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			System.out.println(str);
			for(int i = 0; i < str.length(); i++){
				System.out.println(str.charAt(i));
			}
		}catch(Exception ex){
			
		}
	}

}
