package visitor.pattern;

public class VisitorTest {
	public static void main(String[] args) {
		
		Printer hp = new HPPrinter();
		Printer lexmark = new LexmarkPrinter();
		
		hp.print();
		lexmark.print();
		
		Visitor visitor = new FaxVisitor();
		
		hp.accept(visitor);
		lexmark.accept(visitor);
		
	}
}
