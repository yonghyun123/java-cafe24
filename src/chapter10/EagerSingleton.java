package chapter10;
class Singleton{
	private int num = 0;
	private static Singleton inst= new Singleton();
	public static Singleton getInstance(){
		return inst;
	}
	
	public void addNum(int num){
		this.num += num;
	}
	public void showNum(){
		System.out.println(num);
	}
}


public class EagerSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton ins = new Singleton() 이게 안돼
		
		Singleton inst = Singleton.getInstance();
		inst.addNum(100);
		Singleton inst2 = Singleton.getInstance();
		inst2.addNum(200);
		
		inst.showNum();
		inst2.showNum();
		
	}

}
