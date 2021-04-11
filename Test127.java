/*=============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Wrapper 클래스
=============================================*/

import java.math.BigInteger;

public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//long b1 = 123456789123456789L;
		//long c1 = 123456788123456789123456789L;

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		// ① BigInteger 클래스는 java.math 패키지 안에 들어있다.
		// ② 매개변수를 문자열 타입으로 받는다. int 나 long 보다 더 큰 수를 받는 클래스이기 때문에

		//BigInteger c = new BigInteger("123456789123456789");

		//System.out.println(a + b);
		//BigInteger c = a + b;
		//System.out.println(c);

		// ※ 일반적인 산술연산자를 통한 연산 불가능

		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈결과 : " + c);
		//--==>> 덧셈결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈결과 : " + d);
		//--==>> 뺄셈결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈결과 : " + e);
		//--==>> 곱셈결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈결과 : " + f);
		//--==>> 나눗셈결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : "+ g.pow(3));
		//--==>> 2의 3승 : 8

	}
}