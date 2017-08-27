package chain.of.responsibility.pattern;

public class MPGHandler extends PlayerHandler {

	public MPGHandler(PlayerHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void play(String filePath) {
		if (filePath.endsWith(".mpg")) {
			System.out.println(filePath + " is playing");
		} else {
			if(nextHandler != null){
				nextHandler.play(filePath);
			}
		}
	}

}
