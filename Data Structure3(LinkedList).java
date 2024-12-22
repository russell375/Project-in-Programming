import java.util.LinkedList;
public class Datastructure3 {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        friends.add("Kim");
        friends.add("Razel");
        friends.add("Janecres");
        friends.add("Dahulo");
        friends.add("Goryo");
        friends.add("Cardo");

        //Print out  friends names
        System.out.println(" friends: " +  friends);

        //Print the first friends name
        System.out.println("First friend: " + friends.getFirst());

        //Print the specific friends name
       System.out.println("Friends name: " + friends.get(2));

    }   
}
      
      


