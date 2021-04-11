/*===============================
	■■■ 클래스 고급 ■■■
	- 인터페이스(Interface)
=================================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2104256 박민지
// 국어 영어 수학 점수 입력	  (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2104257 김서현
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 2104256 박민지  90 100  85		275		 91
//                 수  수  우
// 2104256 김서현  85  70  85		220		 73
//                 우  미  양

// 계속하려면 아무 키나...

// 90 ~ 100 : 수
// 80 ~  89 : 우
// 70 ~  79 : 미
// 60 ~  69 : 양
// 나머지   : 가

import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// 문제해결 과정에서 설계해야 할 클래스
class SungjukImpl extends Record implements Sungjuk
{
	Record[] rc;
	int n;
	String[][] rank;
	int[][] score;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			n = sc.nextInt();

			rc = new Record[n];
			rank = new String[n][3];
			score = new int [n][3];
		}
		while (n<1 || n>10);
	}

	@Override 
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<n; i++)
		{
			rc[i] = new Record();
			
			System.out.print(i+1 + "번째 학생의 학번 이름 입력(공백 구분) : ");
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력	  (공백 구분) : ");
			score[i][0] = rc[i].kor = sc.nextInt();
			rc[i].tot += rc[i].kor;
			score[i][1] = rc[i].eng = sc.nextInt();
			rc[i].tot += rc[i].eng;
			score[i][2] = rc[i].mat = sc.nextInt();
			rc[i].tot += rc[i].mat;
			
			rc[i].avg = rc[i].tot / 3;

		}

		for (int i=0; i<n; i++)
		{
			for (int j=0; j<3; j++)
			{
				switch (score[i][j]/10)
				{
				case 10: case 9: rank[i][j] = "수"; break;
				case 8: rank[i][j] = "우"; break;
				case 7: rank[i][j] = "미"; break;
				case 6: rank[i][j] = "양"; break;
				default: rank[i][j] = "가"; break;
				}
			}
		}

	}

	@Override
	public void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%8s %4s %4d %4d %4d %8d %8d\n", rc[i].hak, rc[i].name, 
				rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			System.out.printf("\t\t");
			for (int j=0; j<3; j++)
				System.out.printf("%4s", rank[i][j]);
			System.out.println();
		}
	}
}

public class Test116
{
	public static void main(String[] args)
	{
		// check~!!!
		// Sungjuk은 인터페이스
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();

	}

}

/* [실행 결과]
 2104256  박민지   90   80  100      270       90
                   수   우   수
 2104257  김서현   85   70   65      220       73
                   우   미   양
*/