import java.util.TreeSet;
public class Datastructure5 {
 public static void main(String[] args) {  
    TreeSet<Integer> nums = new TreeSet<Integer>();

    //Input numbers
    nums.add(10);
    nums.add(12);
    nums.add(13);
    nums.add(15);
    nums.add(16);

    //Remove number
    nums.remove(13);

    //Check if number exists
    System.out.println(nums.contains(15));

    

    //Print out numbers
    System.out.println(nums);
 
}
}