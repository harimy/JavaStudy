/*====================================
  ■■■ 컬렉션 (Collection) ■■■
====================================*/

// ○ 실습 문제
//    현재 작성중인 Test158 클래스를 완성하여
//    다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 이유림
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : y

	2번째 요소 입력 : 한혜림
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		이유림
		한혜림
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 이유림

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 이희주

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.
	or 정상적으로 삭제가 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 대상 입력 : 한혜림
	수정할 내용 입력 : 두혜림

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나...

*/

import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;

class VendingMachine
{
	private Vector<String> v;

	VendingMachine()
	{
		v = new Vector<String>();
	}
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("\n\t[메뉴 선택]");
			System.out.println("\t1. 요소 추가");
			System.out.println("\t2. 요소 출력");
			System.out.println("\t3. 요소 검색");
			System.out.println("\t4. 요소 삭제");
			System.out.println("\t5. 요소 변경");
			System.out.println("\t6. 종료		");
			System.out.print("\t>> 메뉴 선택(1~6) : ");
			n = sc.nextInt();
			System.out.println();
		}
		while (n<1 || n>6);

		switch (n)
		{
		case 1: add(); break;
		case 2: print(); break;
		case 3: search(); break;
		case 4: remove(); break;
		case 5: alter(); break;
		case 6: System.out.println("\t프로그램 종료"); return;
		}
	}

	public void add()
	{
		Scanner sc = new Scanner(System.in);
		
		int idx = v.size()+1;
		char yn;

		while (true)
		{
			System.out.print("\t" + idx + "번째 요소 입력 : ");
			v.add(sc.next());
			System.out.println("\t" + idx + "번째 요소 입력 성공~!!!");
			idx++;

			try
			{
				System.out.print("\t요소 입력 계속(Y/N) : ");
				yn = (char)System.in.read();
				System.out.println();
				if (yn=='y' || yn=='Y')
					continue;
				else 
					break;	
			}
			catch (Exception e)
			{
				System.out.println("\t문자 입력 오류!");
				e.printStackTrace();
			}
			
		}
		start();
	}

	public void print()
	{
		System.out.println("\t[벡터 전체 출력]");
		for(String s : v)
			System.out.println("\t    " + s);
		System.out.println("\t벡터 전체 출력 완료~!!!\n");
		start();
	}

	public void search()
	{
		Scanner sc = new Scanner(System.in);
		boolean tf;

		System.out.print("\t검색할 요소 입력 : ");
		tf = v.contains(sc.next());

		System.out.println("\n\t[검색 결과 출력]");
		if (tf)
			System.out.println("\t항목이 존재합니다.\n");
		else
			System.out.println("\t항목이 존재하지 않습니다.\n");
		
		start();
	}

	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		boolean tf;

		System.out.print("\t삭제할 요소 입력 : ");
		String s = sc.next();
		tf = v.contains(s);

		System.out.println("\n\t[삭제 결과 출력]");
		if (tf)
		{
			v.remove(s);
			System.out.println("\t정상적으로 삭제가 완료되었습니다.\n");
		}
		else
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.\n");

		start();
	}

	public void alter()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean tf;
		System.out.print("\t변경할 대상 입력 : ");
		String s = sc.next();
		tf = v.contains(s);
		if (tf)
		{
			n = v.indexOf(s);
			System.out.print("\t수정할 대상 입력 : ");
			v.set(n, sc.next());
			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.\n");
		}
		else
			System.out.println("\t존재하지 않는 요소 입력!\n");

		start();
	}

}



public class Test158_1
{
	public static void main(String[] args)
	{
		VendingMachine vm = new VendingMachine();

		vm.start();
	}
}

/*

        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 1

        1번째 요소 입력 : 이유림
        1번째 요소 입력 성공~!!!
        요소 입력 계속(Y/N) : y

        2번째 요소 입력 : 한혜림
        2번째 요소 입력 성공~!!!
        요소 입력 계속(Y/N) : n


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 2

        [벡터 전체 출력]
            이유림
            한혜림
        벡터 전체 출력 완료~!!!


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 3

        검색할 요소 입력 : 이유림

        [검색 결과 출력]
        항목이 존재합니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 4

        삭제할 요소 입력 : 이희주

        [삭제 결과 출력]
        항목이 존재하지 않아 삭제할 수 없습니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 5

        변경할 대상 입력 : 한혜림
        수정할 대상 입력 : 두혜림

        [변경 결과 출력]
        변경이 완료되었습니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종료
        >> 메뉴 선택(1~6) : 6

        프로그램 종료
계속하려면 아무 키나 누르십시오 . . .

*/