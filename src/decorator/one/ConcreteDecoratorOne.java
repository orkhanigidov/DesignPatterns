package decorator.one;

public class ConcreteDecoratorOne extends AbstractDecorator {
	
	public void doJob(){
		super.doJob();
		System.out.println("Concrete Decorator One");
	}
	
}
