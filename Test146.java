/*=====================================
  ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test145.java 파일과 비교!

class Demo2
{
	// 주요 속성 구성
	private int value;
	
	// setter
	public void setValue(int value) throws Exception
	{
		if(value<=0)
			throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
			//-- 새로운 예외 발생~!!!
			// 『throw』 : 새로운 예외를 발생시키는 것
			// 『throws』: 예외가 발생시 밖으로 던져버리는 것	
		
		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}

public class Test146
{
	public static void main(String[] args) // throws Exception
	{
		Demo2 ob = new Demo2();
		try
		{
			ob.setValue(-10);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("예외 처리하기!!!");
			System.out.println(e.toString());
		}
		
		
	}
}