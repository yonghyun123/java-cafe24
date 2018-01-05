package chapter11;
class SimpleAdder{
	private int num;
	public SimpleAdder(){
		num = 0;
	}
	public SimpleAdder add(int num){
		this.num += num;
		return this;
	}
	
	public void showResult(){
		System.out.println("add result: "+num);
	}
}
public class SelfReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAdder a = new SimpleAdder();
		a.add(100).add(200);
		a.showResult();
	}

}
