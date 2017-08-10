package decorator.two;

public class MemberPrintMessages extends MemberOperationDecorator {
	
	public MemberPrintMessages(IMemberOperation operation){
		super(operation);
	}
	
	public void printMessages(){
		System.out.println("Messages printing...");
	}
	
}
