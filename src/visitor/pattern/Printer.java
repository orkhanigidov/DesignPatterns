package visitor.pattern;

public interface Printer {
	
	public void print();
	public void accept(Visitor v);
	
}
