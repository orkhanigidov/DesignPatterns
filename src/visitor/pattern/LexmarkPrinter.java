package visitor.pattern;

public class LexmarkPrinter implements Printer {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	@Override
	public void print() {
		System.out.println(this.toString() + " printing...");
	}
	
	@Override
	public String toString() {
		return "Lexmark Printer";
	}
	
}
