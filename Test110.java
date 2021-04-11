/*===============================
	■■■ 클래스 고급 ■■■
	- 추상 클래스(Abstract)
=================================*/

/*
○ 추상 클래스(abstract)는
   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

○ 형식 및 구조
   [접근제어지시자] abstract class 클래스명
   {
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
   }

○ 특징
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 이름 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며
   추상 클래스로 명시해서 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스 마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며
   추상 클래스를 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

※ 『abstract』 키워드는
   클래스와 메소드에서만 사용할 수 있으며
   멤버 변수나 로컬 변수에서는 사용 불가능하다.
*/

// 추상 클래스
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	// 추상 메소드(abstract)
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	// compare() 메소드는 크기 비교 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속 받는 클래스에서
	// 이 메소드를 재정의 할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if(x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}

	// swap() 메소드는 크기 비교 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속 받는 클래스에서
	// 적어도 이 메소드 만큼은 Overriding 해서 사용하지 말아라~!!!
	// 라는 의미 전달
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

}


// SortInt(추상 클래스)를 상속받은 클래스 → 추상클래스 → 추상메소드 재정의 → 일반정상클래스(안추상~)
//public abstract class Test110 extends SortInt
public class Test110 extends SortInt
{
	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	//-------------------------------------------------
	// 빈 칸 채워넣기~!!!

	// 선택정렬
	
	@Override
	protected void sorting()
	{
		for (i=0; i<data.length-1; i++)
		{
			for (j=i+1; j<data.length; j++)
			{
				if(compare(i,j)==1)
					swap(i,j);
			}
			
			// 확인
			System.out.print(i+1 + " Round Data : ");
			for(int n : data)
				System.out.print(n + " ");
			System.out.println();

		}
	}
	

	// 버블 정렬
	/*
	@Override
	protected void sorting()
	{
		for (int i=1; i<data.length; i++)
		{
			for (j=0; j<data.length-i; j++)
			{
				if(compare(j,j+1)==1)
					swap(j,j+1);
			}
		}
	}
	*/

	// 향상된 버블 정렬
	/*
	@Override
	protected void sorting()
	{
		for (int i=1; i<dataLength(); i++)
		{
			boolean flag=false;
			
			for (j=0; j<dataLength()-i; j++)
			{
				if(compare(j,j+1)==1)
				{
					swap(j,j+1);
					flag=true;
				}
			}		
			if(!flag)
				return;
			//System.out.println(i + "회전");			// 확인
		}
	}
	*/
	//-------------------------------------------------

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test110 ob = new Test110();
		ob.sort(data);
		
		System.out.print("Sorted Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();

	}
}

/* [실행 결과]
Source Data : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
계속하려면 아무 키나 누르십시오 . . .
*/