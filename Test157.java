/*====================================
  ■■■ 컬렉션 (Collection) ■■■
====================================*/

// 벡터 자료구조 객체 선언 및 생성 시 사용자 정의 자료형 클래스 활용
// → 자료형으로 활용~!!!

import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용 
class MyData 
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;		//-- 이름
	private int age;			//-- 나이
	
	// getter / setter 구성
	public String getName()
	{
		return name;		
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자(인자 없는 생성자)
	public MyData()
	{
		name = "";
		age = 0;
	}
	
	// 생성자(인자 2개인 생성자)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

}

public class Test157
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();
		//-- MyData 기반으로 생성된 인스턴스만
		//   Vector 자료구조 v 에 적재하는 것이 가능!!!

		// 벡터 자료구조 v 에
		// 심혜진 16세 / 소서현 14세 / 박정준 86세
		// 담아내기

		// 내가 풀이한 내용
		/*
		MyData[] student = new MyData[3];

		student[0] = new MyData("심혜진", 16);
		student[1] = new MyData("소서현", 14);
		student[2] = new MyData("박정준", 86);

		for(MyData s : student)
			v.add(s);

		*/
		
		// 함께 풀이한 내용
		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("심혜진");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("소서현");
		st2.setAge(14);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("박정준");
		st3.setAge(86);
		v.add(st1);
		*/

		// ②
		/*
		MyData st1 = new MyData("심혜진", 16);
		v.add(st1);
		MyData st2 = new MyData("소서현", 14);
		v.add(st2);
		MyData st3 = new MyData("박정준", 86);
		v.add(st3);
		*/

		// ③
		v.add(new MyData("심혜진", 16));
		v.add(new MyData("소서현", 14));
		v.add(new MyData("박정준", 86));
		
		// 벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름:심혜진, 나이:16
		// 이름:소서현, 나이:14
		// 이름:박정준, 나이:86

		// 내가 풀이한 내용	
		for(MyData s : v)
			System.out.println("이름:" + s.getName() + ", 나이:" + s.getAge());
		System.out.println();

		// 함께 풀이한 내용
		// ①
		for(MyData obj : v)
			System.out.printf("이름:%s, 나이:%d\n", obj.getName(), obj.getAge());
		System.out.println();

		// ②
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름:%s, 나이:%d\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
		System.out.println();
		//--==>> 이름:심혜진, 나이:16
		//		 이름:소서현, 나이:14
		//		 이름:박정준, 나이:86
		
		// ③
		for(Object temp : v)		// 여기서 v 안에 있는 MyData 객체가 Object 로 업캐스팅 됐기 때문에
			System.out.printf("이름:%s, 나이:%d\n", ((MyData)temp).getName(), ((MyData)temp).getAge());		// 다운캐스팅 가능한 상황
		System.out.println();
		//--==>>이름:심혜진, 나이:16
		//		이름:소서현, 나이:14
		//		이름:박정준, 나이:86

	}
}
