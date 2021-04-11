import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// 내가 풀이한 내용
	/*
	int r;
	final double PI = 3.141592;
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * PI;
	}

	double calLength()
	{
		return r * 2 * PI;
	}
	
	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의\n", r);
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n", l);
	}
	*/
	
	

	// 함께 풀이한 내용
	int r;
	final double PI = 3.141592;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		double result;
		result = r * r * PI;
		return result;
	}
	
	double calLength()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}
	
	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의\n", r);
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n", l);
	}
}







