/*=====================================
	■■■ 변수와 자료형 ■■■
	- 퀴즈
	  사전에 부여된 반지름 정보를 통해
	  원의 넓이와 둘레를 구하는 프로그램을 작성한다.
	  반지름 : 10
=====================================*/
// ※ 문제 인식 및 분석
//	  원의 넓이 = 반지름 * 반지름 * 3.141592
//	  원의 둘레 = 반지름 * 2 * 3.141592


// 실행 예)
// 넓이 : xxxxx
// 둘레 : xxxxx
// 계속하려면 아무 키나 누르세요...


public class Test010
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용 
		/*
		int r = 10;
		double pi = 3.141592;
		double area, length;

		area = r * r * pi;
		length = r * 2 * pi;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);
		*/

		// 함께 풀이한 내용
		
		// 주요 변수 선언
		int r = 10;					//-- 반지름
		//final double PI = 3.141592;
		double pi = 3.141592;		//-- 원주율

		// ※ 키워드 『final』 : 변수의 상수화를 의미 ('final이 붙으면 상수다' 라는 것은 틀린 말이다)

		double area, length;		//-- 넓이, 둘레

		// ① 넓이 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		area = r * r * pi;


		// ② 둘레 연산
		// 원의 둘레 = 반지름 * 2 * 3.141592
		length = r * 2 * pi;

		
		// 결과 출력
		// 넓이 : xxxxx
		// 둘레 : xxxxx
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		//System.out.println("넓이 : " + area + "\n둘레 : " + length);
		//System.out.printf("넓이 : %f\n둘레 : %f\n", area, length);


	}
}

/* [실행 결과]
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/
