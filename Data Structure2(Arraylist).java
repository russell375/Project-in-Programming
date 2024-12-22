import java.util.ArrayList;
import java.util.List;
public class Datastructure2 {
public static void main(String[] args) {
   List<String> names = new ArrayList<>() ;
   names.add("Kim Endro");
   names.add("Razel");
   names.add("Janecres");

   //Print out the names
   System.out.println(names);

   
   //Add the names
   names.add("Goryo");
   names.add("Cardo");
   System.out.println(names);

      //Remove the names
   names.remove("Goryo");
   System.out.println(names);
   
   //Boolean to check if the names are already in the list
   System.out.println(names.contains("Kim Endro"));

   //Clear or remove all the names
   names.clear();
   System.out.println(names);

}
}