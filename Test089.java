/*=====================================
	■■■ 배열(array) ■■■
	- 배열의 배열(2차원 배열)
=====================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/

public class Test089
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];

		int n=1;
		for (int i=0; i<5; i++)
		{
			for (int j=i; j<5; j++)		// 대각선 기준 오른쪽
			{
				arr[i][j] = n;
				n++;
			}
			for (int k=0; k<i; k++)		// 대각선 기준 왼쪽
			{
				arr[i][k] = n;
				n++;
			}
			n=1;
		}


		for(int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		// 초기화
		for (int a=0; a<arr.length; a++)	// a → 0 1 2 3 4
		{
			for (int b=a, n=1; n<=5; n++)	// n → 1 2 3 4 5 / 1 2 3 4 5 ... 
			{								// b++ 아닌 n++ 하는 이유 → 5번을 반복시키기 위해
				arr[a][b] = n;

				b++;
				if(b==5)
					b=0;				
			}
		}

		// 배열의 배열 요소 전체 출력
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}

/* [실행 결과]
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/