/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (while문) 실습
=====================================*/

// 1 * 2 * 3 * ... * 10

// 실행 예)
// 연산 결과 : xxxx
// 계속하려면 아무 키나...

public class Test049
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		/*
		int n=1, mul=1;
		while(n<=10)
		{
			mul *= n;
			n++;
		}
		System.out.println("연산 결과 : " + mul);
		*/

		// 함께 풀이한 내용

		int n=0, mul=1; 	// 누적곱을 담을 변수는 1로 초기화!
		while (n<10)
		{
			n++;
			mul *= n; // 누적곱 연산	
		}
		
		System.out.println("연산 결과 : " + mul);	
		
	}
}

/* [실행 결과]
연산 결과 : 3628800
*/