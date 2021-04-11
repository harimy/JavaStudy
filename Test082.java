/*=====================================
	■■■ 배열(array) ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적인 활용
=====================================*/

// ○ 실습 문제
// 『char』자료형의 배열을 만들어 알파벳 대문자를 채우고
//  채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다

// 실행 예)
// A B C D E F G ... W X Y Z
// 계속하려면 아무 키나...

public class Test082
{
	

	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		/*
		char[] arr = new char[26];

		for(int i=0; i<arr.length; i++)
			arr[i] = (char)(i+65);

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		*/

		// 함께 풀이한 내용
		char[] arr3 = new char[26];
		
		for(int i=0, ch=65; i<arr3.length; i++, ch++) // 반복문 초기식, 증감식에 여러 변수 사용할 수 있음
			arr3[i] = (char)ch;
			// arr3[0] = (char)65;
			// arr3[1] = (char)66;
			// arr3[2] = (char)67;
			//	:	
			// arr3[24] = (char)89;
			// arr3[25] = (char)90;
		for(int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		
		System.out.println();
	}
}

/* [실행 결과]
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
*/




