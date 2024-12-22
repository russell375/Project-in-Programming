import java.util.HashSet;
public class Datastructure4 {
    public static void main(String[] args) {
   HashSet<String> names = new HashSet<String>();

   //Input names
   names.add("Kim Endro");
   names.add("Razel");
   names.add("Goryo");
   names.add("Cardo");
   names.add("Janecres");

   //Remove a name from the HashSet
   names.remove("Goryo");

   //Check if a name exists in the HashSet
   System.out.println("Is Janecres in the HashSet? " + names.contains("Janecres"));

 //Print out names
   System.out.println("Names in the HashSet: " + names);

   
   

   
}
}
