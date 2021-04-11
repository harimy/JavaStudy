/*=============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Wrapper 클래스
=============================================*/

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//-- boxing
		Integer i2 = new Integer(i);	//-- boxing

		System.out.println(b2);			//--==>> 3
		System.out.println(i2);			//--==>> 256

		
		print(b2);
		print(i2);
		//--==>> 3
		//		 256
	}

	// Object → 데이터의 안정성 확보 문제 발생 
	// Number
	// ※ java.lang.Number 클래스(추상 클래스)는
	//    모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위 클래스)이다.
	//    b2, i2 자료형이 Number n에 넘어오면서
	//    업 캐스팅이 일어나게 된다. (Auto-Boxing 선행)
	static void print(Number n)
	{
		System.out.println(n);		// println에 Number타입의 n을 넘겨주면 Object로 다시 한 번 업캐스팅
									// 내용물은 Integer 또는 Byte 일 것이기 때문에 
									// n을 출력하기 위해 n.toString()을 실행할 때에는 
									// 각 클래스에 오버라이딩 되어있는 toString() 메소드를 호출할 것이고
									// 따라서 각 클래스에 맞는 형태로 출력되게 됨.
	}


	/*
	static void print(Object x)						// 매개변수로 Object형을 받으면 Byte나 Integer를 넘겨줘도 업캐스팅 되어 들어감.
	{
		System.out.println(String.valueOf(x));		// valueOf(Object x)는 Object가 빈값이 아닌경우 x.toString() 값을 반환

		// 테스트(위와 같은 결과)
		// System.out.println(x.toString());		// valueOf(Object x)는 x.toString()을 호출하는 것이므로 결과적으로 같은 기능 수행

	}
	*/
}