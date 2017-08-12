package adapter.pattern;

public class NoBufferIO implements IIO {

	@Override
	public void createTextFile() {
		System.out.println("NoBufferIO create text file");
	}

	@Override
	public void createFolder() {
		System.out.println("NoBufferIO create folder");
	}

	@Override
	public void copy() {
		System.out.println("NoBufferIO copy");
	}

}
