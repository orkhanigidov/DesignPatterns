package template.pattern;

public abstract class BasicEngineering {
	
	public void schedule(){
		calculus();
		computerArchitecture();
		newLesson();
	}
	
	public void calculus(){
		System.out.println("Calculus");
	}
	
	public void computerArchitecture(){
		System.out.println("Computer Architecture");
	}
	
	public abstract void newLesson();
	
}
