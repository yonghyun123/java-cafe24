package chapter11;

/**
 * @author yonghyun
 *
 */
public class ImmutableString {

	public static void main(String[] args) {
		String str = "My String";
		String str2 = "My String";
		String str3 = new String("My String");
		String str4 = str3;
//		str+="c";
		System.out.println(str+","+str2);
		System.out.println(str4 == str3);
		System.out.println(str3.equals(str));
		
	}

}
