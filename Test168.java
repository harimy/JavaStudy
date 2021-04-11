/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
========================================*/

// Reader 실습 (Reader : 문자 기반 스트림)
// Test166.java 와 비교~!!!

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// 자바의 표준 입력 스트림(객체) → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
		//					   (변환기, 번역기 역할 수행)
		// Reader			 : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:Ctrl+z)");

		// System.in.read 는 바이트 기반의 스트림 
		// rd는 문자기반 스트림이기 때문에 rd.read()는 문자기반으로 읽어들임
		while ((data = rd.read()) != -1)
		{
			ch = (char)data;

			// print() : 문자 스트림
			//System.out.print(ch);
			//--==>> 
			/*
			문자열 입력(종료:Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			가나다라
			가나다라
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/

			// write() : OutputStream 클래스의 대표적 메소드(→ 바이트 스트림)
			System.out.write(ch);
			//--==>>
			/*
			문자열 입력(종료:Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			가나다라
			 섆|
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/
		}
		

	}
}