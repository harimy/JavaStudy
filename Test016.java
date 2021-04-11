/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : printf()
=====================================*/

public class Test016
{
	public static void main(String[] args)
	{	
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』 개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』 개행
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> AAABBBCCC
		//	 1234567890123456789012345678901234567890
		//	 12345678901234567890
		//	 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//	     123
		//	        123
		//	 0000000123

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> 365
		//	 +365
		//	 +365
		
		System.out.printf("%d\n", +365);
		//--==>> 365

		System.out.printf("%d\n", -365);
		//--==>> -365

		//System.out.printf("%-d\n", 365);
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);
		//--==>> -365

		System.out.println(); // 개행

		System.out.printf("%(d\n", -365);	// check~!!!
		System.out.printf("%(d\n", 365);	// check~!!!
		//--==>> (365)
		//	 365


		//System.out.printf("%d\n", 'A');
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//	 ABCD

		System.out.println();	// 개행
		
		System.out.printf("%h\n", 365); // 16진수
		System.out.printf("%o\n", 24);	// 8진수
		//--==>> 16d
		//	 30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);

		System.out.println();

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);	// check~!!!
		System.out.printf("%.2f\n", 123.236); 	// check~!!!
		System.out.printf("%.2f\n", 123.231);	// check~!!!
		System.out.printf("%8.2f\n", 123.236);	// check~!!!
		System.out.printf("%2.2f\n", 123.1234);	// 실제 표현해야 하는 수보다 작은 수를 주면 지금 데이터 다 표현
		//--==>> 123.230000
		//	 123.23
		//	 123.24
		//	 123.23
		//	   123.24
		//	 123.12

	}
}

/* [실행 결과]
AAABBBCCC
1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365

(365)
365
A
ABCD

16d
30
true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
*/
