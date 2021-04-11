/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (while문) 실습
=====================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 : xxxx
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10 까지의 합 : xxxx
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 10
// >> 10 ~ 10 까지의 합 : 10
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, sum=0;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		
		if (a>b) // a 가 b 보다 크면 두 수를 swap
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		System.out.printf(">> %d ~ %d 까지의 합 : ", a, b);

		while(a<=b)
		{
			sum += a;
			a++;
		}
		System.out.println(sum);
		*/

		// 함께 풀이한 내용

		// ○ 주요 변수 선언 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, su1, su2, result=0;
		//-- 루프변수, 첫 번째 입력값, 두 번째 입력값, 결과값(누적합 연산 결과)

		
		// ○ 연산 및 처리
		//	· 사용자에게 안내 메세지 출력 및 입력값 담아내기
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		// 	· 누적합 연산에 들어가기 앞서
		//	  입력받은 두 수의 크기 비교 및 자리 바꿈
		//	  즉, su1 이 su2 보다 클 경우 두 수의 자리를 바꿀 수 있도록 처리

		if(su1>su2)
		{
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		n = su1;

		while(n<=su2)
		{
			result += n;
			n++;
		}		

		// ○ 결과 출력
		System.out.printf("%d ~ %d 까지의 합 : %d\n", su1, su2, result);
		
	}
}

/* [실행 결과]
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
10 ~ 20 까지의 합 : 165
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 10
10 ~ 10 까지의 합 : 10
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
2 ~ 10 까지의 합 : 54
*/
