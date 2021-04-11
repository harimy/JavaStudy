/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (while문) 실습
=====================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지 정수의 합 : xxxx
// >> 1 ~ 284 까지 짝수의 합 : xxxx
// >> 1 ~ 284 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0, num;
		int sum=0, even=0, odd=0;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		while(n<=num)
		{
			sum += n;
			if(n%2==0)
				even += n;
			else
				odd += n;
			n++;
		}
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n", num, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n", num, even);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n", num, odd);	
	}
}

/* [실행 결과]
임의의 정수 입력 : 284
>> 1 ~ 284 까지 정수의 합 : 40470
>> 1 ~ 284 까지 짝수의 합 : 20306
>> 1 ~ 284 까지 홀수의 합 : 20164
*/