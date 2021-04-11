/*========================================
	■■■ 정렬 (sort) 알고리즘 ■■■
	- 선택 정렬(Selection Sort)
=========================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게, 검색하기 위함

※ 정렬은 리소스 소모가 심하다.
   (방대한 데이터를 관리하는 회사에서는 Ordered~ 정렬을 못쓰게하는 회사도 있음)

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ...

*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나...

public class Test102
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60			→ 0 1
		======

		12, 52, 42, 62, 60			→ 0 2
		==      ==

		12, 52, 42, 62, 60			→ 0 3
		==			==

		12, 52, 42, 62, 60			→ 0 4
		==				==

		----------------------------------- 1회전

		12, 42, 52, 62, 60			→ 1 2
			======

		12, 42, 52, 62, 60			→ 1 3
			==		==

		12, 42, 52, 62, 60			→ 1 4
			==			==

		----------------------------------- 2회전

		12, 42, 52, 62, 60			→ 2 3
				======
		
		12, 42, 52, 62, 60			→ 2 4
				==		==		

		----------------------------------- 3회전

		12, 42, 52, 60, 62			→ 3 4
					======		

		----------------------------------- 4회전
		*/

		// 내가 풀이한 내용
		/*
		System.out.print("Source Data :");
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					a[i]=a[i]^a[j];
					a[j]=a[j]^a[i];
					a[i]=a[i]^a[j];
				}
			}
		}

		System.out.print("Source Data :");
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		*/

		// 함께 풀이한 내용
		int i, j;
		System.out.print("Source Data : ");

		
		//for (i=0; i<a.length; i++)
		//	System.out.print(a[i] + " ");
		//System.out.println();
		

		// 향상된 for문 → forEach 구문
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Source Data : 52 42 12 62 60

		// Selection Sort 구현
		for (i=0; i<a.length-1; i++)	// i → 0 1 2 3 → 비교 기준 데이터 인덱스
		{
			//System.out.println("웅");
			for (j=i+1; j<a.length; j++)	// j → 0 - 1 2 3 4
			{							//	 → 1 - 2 3 4		
										//   → 2 - 3 4
										//   → 3 - 4

				if (a[i] > a[j])		//-- 오름차순 조건 구성
				{
					// 자리 바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}

		}

		// 결과물 출력
		System.out.print("Sorted Data : ");
		for (int n : a)
		{
			System.out.print(n+" ");
		}
		System.out.println();

	}
}


/* [실행 결과]
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/