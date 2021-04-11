/*=====================================
	■■■ 배열(array) ■■■
	- 배열과 난수 처리
=====================================*/

// 사용자로부터 임의의 정수를 입력 받아
// 그 정수의 개수만큼 난수(1~100)를 발생시켜서 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 개수 입력 : 3
// (52 21 17 → 무작위로 발생한 정수들... → 배열에 담아내기(배열구성))
// 가장 큰 값 : 52, 가장 작은 값 : 17
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.util.Random;

public class Test090
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("발생시킬 난수의 개수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수만큼 배열방 만들기
		int[] arr = new int[size];
		
		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(100));	// 0 ~ 99
		// ※ 『Random』클래스의 『nextInt()』메소드
		//     0 ~ 매개변수로 넘겨받은 정수-1 까지의 수 중
		//  무작위 정수(난수) 1개를 발생시킨다.

		for (int i=0; i<size; i++)	// for (int i=0; i<arr.length; i++)
		{
			arr[i] = rd.nextInt(100)+1;
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();	
		
		// 직접 해보기 → 가장 큰 값과 가장 작은 값 찾아서 출력
		
		/*
		int max=arr[0];
		int	min=arr[0];

		for (int i=0; i<size; i++)
		{
			if(arr[i] > max)
			{
				arr[i] = arr[i]^max;		// 자리 바꿀 필요 없이 max, min에 담아버리기만 하면 됨
				max = max^arr[i];
				arr[i] = arr[i]^max;
			}
			
			if(arr[i] < min)
			{
				arr[i] = arr[i]^min;
				min = min^arr[i];
				arr[i] = arr[i];
			}
		}

		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);
		*/


		// 함께 풀이한 내용
		int max, min;
		max = min = arr[0];

		for(int i=1; i<size; i++)
		{
			// max와 i번째 요소의 크기 비교 → i 가 더 큰 상황 → max 에 i 대입
			if(arr[i] > max)
				max = arr[i];

			// min과 i번째 요소의 크기 비교 → min 이 더 큰 상황 → min 에 i 대입
			if(arr[i] < min)
				min = arr[i];
		}

		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

	}
}

/* [실행 결과]
발생시킬 난수의 개수 입력 : 10
  15  22  10  90  59  44  74   7  25  89
가장 큰 값 : 90, 가장 작은 값 : 7
계속하려면 아무 키나 누르십시오 . . .
*/

