package chapter14;
class Adder{
	public static int val = 0;
	public void add(int num){
		val += num;
	}
}

class AdderFriend extends Adder{
	public void friendAdd(int num){
		val += num;
	}
	public void showVal(){
		System.out.println(val);
	}
}
public class StaticInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a1 = new Adder();
		AdderFriend a2 = new AdderFriend();
		
		a1.add(1);
		a2.friendAdd(2);
		AdderFriend.val += 3;
		Adder.val += 4;
		a2.showVal();
	}

}
