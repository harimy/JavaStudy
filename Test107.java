/*===============================
	■■■ 클래스 고급 ■■■
	- 상속(Inheritance)
=================================*/

/*
※ 『super』 → 부모클래스의 설계도를 가리키는게 아니라 메모리에 올려진 부모 클래스의 실체를 가리키는 것

	(인스턴스 생성할 때 사용되는 것이기 때문에 static 으로 생성되는 메소드와는 상관이 없다.)
	static 으로 선언되지 않은 메소드에서 사용되며 
	현재 클래스가 상속받은 상위 클래스의 객체를 가리킨다.
	super 는 상위 클래스의 생성자를 호출하거나
	상위 클래스의 멤버 변수 또는 메소드를 호출할 때 사용할 수 있다.

	하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때에는
	하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.

// 2/26일 여기부터 설명~~ 
※  생성자와 클래스 상속간의 관계 
	
	하위 클래스는 상위 클래스의 멤버를 상속받지만,
	생성자는 상속 대상에서 제외된다.
	그리고, 하위 클래스의 생성자가 호출될 때(= 인스턴스를 생성할 때)
	자동으로 상위 클래스의 생성자가 호출된다.
	이 때, 상위 클래스의 생성자는 인수가 없는 생성자(default 생성자 형태)가 호출된다.
	
	상위 클래스 및 하위 클래스를 설계하는 과정에서
	생성자를 정의하지(작성하지) 않거나 인수가 없는 생성자만을 정의한(작성한) 경우
	명시적으로 하위 클래스에서 상위클래스의 생성자를 호출하지 않아도
	아무런 문제가 발생하지 않지만
	상위 클래스에 인자가 있는 생성자만 존재하는 경우에는 주의해야 한다.

	예를 들어 다음에서

	class A_class
	{
		A_class(int n)				// 사용자 정의 생성자가 있기 때문에 default 생성자가 만들어지지 않음
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			// super();				// 인자가 없는 생성자를 자동으로 호출하기 때문에 문제 발생 
		}
	}

	하위 클래스인 B_class 의 생성자에서
	명시적으로 A_class의 생성자를 호출하지 않으면
	자동적으로 인자가 없는 생성자를 호출한다.
	하지만, A_class 에는 인자가 있는 생성자만 존재하고
	인자가 없는 생성자는 존재하지 않기 때문에 에러 발생한다.
	따라서, B_class 생성자 선두에
	다음처럼 명시적으로 상위 클래스의 생성자를 호출해야 한다.

	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class
	{
		B_class()
		{
			super(10);				// 명시적으로 인자가 있는 생성자를 호출해야함
			...;
			...;
		}
	}

=================================================================================================
상위 클래스	  | 하위 클래스		   |결과
=================================================================================================
생성자를	  | 생성자 정의 안함   | → 가능하다.
정의하지	  | 인수가 없는 생성자 | → 가능하다.
않음		  | 인수가 있는 생성자 | → 가능하다.
-------------------------------------------------------------------------------------------------
인수가		  | 생성자 정의 안함   | → 가능하다.
없는		  | 인수가 없는 생성자 | → 가능하다.
생성자만 정의 | 인수가 있는 생성자 | → 가능하다.
-------------------------------------------------------------------------------------------------
인수가		  | 생성자 정의 안함   | → 무조건 에러 발생~!!! 
있는          | 인수가 없는 생성자 | → 상위 클래스의 해당 생성자를 호출하지 않으면 에러발생~!!!
생성자만 정의 | 인수가 있는 생성자 | → 상위 클래스의 해당 생성자를 호출하지 않으면 에러발생~!!!
=================================================================================================

※ 상속 시 주의할 사항
   
   상위 클래스에서 선언된 멤버 변수의 이름과
   하위 클래스에서 선언한 멤버 변수의 이름이 같으면
   상위 클래스의 멤버 변수는 무시된다.
   이 때, 상위 클래스의 멤버 변수를 사용하기 위해서는
   『super』 키워드를 사용한다.

   동일한 이름의 멤버 변수나 동일한 이름의 메소드가
   한 클래스 안에 선언되어 있거나 정의되는 경우 기본적으로 에러 발생한다.
   단, 메소드의 경우에는 매개변수의 개수나 타입이 다른 경우
   에러가 발생하지 않고 다른 메소드로 취급하게 된다. (Method Overloading)
   → Method Overriding 과 구분하여 개념을 정리해 둘 것~!
*/


