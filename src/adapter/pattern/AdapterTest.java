package adapter.pattern;

public class AdapterTest {
	
	public static void main(String[] args) {
		
		IIO buffer = new BufferIO();
		buffer.createFolder();
		buffer.createTextFile();
		buffer.copy();
		System.out.println();
		
		IIO noBuffer = new NoBufferIO();
		noBuffer.createFolder();
		noBuffer.createTextFile();
		noBuffer.copy();
		System.out.println();
		
		IIO batch = new BatchAdapter(new BatchIO());
		batch.createFolder();
		batch.createTextFile();
		batch.copy();
		
	}
	
}
