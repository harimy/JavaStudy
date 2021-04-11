/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 실습
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		/*
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		*/
		
		// ( Ｘ )
		/* 
		if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else if(n==0)
		{
			System.out.println(n + " → 영");
		}
		else
		{
			System.out.println(n + " → 홀수");
		}
		*/

		// ( Ｘ )
		/*
		if(n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else
		{
			System.out.println(n + " → 영");
		}
		*/

		// ( Ｏ )
		/*
		if(n==0)
		{
			System.out.println(n + " → 영");
		}
		else if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else
		{
			System.out.println(n + " → 홀수");
		}
		*/

		// 조금 더 바람직한 코드 → 예상치 못한 상황에 대한 처리를 위해
		if(n==0)
		{
			System.out.println(n + " → 영");
		}
		else if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else if(n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else
		{
			System.out.println("판정이 불가능한 상황");
		}

		System.out.print("아이스크림 종류 선택(1.딸기, 2.포도) : ");
		n = Integer.parseInt(br.readLine());
	
		// 아래와 같이 작성하면 3번을 선택해도 포도가 나옴
		/*
		if(n=1)
		{
			System.out.println("딸기 아이스크림을 선택하셨습니다~!!!");
		}
		else
		{
			System.out.println("포도 아이스크림을 선택하셨습니다~!!!");
		}
		*/

		// 아래처럼 작성하면 그 외의 상황도 처리 가능
		if(n=1)
		{
			System.out.println("딸기 아이스크림을 선택하셨습니다~!!!");
		}
		else if
		{
			System.out.println("포도 아이스크림을 선택하셨습니다~!!!");
		}
		else
		{
			System.out.println("포도 딸기 이외의 아이스크림 선택 불가~!!!");
		}

		
	}

}

/* [실행 결과]
임의의 정수 입력 : 0
0 → 영
*/

/*
임의의 정수 입력 : 32
32 → 짝수
*/

/*
임의의 정수 입력 : 21
21 → 홀수
*/