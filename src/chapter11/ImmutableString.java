package chapter11;

/**
 * @author yonghyun
 *
 */
public class ImmutableString {

	public static void main(String[] args) {
		String str = "My String";
		String str2 = "My String";
		str+="c";
		System.out.println(str+","+str2);
	}

}
