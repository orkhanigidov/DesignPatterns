package decorator.one;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		ConcreteComponent concreteComponent = new ConcreteComponent();
		ConcreteDecoratorOne one = new ConcreteDecoratorOne();
		ConcreteDecoratorTwo two = new ConcreteDecoratorTwo();
		
		one.setComponent(concreteComponent);
		one.doJob();
		
		two.setComponent(concreteComponent);
		two.doJob();
		
	}
	
}
