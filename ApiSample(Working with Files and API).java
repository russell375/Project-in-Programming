import java.io.*;
import java.net.*;
public class ApiSample {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://api.sample.com/data");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
    }
}

    

