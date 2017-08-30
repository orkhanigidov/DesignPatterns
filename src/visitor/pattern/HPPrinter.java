package visitor.pattern;

public class HPPrinter implements Printer {

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
		return "HP Printer";
	}

}
