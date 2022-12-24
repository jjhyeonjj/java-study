package kr.co.ezenac.abstractclass;

public class MyNoteBook extends NoteBook {

	@Override // NoteBook클래스에서 구현하지 않은 메서드 생성
	void display() {
		System.out.println("MyNoteBook display");
	}

}
