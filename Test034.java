/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if ~ else문 실습
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자에 해당하는 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, 조건문을 활용하여 처리할 수 있도록 하며,
// 연산의 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 	: 10
// 두 번째 정수 입력 	: 24
// 연산자 입력(+ - * /) : +

// >> 10 + 24 = 34
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 	: 5
// 두 번째 정수 입력 	: 3
// 연산자 입력(+ - * /) : /

// >> 5 / 3 = 1
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		int result;
		char c;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : "); 
		// c = (char)br.read(); 바람직 하지 않음
		c = (char)System.in.read(); 
		// 여기서는 ASCII 코드로 처리하는 System.in.read() 코드가 바람직
		
		System.out.println();

		if (c == '+')
			System.out.printf("%d + %d = %d\n", a, b, (a+b));
		else if (c == '-')
			System.out.printf("%d - %d = %d\n", a, b, (a-b));
		else if (c == '*')
			System.out.printf("%d * %d = %d\n", a, b, (a*b));
		else if (c == '/')
			System.out.printf("%d / %d = %d\n", a, b, (a/b));
		else 
			System.out.printf("잘못된 연산자를 입력하였습니다.\n");
		*/

		// 함께 풀이한 내용
		// 방식 ①
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
		{ 
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{ 
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{ 
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
			System.out.println("입력 과정에 오류가 존재합니다.");
		*/

		// 방식 ②
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.println("연산자 입력(+ - * /) : ");
		op = System.in.read();

		//"1234" → Integer.parseInt("1234") → 1234
		//"ABCD" → Integer.parseInt("ABCD") → (Ｘ)
		
		// 테스트(확인)
		System.out.println("op : " + op);
		//-- 『+』 : 43
		//   『-』 : 45
		//   『*』 : 42
		//   『/』 : 47 
		
		if (op == 43)
		{ 
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{ 
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{ 
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
			System.out.println("입력 과정에 오류가 존재합니다.");
		*/
		
		// 방식 ③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result=0;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;
		
		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

	}
}

/* [실행 결과]
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 24
연산자 입력(+ - * /) : +

10 + 24 = 34
*/

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 3
연산자 입력(+ - * /) : /

5 / 3 = 1
*/

