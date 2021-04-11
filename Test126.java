/*=============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Wrapper 클래스
=============================================*/

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;		//-- 오토 박싱

		int n = 300;
		Integer wrapN = new Integer(n);	
		int n2 = wrapN;			//-- 오토 언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());		
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		//--==>> true
		//		 300
		//		 300.3

		// 테스트(비교)
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj); 
		//--==>> java.lang.Object@15db9742
		//--==>> java.lang.Object@15db9742

		// String println(Object x)
		// {
		//		toString() 활용...
		// }
		//

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		//--==>> true
		//		 300
		//		 300.3

		System.out.println(wBi);
		System.out.println(n2);
		//--==>> true
		//		 300

		System.out.println("\n-----------------------------------------\n");
		
		// Integer 클래스
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 12

		ni = Integer.parseInt("0101", 2);		// Integer.parseInt 는 메소드 오버로딩 되어 있음.
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 5 
		// 이진수로 처리

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10
		// 8진수 처리

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10
		// 16진수 처리

		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100
		
		sn = Integer.toHexString(31);			// 16진법
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f

		sn = Integer.toOctalString(31);			// 8진법
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 37

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50


		int n3 = 345;
		Integer n4 = Integer.valueOf(n3); 
		System.out.println(n4);
		//--==>> 345 
		// valueOf 는 객체형태로 반환함.

	}
}