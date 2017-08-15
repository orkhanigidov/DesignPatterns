package command.pattern;

public class Invoke {
	
	public void executeCommand(ICommand command){
		command.execute();
	}
	
}
