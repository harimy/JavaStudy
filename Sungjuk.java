import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

public class Sungjuk
{
	// 내가 풀이한 내용
	/*
	int n;
	String[] subj = {"국어", "영어", "수학"};
	Record[] r;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100);

		r = new Record[n];
	}

	

	void inputData() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i=0; i<n; i++)
		{
			r[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			r[i].name = br.readLine();

			for (int j=0; j<3; j++)
			{
				System.out.printf("%s 점수 : ", subj[j]);
				r[i].score[j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println();

	}

	void cal()
	{
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<3; j++)
			{
				r[i].tot += r[i].score[j];	// 총합 계산
			}
			r[i].avg = r[i].tot/3.0;		// 평균 계산
		}
	}

	void rank()
	{
		for (int i=0; i<n; i++)
		{
			r[i].rank = 1;
			for (int j=0; j<n; j++)
			{
				if (r[i].avg<r[j].avg)
					r[i].rank++;
			}
		}
	}

	void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%s ", r[i].name);
			for (int j=0; j<3; j++)
			{
				System.out.printf("%d ", r[i].score[j]);
			}
			System.out.printf("%d %.2f %4d\n", r[i].tot, r[i].avg, r[i].rank);
		}
	}
	*/


	// 함께 풀이한 내용
	// 속성 : 인원수, Record 형태의 배열
	// 주요 속성 구성
	int inwon;			//-- 인원 수
	Record[] recArr;	//-- Record 배열
						//   (학생 1명 당 Record 배열방 1 개 활용)

	// 기능 : 인원 수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
	// 메소드 정의
	// ① 인원 수 입력
	void set()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
			
		// check
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것이지, Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];
		
	}

	// 메소드 정의
	// ② 상세 데이터 입력 + ③ 총점/평균 산출
	void input()
	{
		Scanner sc = new Scanner(System.in);
		String[] subTitle = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		for (int i=0; i<inwon; i++)			//	 인원 수 만큼 반복 (inwon == recArr.length)
		{
			// Record 클래스 기반의 인스턴스 생성
			recArr[i]= new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			recArr[i].name = sc.next();

			/*
			System.out.print("국어 점수 : ");
			recArr[i].score[0] = sc.nextInt();
			recArr[i].tot += recArr[i].score[0];

			System.out.print("영어 점수 : ");
			recArr[i].score[1] = sc.nextInt();
			recArr[i].tot += recArr[i].score[1];

			System.out.print("수학 점수 : ");
			recArr[i].score[2] = sc.nextInt();
			recArr[i].tot += recArr[i].score[2];
			*/
			for (int j=0; j<subTitle.length; j++)	// 0 1 2
			{
				// 안내 메세지 출력
				System.out.print(subTitle[j]);
				
				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j] = sc.nextInt();

				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 그 과정에서 총점 누적하기
				recArr[i].tot += recArr[i].score[j];
			}
			
			// 평균 산출하기
			recArr[i].avg = recArr[i].tot / 3.0;


		}

	}//end input()


	// 메소드 정의
	// ④ 결과 출력

	public void print()
	{
		// 석차 산출 메소드 호출구문 추가

		ranking();

		// 개행
		System.out.println();

		// 학생 1인당 반복 출력 구문
		for (int i=0; i<inwon; i++)	//-- 학생 인원 수 만큼 반복
		{
			// 이름 출력
			System.out.printf("%5s", recArr[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)	// 0 1 2 → 국어 영어 수학
				System.out.printf("%4d", recArr[i].score[j]);

			// 총점, 평균 출력
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);

			// 석차 출력 구문 추가~!!!
			System.out.printf("%5d", recArr[i].rank);

			// 개행
			System.out.println();

		}
	}//end print()

	// 메소드 추가 정의
	// ⑤ 석차 산출
	private void ranking()
	{
		// 루프 변수
		int i, j;

		
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;		// 모든 학생들의 등수(석차)를 1로 초기화

		for (i=0; i<inwon-1; i++)		// i → 비교 기준을 설정하는 인덱스
		{
			for(j=i+1; j<inwon; j++)	// j → 비교 대상을 설정하는 인덱스
			{
				if(recArr[i].avg > recArr[j].avg) // 기준 데이터가 비교 데이터보다 크다면
				{	
					// 비교 데이터의 rank를 1만큼 증가
					recArr[j].rank++;

				}
				else if(recArr[j].avg > recArr[i].avg) // 비교 데이터가 기준 데이터보다 크다면
				{
					// 기준 데이터의 rank를 1만큼 증가
					recArr[i].rank++;
				}
			}
		}

	}

}