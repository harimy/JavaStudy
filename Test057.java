/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (for문) 실습
=====================================*/

// 1부터 100까지의 정수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// 단, for 반복문을 활용할 수 있도록 하며,
// 한 라인에 5개씩 출력할 수 있도록 한다.

// 실행 예)
//    4   8  12  16  20
//   20  28  32  36  40
//            :
//            :
// 계속하려면 아무 키나..

public class Test057
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		/*
		for(int i=1; (4*i)<=100; i++)
		{
			
			System.out.printf("%4d", 4*i); // %4d : 전체 간격을 4만큼 줌.
			if(i%5==0)
				System.out.println();

		}
		*/

		// 함께 풀이한 내용
		for(int n=4; n<=100; n+=4)
		{
			System.out.printf("%4d", n);
			if(n%(4*5)==0)			// n이 (4*5)의 배수일 때
				System.out.println();	// 개행해라
		}

	}
}

/* [실행 결과]
   4   8  12  16  20
  24  28  32  36  40
  44  48  52  56  60
  64  68  72  76  80
  84  88  92  96 100
*/