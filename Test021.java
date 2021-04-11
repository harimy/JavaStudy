/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 실수형 데이터타입 정밀도 테스트
=====================================*/

public class Test021
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		float a = 0;
		double b = 0;
		
		// ○ 연산 및 처리
		for (int i=1; i<=100000; i++)	// 반복 연산(10만 번)
		{
			a += 100000;
			b += 100000;
		}

		// ○ 결과 출력	
		System.out.println("float : " + (a/100000));
		System.out.println("double : " + (b/100000));

	}
}

/* [실행 결과]
float : 99996.055
double : 100000.0
*/

// 교훈 : 실수형 데이터는 double을 사용하자!