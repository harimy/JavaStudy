/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : System.in.read()
=====================================*/

/*
※ 『System.in.read()』 메소드는 한 문자만 가져온다.
  단, 하나의 문자를 입력받아 입력받은 문자의 ASCII Code 값을 반환하게 된다.
*/ 

// 실행 예)
// 한 문자 입력 : G
// 한 자리 정수 입력 : 7

// >> 입력한 문자 : G
// >> 입력한 정수 : 7
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		char c;
		int i;
		
		System.out.print("한 문자 입력 : ");
		c = (char)System.in.read();
		
		System.out.
		
		System.out.print("한 자리 정수 입력 : ");
		i = System.in.read();

		System.out.println();
		System.out.println(">> 입력한 문자 : " + c);
		System.out.println(">> 입력한 정수 : " + i);
		*/

		// ○ 주요 변수 선언
		char ch;
		int n;

		// ○ 연산 및 처리
		// · 사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");		// G → 71
		
		// 한 문자 입력 : 'G' + 엔터
		//                     --------------
		//                      ← + ↓   ==>   \r + \n

		// · 사용자 입력값을 문자형으로 변환한 후 변수 ch에 담아내기
		ch = (char)System.in.read();

		// ※ 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기, 버리기)
		System.in.skip(2);
		//-- 두 글자를 읽지 않고 건너뛴다. (버린다.)
		
		// · 사용자에게 안내 메세지 출력
		System.out.print("한 자리 정수 입력 : ");
		
		// · 사용자 입력값을 변수 n 에 담아내기
		n = System.in.read();		// 0 → 48
						// 1 → 49
						// :
						// 7 → 55
						// :
						// 9 → 57
		// n을 48만큼 감소시켜라~!!!
		n -= 48; 

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 정수 : " + n);
		
	}
}

/* [실행 결과]
한 문자 입력 :  T
한 자리 정수 입력 : 8

>> 입력한 문자 : T
>> 입력한 정수 : 8
*/
