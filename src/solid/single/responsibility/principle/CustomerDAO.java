package solid.single.responsibility.principle;

public interface CustomerDAO {
	public void create();
	
	public void delete(Customer customer);
	
	public void update(Customer customer);
}
