package chapter15;

class Box{
	public void simpleWrap(){
		System.out.println("simple wrap");
	}
	
	public void wrap(){
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box{
	public void paperWrap(){
		System.out.println("paper wrap");
	}
	
	public void wrap(){
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap(){
		System.out.println("gold wrap");
	}
	public void wrap(){
		System.out.println("gold wrap");
	}
}

class InstanceOf{
	public static void wrapBox(Box box){
		box.wrap();
	}
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		Box test1 = new GoldPaperBox();
		PaperBox test2 = (GoldPaperBox)test1;
		GoldPaperBox test3 = new GoldPaperBox();
		
		Box test4 = test3;
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
	}
}
