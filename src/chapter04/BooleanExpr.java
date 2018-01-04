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
//		short d = +e; 
		//although e is short, single operation + is affect a auto casting
		//So Correct is
		short d2 = (short)+e;
		System.out.println((a>b && b>c));
		
	}

}
