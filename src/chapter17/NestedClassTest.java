package chapter17;
/**
 * @author yonghyun
 *
 */
class OuterClassOne{
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass{
		public void simpleMethod(){
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo{
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private class NestedClass{
		public void simpleMethod(){
			System.out.println("Nested Instance Method two");
		}
	}
}
public class NestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
	}

}
