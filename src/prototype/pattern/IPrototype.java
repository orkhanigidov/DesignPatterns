package prototype.pattern;

public interface IPrototype extends Cloneable {
	
	public IPrototype cloneObject() throws CloneNotSupportedException;
	
}
