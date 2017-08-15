package iterator.pattern;

public class FenerBahce implements Team{

	private Player[] team = new Player[5];
	
	public FenerBahce() {
		team[0] = new Player("Ismail", 4);
		team[1] = new Player("Willie", 5);
		team[2] = new Player("Semih", 9);
		team[3] = new Player("Ibrahim", 10);
		team[4] = new Player("Serhat", 33);
	}
	
	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
		this.team = team;
	}

	@Override
	public Iterator getIterator() {
		return new ArrayIterator(team);
	}

}
