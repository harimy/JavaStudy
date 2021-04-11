/*=====================================
  ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test146.java 파일과 비교!

class Demo1
{
	// 주요 속성 구성
	private int value;
	
	// setter
	public void setValue(int value)
	{
		if(value<=0)
			return;		//-- 종료 → 메소드 종료
		
		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}


public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10);
		int result = ob.getValue();
		System.out.println(result);
		//--==>> 0
		//-- value 값이 인스턴스 생성과 동시에 초기화 돼서 0값을 반환 
	}
}