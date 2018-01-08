package chapter10;

/**
 * @author yonghyun
 *
 */
class InstCnt{
	public static int instNum;
//	static으로 선언된 변수는 변수가 선언도니 클래스의 모든 인스턴스가 공유하는 변수이다.
//	static으로 선언된 변수는 메모리 공간에 하나만 존재하며, 어디서나 접근이 가능한 변수이다.
//	단 어디서나 접근이 가능하려면 static변수도 public으로 선언되어야 한다.
	
	public InstCnt(){
		instNum++;
		System.out.println("Created instance:" + instNum);
		
	}
}
public class ClassVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();	
		
		cnt1.instNum++;
		InstCnt.instNum++;
		InstCnt cnt4 = new InstCnt();// maybe 6
	}
}
