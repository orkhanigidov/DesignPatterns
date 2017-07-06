package data.access.object;

import java.util.ArrayList;
import java.util.List;

public class Company implements DAO {

	/*
     * This Class can use ConnectDb.getConnection()
     * method for connection to Database
     */
    List<Person> list = new ArrayList<Person>();

    public Company() {
        list.add(new Person("Fuad", "Aliyev", 4));
        list.add(new Person("Ismayil", "Ismayilov", 5));
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
