package iterator.pattern;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		EfesPilsen efesPilsen = new EfesPilsen();
		Iterator it = efesPilsen.getIterator();
		
		while(it.hasNext()){
			Player player = (Player) it.next();
			System.out.println(player.getName());
		}
		
		FenerBahce fenerBahce = new FenerBahce();
		it = fenerBahce.getIterator();
		
		while(it.hasNext()){
			Player player = (Player) it.next();
			System.out.println(player.getName());
		}
		
	}
	
}
