import java.util.TreeMap;
public class Datastructure7 {
public static void main(String[] args)  {
    TreeMap<String, Integer> Nameandage = new TreeMap<String, Integer>();

    //Input name and age
    Nameandage.put("Kim Endro", 19);
    Nameandage.put("Razel", 20);
    Nameandage.put("Janecres", 25);
    Nameandage.put("Butyok", 30);
    Nameandage.put("Plong Plong", 31);

   //Removing name and age
   Nameandage.remove("Butyok");

   //Print out the name and age
    System.out.println(Nameandage);
    
 
    
    }
}

