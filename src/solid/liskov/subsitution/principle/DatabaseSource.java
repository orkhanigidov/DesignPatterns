package solid.liskov.subsitution.principle;

public class DatabaseSource implements IDataSource, IRecordable {

	@Override
	public void save() {
		System.out.println("DatabaseSource save()");
	}

	@Override
	public void getAll() {
		System.out.println("DatabaseSource getAll()");
	}

}
