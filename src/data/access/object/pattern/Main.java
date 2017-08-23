package data.access.object.pattern;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Company());
        List<Person> companyList = controller.getPersonList();

        for (int i = 0; i < companyList.size(); i++) {
            Person person = companyList.get(i);
            System.out.println("Employee name: " + person.getName());
            System.out.println("Employee surname: " + person.getSurname());
            System.out.println("Employee id: " + person.getId());
        }
        System.out.println("-------------------");

        Person cPerson = controller.getPerson(4);
        System.out.println("Employee name with id 4: " + cPerson.getName());

        System.out.println("-------------------");

        controller.setDao(new University());
        List<Person> universityList = controller.getPersonList();

        for (int i = 0; i < universityList.size(); i++) {
            Person person = universityList.get(i);
            System.out.println("Employee name: " + person.getName());
            System.out.println("Employee surname: " + person.getSurname());
            System.out.println("Employee id: " + person.getId());
        }
        System.out.println("-------------------");

        Person uPerson = controller.getPerson(2);
        System.out.println("Student name with id 2: " + uPerson.getName());

    }
}
