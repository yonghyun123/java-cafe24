package chapter20;

import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData = "I love sex";
		StringTokenizer st = new StringTokenizer(strData);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
