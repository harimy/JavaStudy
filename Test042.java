/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- switch문 실습
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 	: 10
// 두 번째 정수 입력	: 31
// 연산자 입력(+ - * /) : +

// >> 10 + 31 = 41
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = System.in.read();
		//-- + : 43
		//   - : 45
		//   * : 42
		//   / : 47

		switch(op)
		{
			case 43: System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
				break;
			case 45: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
				break;
			case 42: System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
				break;
			case 47: System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
				break;
			default: System.out.println("잘못된 입력"); //break;
		}
		*/

		// 함께 풀이한 내용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		// 원래는 case 에는 상수만 쓸 수 있음
		// jdk 1.5 부터 문자 타입도 쓸 수 있게 지원이 됨
		// jdk 1.7 부터는 문자열 타입도 사용 가능 ★
		switch (op)
		{
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*': result = a*b; break;
			case '/': result = a/b; break;
			default : return; //-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}
		// ※ 『return』: 1. 값의 반환
		// 		 2. 메소드의 종료 
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		
	}	
}

/* [실행 결과]
첫 번째 정수 입력 : 2               
두 번째 정수 입력 : 3
연산자 입력(+ - * /) : +

>> 2 + 3 = 5
*/

/*
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 3
연산자 입력(+ - * /) : .
*/
