import java.io.*;
import java.net.*;

import javax.sound.sampled.SourceDataLine;
public class Server {
/**
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException{
 try(ServerSocket serverSocket = new ServerSocket(4444)) {
     System.out.println("Server is listening on port 4444...");
     Socket clientSocket = serverSocket.accept();
     System.out.println("C;ient connected");

     try(BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){

        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
        }{

        
            String message = in.readLine();
            char[] sent;
            try {
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             String nullClient;
             System.out.println("!= nullClient sent:" + message);

            System.out.println("Server received:" + message);
        }
            }catch (IOException e) {
             e.printStackTrace();
        }
        }
    }
}
    


        
     

     
 

    

