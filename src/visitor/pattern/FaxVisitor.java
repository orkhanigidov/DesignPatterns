package visitor.pattern;

public class FaxVisitor implements Visitor {

	@Override
	public void visit(HPPrinter p) {
		System.out.println(p.toString() + " sending fax...");
	}

	@Override
	public void visit(LexmarkPrinter p) {
		System.out.println(p.toString() + " does not support fax");
	}

}
