/*=============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- String 클래스
=============================================*/

public class Test132
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));
		//--==>> kor
		//-- 『String 클래스의 substring(s, e)』
		//    String 문자열을 대상으로
		//    s번째 에서 e-1번째까지. (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- 『String 클래스의 substring(s)』
		//    String 문자열을 대상으로
		//    s 번째에서 끝까지. (즉, 문자열이 가진 길이만큼)

		
		// ○ 문자열 데이터의 값 비교
		System.out.println(s.equals("seoul korea"));	//--==>> true
		System.out.println(s.equals("seoul Korea"));	//--==>> false
		//-- 대소문자 엄격히 구분

		System.out.println(s.equalsIgnoreCase("Seoul KoReA"));	//--==>> true
		//-- 대소문자 구분 안함


		// ○ 찾고자 하는 대상 문자열(s)에
		//    『kor』문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?

		// seoul korea
		System.out.println(s.indexOf("kor"));	//--==>> 6
		System.out.println(s.indexOf("ea"));	//--==>> 9
		System.out.println(s.indexOf("e"));		//--==>> 1		// 앞의 e를 발견하면 더이상 찾지 않음
		System.out.println(s.indexOf("tt"));	//--==>> -1		// 찾는 값이 없는 경우 다시 앞으로 돌아와서(0인덱스 전) -1 반환
		//-- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//   그 문자열의 인덱스를 반환하지만
		//   존재하지 않을 경우 음수를 반환하게 된다. (-1)


		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//    (true/false)

		// seoul korea
		System.out.println(s.endsWith("rea"));		//--==>> true		
		System.out.println(s.endsWith("oul"));		//--==>> false
		
		
		// ○ 찾고자 하는 대상 문자열(s)에
		// 『e』문자열이 존재할까?, 존재한다면 그 위치는 어떻게 될까?
		// (단, 뒤에서부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));		//--==>> 1
		System.out.println(s.indexOf("o"));		//--==>> 2
		System.out.println(s.lastIndexOf("e"));	//--==>> 9		// 스캔은 뒤에서부터 하지만 인덱스 카운팅은 앞에서 부터 함
		System.out.println(s.lastIndexOf("o"));	//--==>> 7

		
		// ○ 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?

		// seoul korea
		System.out.println(s.charAt(6));		//--==>> k
		//System.out.println(s.charAt(20));		//--==>> 에러 발생(런타임 에러)
		//-- java.lang.StringIndexOutOfBoundsException
		
		
		// ○ 대상 문자열(s)과 비교 문자열("seoul corea") 중
		//    어떤 문자열이 더 큰가?
		//    두 문자열이 다르다면 차이를 확인(사전식 배열)
		System.out.println(s.compareTo("seoul corea"));	//--==>> 8
		//-- c ~ k → defghijk(8) 

		System.out.println(s.compareTo("seoul koreb")); //--==>> -1
		//-- b ~ a → a(-1)

		System.out.println(s.compareTo("seoua korea")); //--==>> 11
		//-- a ~ l → bcdefghijkl(11)

		// ○ 대상 문자열(s) 중
		//    해당 문자열을 찾아 원하는 형태로 수정
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "大韓");
		//s = "우리나라 大韓민국 大韓독립 만세"
		System.out.println("s : " + s);
		//--==>> s : 우리나라 大韓민국 大韓독립 만세

		
		// ○ 공백 제거
		s = "            사           랑            ";
		System.out.println("|" + s + "|");
		//--==>> |            사           랑            |

		System.out.println("|" + s.trim() + "|");
		//--==>> |사           랑|
		//-- 양쪽 끝단 가장자리 공백 제거

		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>> |사랑|
		
		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678

		System.out.println();
		
		s = String.format("%d", n); // 문자열 형태로 반환하는 메소드, static 메소드(클래스 메소드)
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n);
		System.out.println(s);
		//--==>> 2,345,678

		double p = 3.141592;
		s = String.format("%f", p);
		System.out.println(s);
		//--==>> 3.141592

		s = String.format("%.2f", p);
		System.out.println(s);
		//--==>> 3.14

		String[] strArray = "기본,열정,배려".split(",");	// {"기본", "열정", "배려"}
		for(String str : strArray)
			System.out.print(str + " ");
		System.out.println();
		


	}
}