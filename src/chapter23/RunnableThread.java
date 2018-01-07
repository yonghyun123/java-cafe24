package chapter23;
class Sum{
	private int num;
	public Sum(){
		num = 0;
	}
	public void addNum(int n){
		this.num += n;
	}
	public int getNum(){
		return this.num;
	}
}
class AdderThread implements Runnable{
	private int start;
	private int end;
	Sum sum;
	
	public AdderThread(Sum sum, int s, int e){
		this.start = s;
		this.end = e;
		this.sum = sum;
	}
	@Override
	public void run() {
		for(int i = this.start; i <= this.end; i++){
			sum.addNum(i);
		}
	}
	
}
/*
 * Thread class 정의
 *
 */
class TestThread extends Thread{
	int start;
	int end;
	int result = 0;
	
	public TestThread(int start, int end){
		this.start = start;
		this.end = end;
	}
	public void run(){
		for(int i = start; i <= end; i++){
			result += i;
		}
	}
	int getResult(){
		return result;
	}
}
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestThread t1 = new TestThread(1, 50);
//		TestThread t2 = new TestThread(51, 100);
//		
//		t1.start();
//		t2.start();
		Sum sum = new Sum();
		AdderThread at1 = new AdderThread(sum, 1, 50);
		AdderThread at2 = new AdderThread(sum, 51, 100);
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("1~100까지 합:"+(sum.getNum()));
	}

}
