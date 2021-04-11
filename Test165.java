/*====================================
  ■■■ 컬렉션 (Collection) ■■■
====================================*/

// Map - Hashtable, HashMap

// - java.util.Map 인터페이스는
//   키(key)를 값(value)에 매핑(mapping)하며,
//   동일한 키를 등록할 수 없고, 유일해야 하며,
//   각 키는 한 개의 값만을 매핑해야 한다.
//   즉, 하나의 키에 대응하는 하나의 값을 갖는 자료구조이다. 

/*
○ HashMap<K, V> 클래스
   - Hashtable → Multi thread safety
     HashMap → Multh thread unsafety

   - Hashtable 클래스와 마찬가지로 Map 인터페이스를 구현한
     HashMap 클래스의 기능은 Hashtable 클래스와 동일하지만
	 Synchronozation 이 없기 때문에 동시성 문제가 없다면
	 (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	 HashMap 을 사용하는 것이 성능을 향상시킬 수 있다.

   - 또한, HashMap 은 Hashtable 과 다르게 null 을 허용한다. 

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


public class Test165
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// HashMap 자료구조 인스턴스 생성
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map 이라는 해시맵 자료구조에 요소 추가 → put()
		map.put("드라마", "별그대");
		map.put("영화", "승리호");
		map.put("만화", "어드벤처타임");
		map.put("동화", "흥부와놀부");

		// null 입력 시도
		map.put(null, null);
		map.put("소설", null);
		map.put(null, "절규");
		//-- 위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//   마지막 null 을 key 로 매핑된 "절규"가 
		//   최초 null 을 key 로 매핑하는 null 을 덮어쓰는 상황이 발생하게 된다.
		//   즉, HashMap 은 null 을 하나의 고유한 key 값으로 간주한다.(인식한다.)

		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");

		String[] temp;
		for(String str; (str=br.readLine()) != null; )
		{
			temp = str.split(",");
			if(temp.length<2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) [종료Ctrl+z] : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}
		//--==>>
		/*
		카테고리, 타이틀 입력(컴마 구분) : 그림, 모나리자
		{그림=모나리자, 드라마=별그대, 영화=승리호, 동화=흥부와놀부, 만화=어드벤처타임}
		소설, 어린왕자
		{소설=어린왕자, 그림=모나리자, 드라마=별그대, 영화=승리호, 동화=흥부와놀부, 만화=어드벤처타임}
		드라마, 호텔 델루나
		{소설=어린왕자, 그림=모나리자, 드라마=호텔 델루나, 영화=승리호, 동화=흥부와놀부, 만화=어드벤처타임}
		만화,진격의 거인
		{소설=어린왕자, 그림=모나리자, 드라마=호텔 델루나, 영화=승리호, 동화=흥부와놀부, 만화=진격의 거인		
		*/


	}
}