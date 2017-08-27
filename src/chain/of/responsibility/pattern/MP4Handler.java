package chain.of.responsibility.pattern;

public class MP4Handler extends PlayerHandler {

	public MP4Handler(PlayerHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void play(String filePath) {
		if (filePath.endsWith(".mp4")) {
			System.out.println(filePath + " is playing");
		} else {
			if(nextHandler != null){
				nextHandler.play(filePath);
			}
		}
	}

}
