package adapter.pattern;

public class BatchAdapter implements IIO{

	private BatchIO batch;
	
	public BatchAdapter(BatchIO batch){
		this.batch = batch;
	}
	
	@Override
	public void createTextFile() {
		batch.createBatchTextFile();
	}

	@Override
	public void createFolder() {
		batch.createBatchFolder();
	}

	@Override
	public void copy() {
		batch.copyBatch();
	}

}