// 부모 클래스
class SuperTest107
{
	protected double area;
	private String title;
	
	public SuperTest107()
	{
		System.out.println("SuperTest107... 인자 없는 생성자");	
	}

	public SuperTest107(String title)
	{
		this.title = title;
		System.out.println("SuperTest107... 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}

}


// SuperTest107 을 상속받는 자식 클래스
class Rect extends SuperTest107
{
	/*
	protected double area;

	public void write()
	{
		System.out.println(title + "-" + area);
	}
	*/

	Rect()
	{
		super();
	}

	private int w, h;

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		write();
	}

	@Override // metadata → 어노테이션(Annotation) JDK 1.5 
	// 이 파일을 보는 다른 사람에게, 컴파일하는 자바에게 오버라이딩 메소드라는 것을 알려주기 위함. 
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 → " + area);
	}
	// ※ 메소드 오버라이딩(Method Overriding)
	//    상위 클래스를 상속받은 하위 클래스에서
	//    상위 클래스에 정의된 메소드를 재.정.의 하는 것으로
	//    객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//    재정의(Overriding)는 반드시 상속 관계가 있어야 하며,
	//    메소드 이름, 리턴 타입, 매개변수의 개수나 타입이
	//    모두 완전히 일치해야 한다.
	//    접근제어 지시자는 원본보다 더 크게 바꾸는건 가능하지만 (default 메소드를 protected/public으로 재정의 가능) 더 작은 걸로는 불가능.
}

/* 참고 
Test070.java 파일에 Rect 클래스가 존재하기 때문에 
실행 전 컴파일을 해주지 않으면 Test070.java 파일안에 있는 Rect.class파일을 실행하게 되어서
아래와 같은 오류 발생한다는 점 알아두기

Exception in thread "main" java.lang.NoSuchMethodError: Rect.calc(II)V
        at Test107.main(Test107.java:229)

Test070.java파일안에 있는 Rect.class 파일을 기준으로 객체를 생성했는데 
그 Rect안에는 calc라는 메소드가 없어서 발생하는 오류
따라서 최대한 클래스 이름을 겹치지 않게 지어야 함. 
*/



class Circle extends SuperTest107
{
	/*
	protected double area;
	private String title;
	
	public SuperTest107()
	{
		System.out.println("SuperTest107... 인자 없는 생성자");	
	}

	public SuperTest107(String title)
	{
		this.title = title;
		System.out.println("SuperTest107... 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + "-" + area);
	}
	*/
	Circle(String title)
	{
		super(title);
	}

	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();					// 부모 클래스가 가지는 write() 메소드 호출
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test107 
{
	public static void main(String[] args)
	{
		Rect ob1 = new Rect();
		//--==>> SuperTest107... 인자 없는 생성자

		//Circle ob2 = new Circle();
		//--==>> 에러 발생(컴파일 에러)
		//-- Circle 클래스의 매개변수가 존재하는 사용자 정의 생성자로 인해 
		//   default 생성자가 삽입되지 않음.
		//   → 매개변수가 없는 생성자가 존재하지 않아 발생하게 되는 에러.

		Circle ob3 = new Circle("원");
		//--==>> SuperTest107... 문자열을 인자로 받는 생성자

		ob1.calc(10,5);
		//--==>> w : 10, h : 5
		//		 사각형 → 50.0

		ob3.calc(50);
		//--==>> 원 - 7853.9800000000005

	}
}

/* [실행 결과]
SuperTest107... 인자 없는 생성자
SuperTest107... 문자열을 인자로 받는 생성자
w : 10, h : 5
사각형 → 50.0
원 - 7853.9800000000005
계속하려면 아무 키나 누르십시오 . . .
*/