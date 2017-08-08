package solid.liskov.subsitution.principle;

public class ExcelSource implements IDataSource {

	@Override
	public void getAll() {
		System.out.println("ExcelSource getAll()");
	}

}
