package solid.liskov.subsitution.principle;

public class XMLSource implements IDataSource, IRecordable {

	@Override
	public void save() {
		System.out.println("XMLSource save()");
	}

	@Override
	public void getAll() {
		System.out.println("XMLSource getAll()");
	}

}
