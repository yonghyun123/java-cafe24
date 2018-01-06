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
			@Override
			public void read() {
				System.out.println("Outer inst name: "+myName);
				System.out.println("myId:"+id);
			}
			
			public void write(){
				System.out.println("ddd");
			}
		}
		return new LocalClass();
	}
}
public class LocalClassTest {

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