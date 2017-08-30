package visitor.pattern;

public interface Visitor {
	
	public void visit(HPPrinter p);
	public void visit(LexmarkPrinter p);
	
}
