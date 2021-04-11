/*=====================================
	■■■ 만년 달력 ■■■
=====================================*/
 
// ○ 다음과 같은 프로그램을 구현한다.
 
// 실행 예)
// 『연도』를 입력하세요 : 2021
// 『월』을 입력하세요   : 7
/*
	   [ 2021년 7월 ]
 
  일  월  화  수  목  금  토
=============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
=============================
계속하려면 아무 키나...
*/
 
/*
※ 문제 인식 및 분석
 
   - 서기 1년 1월 1일 : 월요일
 
   - 연도가 4의 배수이면서 100의 배수가 아니거나,
     400의 배수이면 2월은 29일(윤년),
	 나머지 2월은 28일(평년)
 
   - 2021년 7월의 달력을 그린다고 가정하면
     1.1.1 ~ 2021.6.30 까지의 전체 날 수를 구한다.
	 그 날 수에 +1 연산을 수행하면 2021년 7월 1일의 요일 확인
	 7월의 달력을 그릴 준비 완료
 
   - 요일 = 전체날수 % 7
     요일 = 0 → 일요일
	        1 → 월요일
				:
 
*/
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Test100
{
	// 내가 풀이한 내용
 
	static int y, m; // 전역변수
 
	public static void main(String[] args) throws IOException
	{
		
		// 사용자에게 연도, 월 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("『연도』를 입력하세요 : ");
		y = Integer.parseInt(br.readLine());
 
		System.out.print("『월』을 입력하세요   : ");
		m = Integer.parseInt(br.readLine());
 
		// 달력 틀 출력
		System.out.printf("\n	[ %d년 %d월 ]\n\n", y, m);
		System.out.println("  일  월  화  수  목  금  토 ");
		System.out.println("=============================");
		printCalendar();	// 같은 클래스 내부의 메소드는 클래스명 생략하고 호출 가능
		System.out.println("\n=============================");
 
	}
 
	static void printCalendar()
	{
		// 월별 말일 계산
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
 
		if ((y%4==0 && y%100!=0) || y%400==0)
			months[1] = 29; 
 
		// 일 수 계산
		int days = (y-1)*365 + (y-1)/4 - (y-1)/100 +(y-1)/400;
 
		for (int i=0; i<m-1; i++)
			days += months[i];
 
		days += 1;
 
		// 입력한 년도, 월의 1일을 인덱스로 사용
		int first = days%7; 
		int d=1;
 
		int max = months[m-1] + first;
		String[] weeks = new String[max];
 
		for (int i=0; i<max; i++)
		{
			if (i<first)
				weeks[i] = "";
			else
			{
				weeks[i] = Integer.toString(d);
				d++;
			}
		}
 
		// 달력 출력
		for (int i=0, n=0; i<max; i++)
		{
			System.out.printf(" %3s", weeks[i]);
			n++;								// 개행 기준 변수 n 
			if(n==7 && i!=max-1)				// 배열 요소 7개 출력할 때 마다 개행. 단, 마지막 요소일 때는 개행하지 않음
			{
				System.out.println();			
				n=0;							// 개행 기준 초기화
			}
		}
		
	}
 
 
	/*
	public static void main(String[] args) throws IOException
	{
		// 함께 풀이한 내용
		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 선언 및 초기화
		// 각 달이 담고있는 마지막 날짜
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
		// 확인
		//System.out.println(days.length);
		//--==>> 12
 
		// 주요 변수 선언
		int nalsu, y, m, w;		//-- 날수, 년, 월, 요일
 
		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
 
		do
		{
			System.out.print("『월』을 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		
		//------------------------------------------------- 여기까지 수행하면 유효한 연도, 월 입력한 상태
 
		// 입력받은 연도에 해당하는 2월의 마지막 날 계산
		if ((y%4==0 && y%100!=0) || y%400==0)
		{
			days[1] = 29;
		}
		else
		{
			days[1] = 28;
		}
		//-- else 구문은 현재 days 배열의 1번째 요소가 초기값이 28이기 때문에 생략 가능
		
		// 1년 1월 1일 ~ 입력받은 년도 이전 년도의 12월 31일 까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 +(y-1)/400;
		
		// 확인
		//System.out.println(nalsu);
		//--==>>
		//『연도』를 입력하세요 : 2019
		//『월』을 입력하세요   : 5
		//736572									→ 1.1.1 ~ 2018.12.31
		//계속하려면 아무 키나 누르십시오 . . .
 
		// 입력받은년도(해당년도) 1월 1일 ~ 입력한 월의 이전 월 까지의 날 수 누적 연산
		// 즉, 위의 예시에 따르면
		// 2019년 1월 1일 ~ 2019년 4월 30일 까지의 날 수를 누적하여 nalsu에 더함
		for (int i=0; i<(m-1); i++)   // i<m-1 check!
			nalsu += days[i];
 
		// 확인
		//System.out.println(nalsu);
		//--==>>
		//『연도』를 입력하세요 : 2019
		//『월』을 입력하세요   : 5
		//737179									→ 1.1.1 ~ 2019.4.30
		//계속하려면 아무 키나 누르십시오 . . .
		
		
		// 입력받은 월의 1일
		nalsu += 1;				// ++nalsu;
		// 확인
		// System.out.println(nalsu);
		//--==>
		//『연도』를 입력하세요 : 2019
		//『월』을 입력하세요   : 5
		//737180
		//계속하려면 아무 키나 누르십시오 . . .
		
 
		// 시작 요일
		w = nalsu % 7;
		// 확인
		//System.out.println(w);
		//--==>>
		
		//『연도』를 입력하세요 : 2019
		//『월』을 입력하세요   : 5
		//3								→ 수요일
		//계속하려면 아무 키나 누르십시오 . . .
		
 
		// 출력(달력 그리기)
		System.out.println();
		System.out.println("\t [ " + y + "년 " + m + "월 ]\n" );
		System.out.println("  일  월  화  수  목  금  토");		// 두 칸 공백
		System.out.println("=============================");
 
		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
			System.out.print("    ");		// 네 칸 공백
 
		// 1 찍히는 위치 확인
		//System.out.printf("%4d", 1);
 
 
		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);	
			w++;							//-- 날짜가 증가할 때마다
											//  요일도 함께 증가할 수 있도록 처리
			if (w%7==0) // 일요일마다
			{
				System.out.println(); // 개행
			}
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웄을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
 
		if(w%7!=0)
			System.out.println();
 
		System.out.println("=============================");
 
	}
	*/
 
}
 
/* [실행 결과]
『연도』를 입력하세요 : 2020
『월』을 입력하세요   : 2
 
        [ 2020년 2월 ]
 
  일  월  화  수  목  금  토
=============================
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
=============================
계속하려면 아무 키나 누르십시오 . . .
*/
 
/*
『연도』를 입력하세요 : 2021
『월』을 입력하세요   : 7
 
         [ 2021년 7월 ]
 
  일  월  화  수  목  금  토
=============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
=============================
계속하려면 아무 키나 누르십시오 . . .
*/