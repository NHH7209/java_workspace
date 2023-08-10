package ch09;

public class StringTest2 {

	public static void main(String[] args) {
		
		//StringBuilder, StringBuffer
		//멀티 쓰레드 프로그래밍 - StringBuffer
		//계속해서 바꿔서 쓰는 것이 StringBuffer이다.
		//단일 쓰레드 프로그래밍 - StringBuilder
		
		//String
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append('A');
		strBuffer.append('B');
		System.out.println(strBuffer);
		System.out.println(System.identityHashCode(strBuffer));
		//StringBuffer 문자열 타입으로 변환하고 싶다면 
		//toString() 메서드를 사용하면 된다.
		String result = strBuffer.toString();
		System.out.println(result);
		
		
	}//end of main
}
