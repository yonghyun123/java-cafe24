package chapter15;
class Speaker{
	private int volumeRate;
	
	public void showCurrentState(){
		System.out.println("볼륨크기:"+volumeRate);
	}
	public void setVolume(int vol){
		volumeRate = vol;
	}
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState(){
		super.showCurrentState();
		System.out.println("베이스 크기:"+baseRate);
	}
	public void setBaseRate(int base){
		baseRate = base;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}
