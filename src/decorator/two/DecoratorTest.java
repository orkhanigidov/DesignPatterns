package decorator.two;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		MemberOperation operation = new MemberOperation();
		MemberMessageOperation msgOperation = new MemberMessageOperation(operation);
		MemberPrintMessages printOperation = new MemberPrintMessages(operation);
		
		
		operation.add();
		operation.remove();
		msgOperation.sendMessage("Hello Sanani");
		printOperation.printMessages();
	}
}
