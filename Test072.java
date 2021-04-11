/*=====================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 개념 적용 및 클래스 설계 실습
=====================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과를 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
// 입력받은 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1002
// 임의의 정수 입력(1~1000) : -20
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나...

// 당장은 파일을 따로 두면 보기 불편하니까 
// 한 파일 안에 여러 개의 클래스로 만들기 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 내가 풀이한 내용
	/*
	int n, result=0;
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while(n<1 || n>1000);
		
	}

	void sum()
	{
		for(int i=1; i<=n; i++)
			result += i;
	}
	
	void print()
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, result);
	}
	*/

	int su;
	
	// ○ 입력 메소드 정의
	void input() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while(su<1 || su>1000);
	}

	// ○ 연산 메소드 정의
	int calculate()
	{	
		int result = 0;
		
		for(int i=1; i<=su; i++)
			result += i;
		
		return result;
	}
	
	// ○ 결과 출력 메소드 정의
	// >> 1 ~ 100 까지의 합 : 5050
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su, sum);
	}

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용
		/*
		Hap h = new Hap();
		
		h.input();
		h.sum();
		h.print();
		*/
		
		// 함께 풀이한 내용

		// Hap 클래스 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성한 인스턴스를 통해 입력 메소드 호출 → throws IOException 처리
		ob.input();
	
		// 생성한 인스턴스를 통해 연산 메소드 호출 → int형 결과값 반환 → 받아낼 수 있는 처리 
		int sum = ob.calculate();

		// 생성한 인스턴스를 통해 출력 메소드 호출 → 매개변수 전달 
		ob.print(sum);

	}
}

/* [실행 결과]
임의의 정수 입력(1~1000) : -10
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : 1001
임의의 정수 입력(1~1000) : 10
>> 1 ~ 10 까지의 합 : 55
*/