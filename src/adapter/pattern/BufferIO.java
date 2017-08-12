package adapter.pattern;

public class BufferIO implements IIO {

	@Override
	public void createTextFile() {
		System.out.println("BufferIO create text file");
	}

	@Override
	public void createFolder() {
		System.out.println("BufferIO create folder ");
	}

	@Override
	public void copy() {
		System.out.println("BufferIO copy");	
	}

}
