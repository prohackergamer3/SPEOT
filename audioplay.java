import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class audioplay {
    public static void main(String[] args) {
        String fileUrl = "https://example.com/file.txt";
        String savePath = "C:/path/to/save/file.txt";

        try {
            URL url = new URL(fileUrl);
            InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(savePath);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("File downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
