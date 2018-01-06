package chapter16;

/**
 * @author yonghyun
 *
 */
class Friend{
	protected String name;
	protected String phoneNum;
	protected String addr;
	
	public Friend(String name, String phone, String addr){
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	public void showData(){
		System.out.println("이름:"+name);
		System.out.println("전화:"+phoneNum);
		System.out.println("주소:"+addr);
	}
	public void shoBasicInfo(){}
}

class HighFriend extends Friend{
	String work;
	public HighFriend(String name, String phone, String addr, String job){
		super(name,phone,addr);
		this.work = job;
	}
	
	public void showData(){
		super.showData();
		System.out.println("직업:"+work);
	}
	
	public void showBasicInfo(){
		System.out.println("이름:"+ name);
		System.out.println("전화:"+ phoneNum);
	}
}
public class MyFriendInfoBook {
	protected int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
