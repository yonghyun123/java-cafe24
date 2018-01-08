package chapter04;

/**
 * @author yonghyun
 *
 */
public class BooleanExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ((25+5)+(36/4)-72)*5;
		int b = ((25*5)+(36-4)+71)/4;
		int c = (128/4)*2;
		short e = 7;
//		short d = +e; 이문장에서 +연산을 먼저 해주기 때문에 컴파일 에러  
		//although e is short, single operation + is affect a auto casting
		//So Correct is
		short d2 = (short)+e;
		System.out.println((a>b && b>c));
		
		String obj = new String("Hello");
		int num = 0;
		Float fObj = new Float(1.0);
		setValue(obj,num,fObj);
		System.out.println(obj+","+num+","+fObj);
		
	}
	static void setValue(String str, int num, Float fobj){
		str = "sex";
		str.replace("H", "h");
		str+="world";
		num = 99;
		fobj.valueOf((float)2.0);
	}

}
