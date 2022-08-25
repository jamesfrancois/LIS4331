import java.util.Scanner;

public class Methods 
{
    
    public static void getRequirements()
    {
        System.out.println("Developer: James S. Francois");
        System.out.println("Program evaluates intergers as even or odd");
        System.out.println("Note: Program does *not* check for non-numeric characters.");
        System.out.println();
 }
    
 public static void evaluateNumber()
 {
     int num = 0;
     System.out.print("Enter interger");
     Scanner scnr = new Scanner(System.in);
     num = scnr.nextInt();

     if( num % 2 == 0){
     System.out.println(num + " is an even number");   
     }
     else
     {
      System.out.println(num + " is an odd number"); 
     }
}




}
    