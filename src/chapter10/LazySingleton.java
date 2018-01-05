package chapter10;
class Singleton2{
	
	private Singleton2(){
		
	}
	
	private static Singleton2 inst = null;
	
	public static Singleton2 getInstance(){
		if(inst == null){
			inst = new Singleton2();
		}
		return inst;
	}
}
public class LazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
