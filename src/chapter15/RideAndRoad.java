package chapter15;

/**
 * @author yonghyun
 *
 */
class AAA{
	public static void rideMethod(){
		System.out.println("AAA's Method");
	}
	public void loadMethod(){
		System.out.println("void Method");
	}
}
class BBB extends AAA{
//	public void rideMethod(){
//		System.out.println("BBB's Method");
//	}
	public void loadMethod(int num){
		System.out.println("int Method");
	}
}
class CCC extends BBB{
//	public void rideMethod(){
//		System.out.println("CCC's Method");
//	}
	public void loadMethod(double num){
		System.out.println("double method");
	}
}
public class RideAndRoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ref1 = new BBB();
		BBB ref2 = new CCC();
		CCC ref3 = new CCC();
		ref1.rideMethod(); //bbb
		ref2.rideMethod(); //ccc
		ref3.rideMethod(); //ccc
		
		ref1.loadMethod();
		
		ref2.loadMethod();
		ref2.loadMethod(2);
		
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
		

	}

}
