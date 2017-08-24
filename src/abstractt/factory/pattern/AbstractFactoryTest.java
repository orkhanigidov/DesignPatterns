package abstractt.factory.pattern;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		
		ActionMovieFactory action = new ActionMovieFactory();
		IHollywoodMovie hAction = action.getHollywoodMovie();
		IBollywoodMovie bAction = action.getBollywoodMovie();
		
		System.out.println(hAction.movieName());
		System.out.println(bAction.movieName());
		
		ComedyMovieFactory comedy = new ComedyMovieFactory();
		IHollywoodMovie hComedy = comedy.getHollywoodMovie();
		IBollywoodMovie bComedy = comedy.getBollywoodMovie();
		
		System.out.println(hComedy.movieName());
		System.out.println(bComedy.movieName());
		
	}
}
