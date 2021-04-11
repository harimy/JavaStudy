/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문 (for문) 실습
	- 별찍기 연습
=====================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩구문을 작성하여 프로그램을 구성한다

/*
    *
   **
  ***
 ****
*****

*/

public class Test060
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=4; j>i; j--)
				System.out.print(" ");
			for(int k=0; k<i+1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}


/* [실행 결과]
    *
   **
  ***
 ****
*****
*/