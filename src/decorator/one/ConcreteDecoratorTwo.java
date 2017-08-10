package decorator.one;

public class ConcreteDecoratorTwo extends AbstractDecorator {
	
	public void doJob(){
		super.doJob();
		System.out.println("Concrete Decorator Two");
	}
	
}
