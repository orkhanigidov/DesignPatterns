package solid.interfacee.segregation.principle;

public interface JMSConnector {
	public void commit();
	
	public void rollback();
	
	public void send(String str);
	
	public String receive();
}
