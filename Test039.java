/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if ~ else문 실습
=====================================*/

// ○ 과제
//   사용자로부터 임의의 알파벳 한 문자를 입력받아서 이를 판별하여
//   소문자를 입력받았을 경우... 대문자로 변환하고
//   대문자를 입력받았을 경우... 소문자로 변환하는
//   프로그램을 구현한다.

// 실행 예)
// 알파벳 한 문자 입력 : T
// >> t
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : c
// >> C
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : 6
// >> 입력 오류~!!!
// 계속하려면 아무 키나...

import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		// 알파벳 아스키코드
		// A~Z : 65~90
		// a~z : 97~122

		int n;
		char ch;

		System.out.print("알파벳 한 문자 입력: ");
		n = System.in.read();
		
		if(65<=n && n<=90) // 대문자일 경우
		{
			n += 32;
			System.out.println(">> " + (char)n);
		}
		else if(97<=n && n<=122) // 소문자일 경우
		{
			n -= 32;
			System.out.println(">> " + (char)n);
		}
		else // 알파벳이 아닌 경우 
		{
			System.out.println(">> 입력 오류~!!!");
		}

	}
}

/* [실행 결과]
알파벳 한 문자 입력: T
>> t
*/

/*
알파벳 한 문자 입력:  n
>> N
*/

/*
알파벳 한 문자 입력: 5
>> 입력 오류~!!!
*/
