/*=====================================
	■■■ 배열(Array) ■■■
	- 배열의 복사
=====================================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11};
// int[] b = {3, 6, 10, 14};

// 실행 예)
/*
// 첫 번째 배열 요소를 입력하세요(공백 구분) : 2 3 7 10 11
// 두 번째 배열 요소를 입력하세요(공백 구분) : 3 6 10 14
*/

// 2 3 7 10 11 6 14
// 계속하려면 아무 키나..

import java.util.Scanner;

public class Test099
{
	public static void main(String[] args)
	{
		
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		// 내가 풀이한 내용
		/*
		int[] result = new int[a.length + b.length];

		for (int i=0; i<a.length; i++)
		{
			result[i] = a[i];
		}
		
		int index = a.length;

		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<result.length; j++)
			{
				if(b[i]==result[j])
				{
					//System.out.println("len : " + len + ", b[i] : " + b[i] +  ", result[j] : " + result[j]);
					break;
				}
				if(j==result.length-1)
				{
					//System.out.println("len : " + len + ", b[i] : " + b[i] +  ", result[j] : " + result[j]);
					result[index] = b[i];
					index++;
					break;
				}			
			}

		}

		// print
		for (int i=0; i<index; i++)
		{
			System.out.print(result[i] + " ");
		}
		System.out.println();
		*/

		// 함께 풀이한 내용 
		
		/*
		// 방법 ①
		// - 집합 a 의 전체 요소 출력
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		// - 집합 b 의 요소 출력
		//   단, 집합 b는 집합 a의 요소와 중복되는 데이터를 제거하면서 출력
		
		for (int i=0; i<b.length; i++)			// 4회전 → 3, 6, 10, 14 (선택적 출력)
		{
			boolean flag = false;				

			for (int j=0; j<a.length; j++)		// 5회전 → 2, 3, 7, 10, 11
			{
				if (b[i] == a[j])
				{
					flag = true;
					break;						// 멈춘다. 그리고 빠져나간다 (j 반복문 탈출)
				}
			}
			if (flag)							// flag가 true라면
				continue;						// 뒷부분 무시하고 계속해라

			System.out.printf("%3d", b[i]);		// 뒷부분
		}
		System.out.println();
		*/
		
		// 방법 ②
		// - 임시 배열을 만들고
		int[] temp = new int[a.length + b.length];

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		// check
		int n;							//-- 변수의 선언 위치 중요

		for (n=0; n<a.length; n++)
			temp[n] = a[n];

		
		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)
			{
				if (b[k] == a[m])
				{	
					flag = true;
					break;
				}
			}
			if(flag)
				continue;
			temp[n] = b[k];		//-- 뒷부분
			n++;				//
		}

		// - 그렇게 구성된 임시 배열을 출력(채워진 만큼)
		for (int h=0; h<n; h++)
			System.out.printf("%3d", temp[h]);
		System.out.println();

	
	}

}


/* [실행 결과]
2 3 7 10 11 6 14
계속하려면 아무 키나 누르십시오 . . .
*/