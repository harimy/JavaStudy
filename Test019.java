/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : java.util.Scanner
=====================================*/

// ※ 『java.util.Scanner』
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//    디폴트(default)로 사용되는 단락 문자는 공백이다.
//    작성된 다음 토큰은 『next()』 메소드를 사용,
//    다른 형태의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// ○ 주요 변수 선언
		String name;
		int kor, eng, mat, tot;

		// ○ 연산 및 처리
		System.out.print("이름, 국어, 영어, 수학 입력(『,』구분) : ");
		//-- 이유림,90,80,70
		
		// sc = new Scanner("이유림,90,80,70").useDelimiter("\\s*,\\s*");
		// sc = new Scanner("이유림,90,80,70").useDelimiter("문자열과문자열사이의 ,");
		// sc = new Scanner("이유림,90,80,70").useDelimiter("\\s* 과 \\s* 사이의 ,");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//		------------
		//	       "이유림,90,80,70"	임의의 문자열과 문자열을
		//					사용자 정의 구분자(Delimiter)를 통해 분할
		// ==> "이유림" "90" "80" "70"
		
		name = sc.next();	// "이유림"
		kor = sc.nextInt();	// 90
		eng = sc.nextInt();	// 80
		mat = sc.nextInt();	// 70

		// 총점 산출
		tot = kor + eng + mat;

		// ○ 결과 출력
		System.out.println();
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", tot);		

	}
}

/* [실행 결과]
이름, 국어, 영어, 수학 입력(『,』구분) : 이하림,90,80,70

이름 : 이하림
총점 : 240
*/
