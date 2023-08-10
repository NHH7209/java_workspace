package ch07_1;

public class MyNoteBook extends NoteBook{
	
	//구현 메서드로 오버라이드
	@Override
	public void display() {
		System.out.println("블루투스 키보드로 글자를 입력합니다.");
	}
}
