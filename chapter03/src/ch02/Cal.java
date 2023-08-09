package ch02;

public class Cal {

	// 속성

	// 기능
	public Cal() {
		System.out.println("Cal() 생성자 호출 - 부모");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int muliply(int n1, int n2) {
		return n1 * n2;
	}

	// 객체지향 패러다임 핵심
	// 객체화 객체간에 상호작용 그리 관계를 형성해 나가는 것
}

class Cal2 extends Cal {
	public Cal2() {
		System.out.println("Cal2() 생성자 호출 - 자식");
	}
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	//!!! 상속에서는 메서드의 재정의가 가능하다.
	
	//주석 + 힌트
	@Override //어노테이션이라 부른다.
	public int muliply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력 하였습니다.");
		}
		return n1 * n2;
	}
	//위와 같은 기법을 오버라이드라고 한다.
	
	//오버라이드 != 오버로딩 - 다른 개념이다.
	
	//생성자 오버로딩 --> 메서드 오버로딩
	public int minus(int n1, int n2, int n3) {
		return n1 -(n2 - n3);
	}


}// end of class
