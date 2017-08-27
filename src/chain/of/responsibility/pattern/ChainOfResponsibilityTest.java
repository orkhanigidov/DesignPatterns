package chain.of.responsibility.pattern;

public class ChainOfResponsibilityTest {
	public static void main(String[] args) {
		
		PlayerHandler mp4Handler = new MP4Handler(null);
		PlayerHandler mpgHandler = new MPGHandler(mp4Handler);
		PlayerHandler aviHandler = new AVIHandler(mpgHandler);
		
		mp4Handler.play("video.mp4");
		mp4Handler.play("video.mpg");
		mp4Handler.play("video.avi");
		System.out.println();
		
		mpgHandler.play("video.mp4");
		mpgHandler.play("video.mpg");
		mpgHandler.play("video.avi");
		System.out.println();
		
		aviHandler.play("video.mp4");
		aviHandler.play("video.mpg");
		aviHandler.play("video.avi");
	}
}
