package chapter19;

import java.util.ArrayList;
class Fruit{
	private String name;
	private int count;
	
	public Fruit(Fruit f){
		this.name = f.getString();
		this.count = f.getCount();
	}
	
	public Fruit(String name, int count){
		this.name = name;
		this.count = count;
	}
	
	String getString(){
		return this.name;
	}
	void setCount(int count){
		this.count = count;
	}
	int getCount(){
		return this.count;
	}
}

public class CopyTest {
	static ArrayList<Fruit> source = new ArrayList<>();
	static ArrayList<Fruit> des = new ArrayList<>();
	
	public static void initList(){
		if(source != null){
			source.clear();
			String[] str = {
					"apple","banana","cherry"
			};
			
			for(int i = 0; i < str.length; i++){
				source.add(new Fruit(str[i],i+1));
			}
		}
		
		if(des != null){
			des.clear();
		}
	}
	public static void printList(){
		System.out.println("=======source=======");
		for(Fruit item : source){
			System.out.println("source["+item.getCount()+"]: "+item.getString());
		}
		System.out.println("=======des=======");
		for(Fruit item : des){
			System.out.println("des["+item.getCount()+"]: "+item.getString());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initList();
		//제네릭 변수가 String일
//		des = source; 얕은 복사
//		des = (ArrayList<String>) source.clone(); 깊은 복사
//		des.addAll(source); 깊은 복
		
		// 제네릭 변수가 객체일때,
//		des = source;
//		des.add(new Fruit("kiwi",4));
		
		// 이방법은 제네릭 객체는 깊은복사가 되지 않아.
//		des.addAll(source);
//		des.add(new Fruit("kiwi",4));
//		
//		des.get(0).setCount(10);
		
		for(int i = 0; i < source.size();i ++){
			des.add(new Fruit(source.get(i)));
		}
		des.get(0).setCount(10);
		
		String a ="aaa";
		a.length();
		String []aStr = {
				"aaa","bbb","ccc"
		};
		int c = aStr.length;
		
//	배열을 초기화 하면 int[] ccc = new int[3] <- 숫자를 넣어주니까 인스턴스 변수에 직접 호출해주는거야 그래서 .length가 가능한거
		printList();
	}

}
