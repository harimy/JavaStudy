/*===============================
	■■■ 클래스 고급 ■■■
	- 상속(Inheritance)
=================================*/

// ○ 실습
//    다음과 같은 프로그램을 구현한다.
//    단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// super class
class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
		//super();			//사실 부모클래스에서도 이미 상속을 받고 있음. 모든 클래스는 최상위 클래스인 Object를 상속받는다. 
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// sub class
class BClass extends AClass
{
	// 내가 풀이한 내용
	/*
	double result;

	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	public void calc()
	{
		if (op=='+')
			result = x + y;
		else if (op=='-')
			result = x - y;
		else if (op=='*')
			result = x * y;
		else if (op=='/')
			result = (double)x / y;
		else
		{
			System.out.println("잘못된 연산자 입력");
			return;
		}
		write(result);
	}
	*/

	// 함께 풀이한 내용
	
	BClass()
	{
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : "); // 20 15
		String temp = br.readLine();
		String[] str = temp.split("\\s");					  // 구분자 → 공백
		// ※ 문자열.split("구분자");
		//    ex) "사과 딸기 바나나 포도 수박".split(공백);
		//        반환 → 배열 → {"사과", "딸기", "바나나", "포도", "수박"};
		//    ex) "1 23 456 7".split(공백)
		//        반환 → 배열 → {"1", "23", "456", "7"};

		if (str.length != 2)
			return false;	// 값의 반환 → false 그리고 ... 메소드 종료 ~!!!
							// false(거짓)를 반환하여 메소드 종료

		// ※ 이 조건문을 수행할 경우 아래에 코드가 남아있는 상황이더라도
		//    더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다.



		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);


		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op!='+' && op!='-' && op!='*' && op!='/')  
			return false;

		return true;	// 위의 조건에 걸리지 않으면 true를 리턴하고 프로그램 종료
		*/
		
		if (op=='+' || op=='-' || op=='*' || op=='/')
			return true;

		return false;

	}//end input()

	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+': result=x+y; break;
			case '-': result=x-y; break;
			case '*': result=x*y; break;
			case '/': result=(double)x/y; break;
		}
		return result;
	}


}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		// 내가 풀이한 내용
		/*
		ob.input();
		ob.calc();
		*/

		// 함께 풀이한 내용
		
		if(!ob.input())
		{
			System.out.println("Error...");
			return;
		}
		
		double result = ob.calc();
		ob.write(result);

	}
}

/* [실행 결과]
임의의 두 정수 입력(공백 구분) : 5 3
연산자 입력(+ - * /) : /
>> 5 / 3 = 1.67
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 10 20
연산자 입력(+ - * /) : *
>> 10 * 20 = 200.00
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 5 7
연산자 입력(+ - * /) : +
>> 5 + 7 = 12.00
계속하려면 아무 키나 누르십시오 . . .
*/