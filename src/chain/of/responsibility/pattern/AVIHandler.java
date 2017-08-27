package chain.of.responsibility.pattern;

public class AVIHandler extends PlayerHandler {

	public AVIHandler(PlayerHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void play(String filePath) {
		if (filePath.endsWith(".avi")) {
			System.out.println(filePath + " is playing");
		} else {
			if(nextHandler != null) {
				nextHandler.play(filePath);
			}
		}
	}

}
