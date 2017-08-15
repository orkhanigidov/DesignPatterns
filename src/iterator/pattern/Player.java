package iterator.pattern;

public class Player {
	
	private String name;
	private int position;
	
	public Player(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return position;
	}

	public void setNumber(int position) {
		this.position = position;
	}
	
}
