package chapter10;

/**
 * @author yonghyun
 *
 */
final class Circle{
//	final class는 상속을 막기 위해 만든 클래스야 별거 없
	public final static double PI = 3.1415;
	private double radius;
	
	public Circle(double rad){
		radius = rad;
	}
	
	public static void showPerimeter(){
		double peri = PI;
		System.out.println("perimeter:"+peri);
	}
	
	
}
public final class ClassVarUse {
	public final static Circle out = new Circle(3);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cl = new Circle(1.2);
		Circle.showPerimeter();
		cl.showPerimeter();
		ClassVarUse.out.showPerimeter();
//		이런 형식으로 sysout.out.println을 만든거야 다 static으로 선언하면
	}

}
