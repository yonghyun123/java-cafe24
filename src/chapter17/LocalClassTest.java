package chapter17;
interface Readable{
	public void read();
	public void write();
}

class OuterClass{
	private String myName;
	
	public OuterClass(String name) {
		myName = name;
	}
	
	public Readable createLocalClassInst(int id){
		
		class LocalClass implements Readable{
			private int a;
			@Override
			public void read() {
				this.a = id;
				System.out.println("Outer inst name: "+myName);
				System.out.println("myId:"+this.a);
			}
			
			public void write(){
				System.out.println("ddd");
			}
		}
		return new LocalClass();
	}
}
public class LocalClassTest extends OuterClass{

	public LocalClassTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out1 = new OuterClass("First");
		Readable localInst1 = out1.createLocalClassInst(111);
		localInst1.read();
		localInst1.write();
		
		OuterClass out2 = new OuterClass("Second");
		Readable localInst2 = out2.createLocalClassInst(222);
		localInst2.read();

	}

}
