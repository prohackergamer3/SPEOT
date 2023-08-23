import java.net.*;
import java.io.*;
public class audioplay {
	public static void main(String[] args) {
		URL url new URL("https://fromnoisetosound.com/download.php?id=15249");
		InputStream is = url.openStream();
		FileOutputStream out = FileOutputStream("listenme.mp3");
		
		System.out.println("Dosyanız hazır!");
		
	}
}
