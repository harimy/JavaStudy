/*=====================================
  ■■■ 자바의 개요 및 특징 ■■■
  - 변수와 자료형
  - 키워드 및 식별자
======================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 171.6;  // 8바이트 실수형 
		int age = 27;			// 4바이트 정수형
		char degree = 'A';		// 2바이트 문자형

		String name = "박정준"; // 문자열 타입의 클래스 활용
		//String name = "한혜림"; 
		//--==>> 에러 발생(컴파일 에러)
		
		// ※ 스코프(가시성) 영역 안에서 변수명은 식별자~!!!
		
		//String #name = "김아별";
		//-- 『$』와 『_』를 제외한 다른 특수문자는
		//	 변수의 이름으로 활용할 수 없다.
		//	 하지만, 사용 가능한 이들 특수문자들 마저도
		//	 함부로 사용하는 것은 고려해야한다.

		String _tel = "010-1111-2222";

		String 주소 = "서울시 마포구";
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만 
		//	 실무적인 측면에서 접근한다면
		//	 절대로 한글 단어를 변수명으로 사용해서는 안된다.

		int $age = 23;

		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
		System.out.println("$age : " + $age);

	}
}

/* [실행 결과]
name : 박정준
_tel : 010-1111-2222
주소 : 서울시 마포구
$age : 23
계속하려면 아무 키나 누르십시오 . . .
*/