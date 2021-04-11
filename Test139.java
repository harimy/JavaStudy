/*=============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Calendar 클래스
=============================================*/

// ○ 실습 문제
//    오늘을 기준으로...
//    입력받는 날짜만큼 후의 연, 월, 일, 요일을 확인하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예)
// 오늘 날짜 : 2021-3-8 월요일
// 며칠 후의 날짜를 확인하고자 하십니까? : 200

// ========[확인 결과]========
// 200일 후 : 2021-xx-xx x요일
// ===========================
// 계속하려면 아무 키나...

// ※ 특정 날짜를 기준으로 날 수를 더하는 연산 메소드
//    『날짜객체.add(Calendar.DATE, 날 수)』 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Calendar;

import java.util.Scanner;

public class Test139
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		int n;
		
		// 오늘 날짜 출력
		Calendar today = Calendar.getInstance();
		System.out.printf("오늘 날짜 : %d-%d-%d ", today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1, today.get(Calendar.DATE));
		System.out.println(week[today.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		System.out.println("b : " + b);

		// 사용자 입력 받기
		System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
		n = Integer.parseInt(br.readLine());
		today.add(Calendar.DATE, n);
		System.out.println("b : " + b);
		
		// 결과 출력
		System.out.println("\n========[확인 결과]========");
		System.out.printf("%d일 후 : %d-%d-%d ", n, today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1, today.get(Calendar.DATE));
		System.out.println(week[today.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		System.out.println("===========================");
		*/

		// 함께 풀이한 내용
		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 인스턴스 생성
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;			//-- 사용자로부터 입력받은 날 수
		int y, m, d, w;		//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인결과 출력
		//System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1] + "요일");
		System.out.printf("오늘 날짜 : %tF %tA\n", now, now);
		//--==>> 오늘 날짜 : 2021-3-8 월요일

		do
		{
			System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// 날 수 더하기 연산
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println();
		System.out.println("=========[확인 결과]=========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		System.out.println("=============================");
		// %t : 날짜형 (옵션 F : 날짜객체의 년월일, A : 날짜객체의 요일)

	}
}

/* [실행 결과]
오늘 날짜 : 2021-3-8 월요일
며칠 후의 날짜를 확인하고자 하십니까? : 200

========[확인 결과]========
200일 후 : 2021-9-24 금요일
===========================
계속하려면 아무 키나 누르십시오 . . .
*/