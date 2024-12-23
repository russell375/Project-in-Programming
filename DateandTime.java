import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentTime {
    public static void main(String[] args) {
        Date currentDate = new Date();

        //Input current date
        System.out.println(currentDate);

        //Input Time Format
        SimpleDateFormat timeFormat = new SimpleDateFormat( "hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        //Input date (Month, Day, and Year)
        SimpleDateFormat dateFormat = new SimpleDateFormat( "MMMM dd, yyyy");
        System.out.println(dateFormat.format(currentDate));

        //Input days of the week
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat( "EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));

        //Input clock format
        SimpleDateFormat clockFormat = new SimpleDateFormat( "h:m:a");
        System.out.println(clockFormat.format(currentDate));

    }
}
       
        
            
        
            

    

