package chapter17;
interface Readable2{
	public int a = 0;
	public void read();
}
class OuterClass2{
	private String myName;
	
	public OuterClass2(String name) {
		this.myName = name;
	}
	
	public Readable2 createLocalClassInst(final int instId){
		return new Readable2() {
			@Override
			public void read() {
				System.out.println("Outer inst name: "+myName);
				System.out.println("Local inst Id: "+instId);	
			}
		};
	}
}

public class LocalParamAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 out = new OuterClass2("My Outer Class");
		Readable2 localInst2 = out.createLocalClassInst(111);
		localInst2.read();
	}

}
