package chapter17;
interface TV2{
	public void onTV();
}

class TVImpl2{
	public void onTV(){
		System.out.println("영상 출력 중");
	}
}
interface Computer2{
	public void dataReceive();
}
class ComputerImpl2{
	public void dataReceive(){
		System.out.println("영상 데이터 수신중");
	}
}

class IPTV2 implements Computer2, TV2{
	ComputerImpl2 comp = new ComputerImpl2();
	TVImpl2 tv = new TVImpl2();
	@Override
	public void dataReceive() {
		// TODO Auto-generated method stub
		comp.dataReceive();
	}
	public void powerOn(){
		dataReceive();
		onTV();
	}
	@Override
	public void onTV() {
		// TODO Auto-generated method stub
		tv.onTV();
	}
	
}
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV2 iptv = new IPTV2();
		iptv.powerOn();
		
		TV2 tv = iptv;
		Computer2 comp = iptv;
	}

}
