package data.access.object;

import java.util.List;

public class Controller {

    private DAO dao;

    public Controller(DAO dao) {
        this.dao = dao;
    }

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

    public Person getPerson(int id) {
        return dao.getPerson(id);
    }
    
    public List<Person> getPersonList(){
        return dao.getPersonList();
    }

}
