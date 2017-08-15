package command.pattern;

public class CommandTest {
	
	public static void main(String[] args) {
		
		Receiver receiver = new Receiver();
		Invoke invoke = new Invoke();
		
		MyUndoCommand undo = new MyUndoCommand(receiver);
		MyRedoCommand redo = new MyRedoCommand(receiver);
		
		invoke.executeCommand(undo);
		invoke.executeCommand(redo);
		
	}
	
}
