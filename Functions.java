public class Functions {
    public static void main(String[] args){
        sayOurName();
        multiply(23, 5);
        add(13, 7);
        division(100, 10);
        subtract(35, 10);
    }
    public static void sayOurName() {
        System.out.println("Kim Endro");
        System.out.println("Razel");
        System.out.println("Janecres");
        System.out.println("Welcome to functions");
    }
         //Multiplication
    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }
        //Addition
    public static void add (int a,int b) {
        System.out.println(a + b);
    }
       //Division
    public static void division (int a, int b) {
         System.out.println(a / b);
    } 
    
      //Subtraction
    public static void subtract (int a, int b) {
        System.out.println(a - b);  
    }
}
