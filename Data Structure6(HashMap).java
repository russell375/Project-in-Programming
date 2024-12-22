import java.util.HashMap;

public class Datastructure6 {
   public static void main(String[] args){
   
    HashMap<String, String> accounts = new HashMap<String, String>();
    HashMap<String, String> accounts2 = accounts;

    //Iput names and usernames
    accounts2.put("Kim", "PowerRangerRed");
    accounts2.put("Razel", "PowerRangerGreen");
    accounts2.put("Janecres", "PowerRangerBlue");

    //Removing names and usernames
    accounts2.remove("Kim");

    //Replacing usernames
    System.out.println(accounts2.replace("Razel", "PowerRangerPink"));
    
    //Print out the names and usernames
      System.out.println(accounts2);
   } 
}
