/*========================================
	■■■ 정렬 (sort) 알고리즘 ■■■
=========================================*/

// ○ 실습 문제
//    사용자로부터 여러 학생의 성적 데이터를 정수 형태로 입력받아
//    점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 박정준 90
// 이름 점수 입력(2) : 선혜연 80
// 이름 점수 입력(4) : 소서현 85
// 이름 점수 입력(3) : 심혜진 75
// 이름 점수 입력(5) : 안정미 95

//================
// 1등 안정미 95
// 2등 박정준 90
// 3등 소서현 85
// 4등 선혜연 80
// 5등 심혜진 75
//================
// 계속하려면 아무 키나...



// 방법 1. 이름배열, 점수배열을 따로 받아서 두 배열을 동시에 자리바꿈 시키기
// 방법 2. 학생 클래스를 만들어서 객체를 대상으로 처리 

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 입력: ");
		int n = sc.nextInt();

		Student[] sl = new Student[n];
		
		for (int i=0; i<n; i++)
		{
			sl[i] = new Student();
			
			System.out.printf("이름 점수 입력(%d) : ", i+1);
			sl[i].name = sc.next();
			sl[i].score = sc.nextInt();
		}

		for (int i=1; i<n; i++)
		{	
			boolean flag = false;

			for (int j=0; j<n-i; j++)
			{
				Student max = sl[j];
				if (sl[j].score < sl[j+1].score)
				{
					max = sl[j+1];
					sl[j+1] = sl[j];
					sl[j] = max;
				}
			}
			if (!flag)
				break;
		}

		System.out.printf("\n================\n");
		for (int i=0; i<n; i++)
			System.out.printf("%d등 %s %3d\n", i+1, sl[i].name, sl[i].score);
		System.out.printf("================\n");

	}
}

class Student
{
	String name;
	int score;
}

/* [실행 결과]
인원 수 입력: 5
이름 점수 입력(1) : 박정준 90
이름 점수 입력(2) : 선혜연 80
이름 점수 입력(3) : 소서현 85
이름 점수 입력(4) : 심혜진 75
이름 점수 입력(5) : 안정미 95

================
1등 안정미  95
2등 박정준  90
3등 소서현  85
4등 선혜연  80
5등 심혜진  75
================
계속하려면 아무 키나 누르십시오 . . .
*/
