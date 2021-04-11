/*====================================
  ■■■ 컬렉션 (Collection) ■■■
====================================*/

// Set → HashSet, TreeSet
// - 순서 (의미) 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스
   
   - java.util.TreeSet<E> 클래스는
     Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	 데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다.

	 SortedSet extends Set (SortedSet의 부모가 Set, 인터페이스는 인터페이스를 extends 한다)
	 TreeSet implements SortedSet 
*/


import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO → Value Object
// DTO → Data Transfer Object
// VO(비즈니스 로직 포함), DTO(비즈니스 로직 미포함) 는 실무적으로 분리하지는 않음. 
// DAO → Data Access Object

class GradeVO //implements Comparable<GradeVO> // GradeDTo 
{
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor, eng, mat;

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getHak()
	{
		return hak;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getKor()
	{
		return kor;
	}
	
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getEng()
	{
		return eng;
	}

	public void setMat()
	{
		this.mat = mat;
	}

	public int getMat()
	{
		return mat;
	}

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 생성자(사용자 정의 생성자 → 매개변수 없는 기본 생성자)
	GradeVO()
	{
	}

	// 추가 메소드 정의
	int getTotal()
	{
		return kor + eng + mat;
	}
	
	// 내가 풀이한 내용
	/*
	public int compareTo(GradeVO other) {
        return Integer.parseInt(getHak()) - Integer.parseInt(other.getHak());
    }
	*/
	
}



class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준 오름차순
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//--==>>    2103     김가영   90   80   70    240
		//		    2104     장서현   80   70   60    210
		//		    2105     박나현  100  100  100    300
		//		    2106     이새롬   12   23   34     69
		//		    2107     김서현   50   50   50    150


		// 총점 기준 오름차순
		//return s1.getTotal() - s2.getTotal(); //-- 오름차순 정렬
		//--==>>    2106     이새롬   12   23   34     69
		//		    2107     김서현   50   50   50    150
		//		    2104     장서현   80   70   60    210
		//		    2103     김가영   90   80   70    240
		//		    2105     박나현  100  100  100    300


		// 총점 기준 내림차순
		//return s2.getTotal() - s1.getTotal();
		//--==>>    2105     박나현  100  100  100    300
		//		    2103     김가영   90   80   70    240
		//		    2104     장서현   80   70   60    210
		//		    2107     김서현   50   50   50    150
		//		    2106     이새롬   12   23   34     69

		// 이름 기준
		//return s1.getName() - s2.getName();
		//--==>> 에러 발생(컴파일 에러)
		//return s1.getName().compareTo(s2.getName());
		//--==>>   2103     김가영   90   80   70    240
		//		   2107     김서현   50   50   50    150
		//		   2105     박나현  100  100  100    300
		//		   2106     이새롬   12   23   34     69
		//		   2104     장서현   80   70   60    210
		
	}
}



public class Test163
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// set 이라는 TreeSet 자료구조에 요소 추가 → add()
		set.add("짱구는못말려");
		set.add("아기공룡둘리");
		set.add("아따맘마");
		set.add("꼬마마법사레미");
		set.add("명탐정코난");
		set.add("심슨");
		set.add("포켓몬스터");
		set.add("은하철도999");
		set.add("미래소년코난");

		// Iterator 를 활용하여 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println("\n");
		//--==>> 꼬마마법사레미 명탐정코난 미래소년코난 심슨 아기공룡둘리 아따맘마 은하철도999 짱구는못말려 포켓몬스터

		
		// TreeSet 자료구조 인스턴스 생성

		// 내가 풀이한 내용
		/*
		TreeSet<GradeVO> ts = new TreeSet<GradeVO>();
		GradeVO s1 = new GradeVO("2103", "김가영", 90, 80, 70);
		GradeVO s2 = new GradeVO("2104", "장서현", 80, 70, 60);
		GradeVO s3 = new GradeVO("2105", "박나현", 100, 100, 100);
		GradeVO s4 = new GradeVO("2106", "이새롬", 12, 23, 34);
		GradeVO s5 = new GradeVO("2107", "김서현", 50, 50, 50);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		// 생성된 자료구조에 요소 추가
		//-- 2103 김가영 90 80 70
		//   2104 장서현 80 70 60
		//   2105 박나현 100 100 100
		//   2106 이새롬 12 23 34
		//   2107 김서현 50 50 50

		// 요소 추가된 자료구조 전체 출력
		Iterator<GradeVO> its = ts.iterator();

		while (its.hasNext())
		{
			GradeVO a = its.next();
			System.out.print(a.getHak() + " " + a.getName() + " "
							+ a.getKor() + " " + a.getEng() + " " + a.getMat());
			System.out.println();
		}
		System.out.println();

		//--==>> 2103 김가영 90 80 70
		//		 2104 장서현 80 70 60
		//		 2105 박나현 100 100 100
		//		 2106 이새롬 12 23 34
		//		 2107 김서현 50 50 50
		*/

		// 함께 풀이한 내용
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		set2.add(new GradeVO("2103", "김가영", 90, 80, 70));
		set2.add(new GradeVO("2104", "장서현", 80, 70, 60));		
		set2.add(new GradeVO("2105", "박나현", 100, 100, 100));
		set2.add(new GradeVO("2106", "이새롬", 12, 23, 34));
		set2.add(new GradeVO("2107", "김서현", 50, 50, 50));


		// 요소 추가된 자료구조 전체 출력
		Iterator<GradeVO> it2 = set2.iterator();
		
		while(it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
						, vo.getHak(), vo.getName()
						, vo.getKor(), vo.getEng(), vo.getMat()
						, vo.getTotal());
		}
		System.out.println();

	}
}