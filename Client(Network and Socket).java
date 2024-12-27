import java.io.*;
import java.net.*;

import javax.sound.sampled.SourceDataLine;
public class Client {
    public static void main(final String[] args)  {
        try (Socket socket = new Socket("localhost", 4444)) {
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

         try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Hello server");
            String response = in.readLine();
             
            System.out.println("Server says: " + response);
        } catch (IOException e) {
            System.out.println("Error connecting to server: " + e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     
      }
    }
}
    




      

       

        


      
        
    




