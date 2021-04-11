/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (while문) 실습
=====================================*/

// 1부터 100까지의 정수 중에서
// 짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
// 단, 조건문은 사용하지 않도록 하며,
// while 반복문을 사용하여 작성할 수 있도록 한다.

// 실행 예)
// 1부터 100까지의 정수 중 짝수의 합 : XXXX
// 계속하려면 아무 키나...

public class Test044
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		/*
		int n=0, sum=0;
		
		while(++n<=100)
		{
			sum += ++n;
		}
		System.out.println("1부터 100까지의 정수 중 짝수의 합 : " + sum);
		*/
		
		// 함께 풀이한 내용
		int n=2, sum=0;
		while(n<=100)
		{
			sum += n;
			n += 2;
		}
		System.out.println("1부터 100까지의 정수 중 짝수의 합 : " + sum);
	}
}

/* [실행 결과]
1부터 100까지의 정수 중 짝수의 합 : 2550
*/