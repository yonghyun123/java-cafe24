package chapter17;

/**
 * @author yonghyun
 *
 */
class TV{
	public void onTV(){
		System.out.println("영상 출력 중");
	}
	
}
interface Computer{
	public void dataReceive();
}
class ComputerImpl{
	public void dataReceive(){
		System.out.println("영상 데이터 수신중");
	}
}

class IPTV extends TV implements Computer{
	ComputerImpl comp = new ComputerImpl();

	@Override
	public void dataReceive() {
		// TODO Auto-generated method stub
		comp.dataReceive();
	}
	public void powerOn(){
		dataReceive();
		super.onTV();
	}
	
}
public class MultiInheriAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer comp = iptv;
	}

}
