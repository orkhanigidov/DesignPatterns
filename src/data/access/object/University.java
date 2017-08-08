package data.access.object;

import java.util.ArrayList;
import java.util.List;

public class University implements DAO {

    /*
     * This Class can use ConnectDb.getConnection()
     * method for connection to Database
     */
    List<Person> list = new ArrayList<Person>();

    public University() {
        list.add(new Person("Sanani", "Racabov", 1));
        list.add(new Person("Sarxan", "Racabov", 2));
        list.add(new Person("Orxan", "Igidov", 3));
    }

    @Override
    public List<Person> getPersonList() {
        return list;
    }

    @Override
    public Person getPerson(int id) {
        Person person = new Person();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                person.setName(list.get(i).getName());
                person.setSurname(list.get(i).getSurname());
                return person;
            }
        }

        return null;
    }

}
