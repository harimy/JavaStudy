/*=====================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- break
	  → 멈춘다. (+ 그리고 빠져나간다)
=====================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 1000 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : -10
// 임의의 정수 입력(1~1000) : 0
// 임의의 정수 입력(1~1000) : 2021
// 임의의 정수 입력(1~1000) : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까?(Y/N) : y

// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까?(Y/N) : N
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) 
	{

		// 내가 풀이한 내용
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, sum;
		char c;	
	
		while(true)
		{
			sum=0;
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
			if(n>=1 && n<=1000)
			{
				for(int i=1; i<=n; i++)
				{
					sum += i;
				}
				System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);
				System.out.print("계속하시겠습니까?(Y/N) : ");
				c = (char)System.in.read();
				System.in.skip(2);
				if(c=='Y' || c=='y')
				{
					// System.out.println("Y 입력");
					System.out.println();
					continue;
				}
				else if(c=='N' || c=='n')
				{					
					break;
				}
				else
				{
					System.out.printf("\n잘못 입력하셨습니다.(프로그램 종료)\n");
					break;
				}
			}
			else
			{
				continue;
			}

		}
		*/

		// 함께 풀이한 내용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s, i;	//-- 사용자 입력값, 누적합
		char ch;	//-- 계속 여부 입력값

		while(true)	//-- 무한 루프
		{
			do
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine());
			}
			while(n<1 || n>1000); // 반복을 수행할 조건

			// 테스트
			// System.out.println("입력한 정수 : " + n);
	
			// 초기화 위치 check~!!!
			s=0;
		
			for(i=1; i<=n; i++)
			{
				s += i;
			}

			
			// 테스트
			//System.out.println("누적합 : " + s);
			System.out.printf("\n>> 1 ~ %d 까지의 합 : %d\n", n, s);
		
			
			System.out.print("계속하시겠습니까?(Y/N) : ");
			ch = (char)System.in.read();
			

			// 테스트
			//System.out.println("계속 여부 : " + ch);

			// 입력값이 소문자 y가 아니다. → ch!='y
			// 입력값이 대문자 Y가 아니다. → ch=='Y'
			
			// SCE
			if(ch!='y' && ch!='Y')
			{
				// 반복문 → 『while(true)』을 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사 표현을 했다면
				//   그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다. (+ 그리고 빠져나간다.) check~!!
			}
			
			// 엔터값(\r\n) 추가 처리
			System.in.skip(2);
		

		} //end while(true)

	}//end main()

}//end class Test064

/* [실행 결과]
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : 2021
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : y

임의의 정수 입력(1~1000) : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : n
*/


/*
임의의 정수 입력(1~1000) : -10 
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : +

잘못 입력하셨습니다.(프로그램 종료)
*/

