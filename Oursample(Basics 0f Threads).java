package project1;
class MySample extends Thread {
    public void run() {
        // Your code here
        
        for(int i = 0; i < 10; i++) {
            String name = "Janecres";
        String name1 = "Kim Endro";
        String name2 = "Razel";
            System.out.println("name: " + i);
            System.out.println("Name: " + name);
            System.out.println("Name1:" + name1);
            System.out.println("Name2:" + name2);
        }
    }
}

public class OurSample {
    public static void main(String[] args) {
        MySample mySample = new MySample();
        mySample.start();
       // MySample mySample2 = new MySample();
       // mySample2.start();
    }
    
}
