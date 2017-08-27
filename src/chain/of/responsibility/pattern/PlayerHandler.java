package chain.of.responsibility.pattern;

public abstract class PlayerHandler {
	
	protected PlayerHandler nextHandler;
	
	public PlayerHandler(PlayerHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void play(String filePath);
	
}
