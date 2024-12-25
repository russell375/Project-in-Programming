public class Flashlight {
    String type = "battery";
    String size = "big";
    String color = "Silver";
    int batchNum = 277;

    static boolean clicked = false;

    public static void click () {
        
    clicked = true;
}
public static void unclick () {
    clicked = false;
}
}


