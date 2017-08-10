package decorator.two;

public class MemberMessageOperation extends MemberOperationDecorator {
	
	public MemberMessageOperation(IMemberOperation operation){
		super(operation);
	}
	
	public void sendMessage(String message){
		System.out.println("Message: " + message);
	}
	
}
