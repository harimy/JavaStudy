/*=====================================
	■■■ 클래스와 인스턴스 ■■■
=====================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		CircleTest ct = new CircleTest();

		double a, l;
		
		ct.input();

		a = ct.calArea();
		l = ct.calLength();

		ct.print(a, l);
		*/

		// 함께 풀이한 내용
		CircleTest ob = new CircleTest();
		ob.input();
		double area = ob.calArea();
		double length = ob.calLength();

		ob.print(area, length);
	}
}

/* [실행 결과]
반지름 입력 : 5

>> 반지름이 5인 원의
넓이 : 78.54
둘레 : 31.42
*/