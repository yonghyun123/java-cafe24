package chapter12;

/**
 * @author yonghyun
 *
 */
class Friend{
	String myName;
	public Friend(String name){
		this.myName = name;
	}
	public String toString(){
		return "제 이름은 "+myName+"입니다";
	}
}
public class StringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend("김용현");
		System.out.println(f1);
	}

}
