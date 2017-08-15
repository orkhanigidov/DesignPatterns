package command.pattern;

public class MyRedoCommand implements ICommand {
	
	private Receiver receiver;
	
	public MyRedoCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.performRedo();
	}
	
}
