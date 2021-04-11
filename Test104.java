/*================================================
	■■■ 정렬 (sort) 알고리즘 ■■■
	- 향상된 버블 정렬(Bubble Sort : 거품 정렬)
=================================================*/


/*
※ 앞서 공부한 Selection Sort나 Bubble Sort 의 성능은 같다. (반복의 횟수로 추정)
   하지만, 향상된 Bubble Sort는 대상이 되는 데이터의 구조에 따라
   일반 Bubble Sort 나 Selection Sort 보다 성능이 좋을 수 있다.

원본 데이터 = 61 15 20 22 30
			  15 20 22 30 61	-- 1회전(스왑 발생 함)		→ 다음 회전 ○
			  15 20 22 30 61    -- 2회전(스왑 발생 안함)	→ 다음 회전 Ⅹ


==> 1회전 수행... 2회전 수행... 을 해보았더니
	2회전을 수행하는 과정에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	불필요한 추가 연산(회전:반복)을 수행하지 않는다.
	즉, 더 이상의 반복은 무의미 한 것으로 판단한다.

*/

public class Test104
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};
		/*
		10, 50, 20, 33, 40			→ 0 1
		======

		10, 20, 50, 33, 40			→ 1 2
			======

		10, 20, 33, 50, 40			→ 2 3
				======

		10, 20, 33, 40, 50			→ 3 4
					======

		----------------------------------- 1회전

		10, 20, 33, 40, 50			→ 0 1
		======						
			======					→ 1 2
				======				→ 2 3
	
		*/

		System.out.print("Source Data : ");
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();

		// 내가 풀이한 내용
		/*
		// 향상된 Bubble Sort 구현
		for (int i=1; i<a.length; i++)
		{
			boolean flag = false;

			// 확인
			//System.out.println("회전 " + i);

			for (int j=0; j<a.length-i; j++)
			{		
				if (a[j] > a[j+1])
				{
					flag = true;
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];	
				}	
			}
			if (flag==false)
				break;
		}
		*/


		// 함께 풀이한 내용

		int pass=0;
		boolean flag;

		do
		{
			pass++;
			flag = false;

			for (int i=0; i<a.length-pass; i++)
			{
				if (a[i]>a[i+1])
				{
					// 자리 바꾸기
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;	// 자리 바꿈이 일어났다는 사실 확인
				}
			}
		}
		while (flag);
		// 회전이 구분적으로 발생하는 동안(웅~) 스왑(자리바꿈)이 일어나지 않은 경우로
		// 더이상의 반복문 수행은 무의미한 것으로 판단


		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();

	}
}

/* [실행 결과]
Source Data : 10 50 20 33 40
Sorted Data : 10 20 33 40 50
계속하려면 아무 키나 누르십시오 . . .
*/