import java.util.Scanner;

public class Methods {

   public static void getRequirements(){
      System.out.println("\nDeveloper: James Francois");
      System.out.println(" 1) Use interger for seconds (must validate interger input). ");
      System.out.println(" 2) Use printf() function to print (format values per below output). ");
      System.out.println(" 3) Create java (Constraints) for the following values: "  );
                        System.out.println("SECS_IN_MINS");
                        System.out.println("HRS");
                        System.out.println("HRS_IN_DAYS");
                        System.out.println("DAYS_IN_WEEK");
                        System.out.println("DAYS_IN_YR (365) ");
   }
    
    public static void convertTime(){
     int seconds=0;    
     double minutes=0.0;
     double hours=0.0;
     double days=0.0;
     double weeks=0.0;
     double years=0.0;
  


     final double SEC_IN_MINS = 60; 
     final double MIN_IN_HR = 60;
     final double HRS_IN_DAY = 24;
     final double DAYS_IN_WEEK = 7;
     final double DAY_IN_YEAR = 365;  

     Scanner sc = new Scanner(System.in);

     System.out.print("Please enter number of seconds: ");
      while (!sc.hasNextInt())
      {
      System.out.println("Not valid interger\n");
      sc.next();
      System.out.print("Please enter number of seconds: ");
      }
     seconds = sc.nextInt();
    
    
    minutes = seconds / SEC_IN_MINS;
    hours = minutes / MIN_IN_HR;
    days = hours / HRS_IN_DAY;
    weeks = days / DAYS_IN_WEEK;
    years = days / DAY_IN_YEAR; 

    System.out.printf("%,d second(s) equals\n\n%,.2f minute(s)\n%,.3f hour(s)\n%,.4f day(s)\n%,.5f week(s)\n%,.6f year(s)\n", seconds, minutes, hours, days, weeks, years);

    sc.close();
  }
}