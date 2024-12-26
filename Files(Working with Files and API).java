import java.io.*;
import java.util.Scanner;
public class Files {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(new File("my_data.txt"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
           
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }  
}
}
