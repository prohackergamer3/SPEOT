import javax.sound.sampled.*;
import java.io.File;
public class audioplay {
	public static void main(String[] args) {
		File f = new File("output.mp3");
		AudioInputStream ai = new AudioSystem.getAudioInputStream(f);
		Clip clip = AudioSystem.getClip();
		clip.open(ai);
		clip.start();
		
	}
}