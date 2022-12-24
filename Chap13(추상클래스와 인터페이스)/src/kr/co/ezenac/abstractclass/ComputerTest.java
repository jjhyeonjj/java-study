package kr.co.ezenac.abstractclass;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new DeskTop();			// 다형성 적용, DeskTop(하위) =>upcasting=> Computer(상위)
		computer.display();							
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();			// 다형성 적용, MyNoteBook(하위) =>upcasting=> NoteBook(상위)
		myNote.typing();								
	}
}
