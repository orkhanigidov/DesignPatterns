package data.access.object.pattern;

import java.util.List;

public interface DAO {

    List<Person> getPersonList();

    Person getPerson(int id);

}
