import java.io.*;
import java.util.*;
public class CollectionSample {
 public static void main(String[] args){

    //Creating array
    //Vector and Hashtable
    int arr[] = new int[] {18,19,20,22,25};
    Vector<Integer> v = new Vector();
    Hashtable<Integer, String> h = new Hashtable();

    /*Adding elements into
     the vector*/
     v.addElement(1);
     v.addElement(2);
     v.addElement(3);
     /*Adding the elements into
      the hashtable*/
      h.put(1, "Kim Endro");
      h.put(2, "Razel");
      h.put(3, "Janecres");

      /*Accessing elements of the 
      array, vector, and hashtable*/

      System.out.println(arr[4]);
      System.out.println(v.elementAt(2));
      System.out.println(h.get(3));
     
 }   
}
