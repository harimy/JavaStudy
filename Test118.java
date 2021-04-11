/*===============================
	■■■ 클래스 고급 ■■■
	- 중첩 클래스
=================================*/

// 외부 클래스
class Test
{
	static int a=10;	// 전역변수 멤버변수 static변수(클래스변수)
	int b=20;			// 전역변수 멤버변수 instance변수(인스턴스변수)

	// ▶ 첫 번째 write() 메소드
	void write()
	{
		System.out.println("write()...①");
		
		final int c=30;	// 지역변수 상수화된변수(값이 변하지 않는 변수)
		int d=40;		// 지역변수 값이 수시로 변할 수 있는 변수

		// 내부 클래스
		// 메소드 내부에 존재하는 또다른 클래스(지역클래스, local class)
		class LocalTest
		{
			// ▶ 두 번째 write() 메소드 
			void write()
			{
				System.out.println("write()...②");

				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);
				//--==>> 에러 발생(컴파일 에러) : local variables referenced from an inner class must be final or effectively final
				// d의 값을 확정지을 수 없기 때문에 접근 불가.
			}
		}
		//c=20;
		d=30;

		// 첫 번째 write() 메소드에서 생성한 지역 클래스의 인스턴스
		LocalTest ob1 = new LocalTest();

		// 두 번째 write() 메소드 호출
		ob1.write();
	}

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		// 외부 클래스에 대한 인스턴스 생성
		Test ob2 = new Test();

		// 첫 번째 write() 메소드 호출
		ob2.write();
	}
}

/* [실행 결과]
write()...①
write()...②
a : 10
b : 20
c : 30
*/