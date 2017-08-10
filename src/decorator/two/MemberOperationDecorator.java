package decorator.two;

public abstract class MemberOperationDecorator implements IMemberOperation {
	
	IMemberOperation operation;
	
	public MemberOperationDecorator(IMemberOperation operation){
		this.operation = operation;
	}
	
	public void add(){
		operation.add();
	}
	
	public void remove(){
		operation.remove();
	}
	
}
