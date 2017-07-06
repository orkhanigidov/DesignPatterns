package solid.liskov.subsitution.principle;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<IRecordable> recordables = new ArrayList<>();
		
		IRecordable xml = new XMLSource();
		IRecordable database = new DatabaseSource();
		
		recordables.add(xml);
		recordables.add(database);
		
		saveAll(recordables);
	}

	public static void saveAll(List<IRecordable> recordable){
		for(IRecordable data : recordable){
			data.save();
		}
	}
	
}
