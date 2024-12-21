public class Conditional {
    public static void main(String[] args){
       // if statement
       int age = 20;
       if (age >= 18){
         System.out.println("You are an adult.");

         //if-else statement
         int edad = 15;
         if (edad >= 18) {
            System.out.println("You are an adult.");
         }else{
            System.out.println("You are a minor.");

            //if-else  else-if statement
            int grade = 74;
            if (grade >= 90 && grade <= 99 ) {
            System.out.println("Your grade is VERY GOOD.");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("Your grade is GOOD.");
            } else if (grade >= 75 && grade <= 79) {
                System.out.println("Your grade is AVERAGE.");
            } else if (grade <= 75   ) {
                System.out.println("Your grade is POOR.");
            }

            //Nested if statement
            int age1 = 19;
            boolean hasLicense = true;
            if (age1 >=18) {
            if(hasLicense) {
            System.out.println("You can drive.");
                } else {
            System.out.println("You are an adult without a valid license.");
                }
            } else {
                System.out.println("You are a minor.");

            }

            
                
            //Switch statement
             int day = 1;
             String dayName;
             switch (day){
                 case 1:
                 dayName = "Monday";
                 break;
                 case 2:
                 dayName = "Tuesday";
                 break;
                 case 3:
                 dayName = "Wednesday";
                 break;
                 case 4:
                 dayName = "Thursday";
                 break;
                 case 5:
                 dayName = "Friday";
                 break;
                 case 6:
                 dayName = "Saturday";
                 break;
                 case 7:
                 dayName = "Sunday";
                 break;
                 default:
                 dayName = "Invalid day";
             }
             System.out.println("The day is " + dayName);
                 
            
             
           
            
                }
            }
       }
    }

        
    
             
                 
                 
                 
                
                 
                 
             

         
         
       
    

