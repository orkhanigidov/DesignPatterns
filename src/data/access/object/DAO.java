package data.access.object;

import java.util.List;

public interface DAO {

    List<Person> getPersonList();

    Person getPerson(int id);

}
