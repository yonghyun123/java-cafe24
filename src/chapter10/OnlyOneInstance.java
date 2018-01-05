package chapter10;
/**
 * @author yonghyun
 *
 */
class SimpleNumber{
	int num = 0;
	private SimpleNumber(){}
	public void addNum(int n){ num += n; }
	public void showNum(){ System.out.println(num); }
	
	private static SimpleNumber inst = null;
	public static SimpleNumber getSimpleNumberInst(){ //singleton
		if(inst == null){
			inst = new SimpleNumber();
		}
		return inst;
	}
}
public class OnlyOneInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNum(20);
		
		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
		
		num1.showNum();
		num2.showNum();
	}

}
