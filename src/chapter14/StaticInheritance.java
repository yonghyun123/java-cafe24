package chapter14;
class Adder{
	public static int val = 0;
	public void add(int num){
		val += num;
	}
//	public void showVal(int a){
//		System.out.println("super class");
//	}
	public void showVal(){
		System.out.println("super");
	}
	public void showVal(char c){
		System.out.println("onlyMe");
	}
	public void showVal(int c){
		System.out.println("onlyMe");
	}
}

class AdderFriend extends Adder{
	public void friendAdd(int num){
		val += num;
	}

//	public void showVal(){
//		System.out.println("overriding");
//	}
}
public class StaticInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a1 = new Adder();
		AdderFriend a2 = new AdderFriend();
		Adder a3 = new AdderFriend();
		
		a3.showVal(1);
	}

}
