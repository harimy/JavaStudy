/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- continue
	  → (뒷부분 무시하고 +) 계속해라
=====================================*/

// 홀수 누적합 연산

// 실행 예)
/*
1 : 1
3 : 4
5 : 9
7 : 16
    :
    :
99 : 2500
결과 : 2500
*/

public class Test065
{
	public static void main(String[] args) 
	{
		// 내가 풀이한 내용
		/*
		int sum=0;
		
		for(int i=0; i<=100; i++)
		{
			if(i%2==0)
				continue;
			else
			{
				sum+=i;	
				System.out.printf("%2d : %4d\n", i, sum);
			}
		}
		System.out.println("결과 : " + sum);
		*/

		// 함께 풀이한 내용

		int n=0, s=0;
		while(n<100) 	// 0 ~ 99
		{
			n++;	// 1 ~ 100
			
			if(n%2==0)
				continue;	// (뒷부분 무시하고 +) 계속해라
			s+=n;					// 뒷부분
			System.out.println(n + " : " + s);	// 뒷부분
		}
		System.out.println("결과 : " + s);

	}
}


