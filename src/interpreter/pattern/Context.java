package interpreter.pattern;

public class Context {
	
	private String hexValue;
	private int octalValue;
	
	public Context() {
	}

	public String getHexValue() {
		return hexValue;
	}

	public void setHexValue(String hexValue) {
		this.hexValue = hexValue;
	}

	public int getOctalValue() {
		return octalValue;
	}

	public void setOctalValue(int octalValue) {
		this.octalValue = octalValue;
	}
	
}
