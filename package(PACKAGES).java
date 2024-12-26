import java.util.*;
public class Packages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our project");
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome to our project:" + name);
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();   
        
        System.out.println("File Name: " + fileName);   
        System.out.println("Enter file size:");
        double fileSize = scanner.nextDouble();
        System.out.println("File Size: " + fileSize + " MB");
        



    }
    
}
