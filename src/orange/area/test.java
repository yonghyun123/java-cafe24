package orange.area;

import chapter14.Test01;
import chapter16.MyFriendInfoBook;

class Friend2 extends MyFriendInfoBook{
	public void showData(){
		num++;
	}
}

public class test extends Test01{
	test(){
		//num1 = 10;// package가 달라지면 default선언으로 된건 사용못
		num2 = 20;
	}
}
