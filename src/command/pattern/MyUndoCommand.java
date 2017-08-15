package command.pattern;

public class MyUndoCommand implements ICommand {

	private Receiver receiver;
	
	public MyUndoCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.performUndo();
	}

}
