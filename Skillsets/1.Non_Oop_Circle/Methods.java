import java.util.Scanner;

public class Methods {

   public static void getRequirements(){
      System.out.println("Developer: James Francois");
      System.out.println("Program evaluates diameter, circumference, and circle area.");
      System.out.println("Note: Must use Java's built-in PI constant, printf(), and formatted to two decimal places.");
      System.out.println("Must *only* permic numeric entry.\n");
   }

   public static void evaluateNumber()
      {
         Scanner sc = new Scanner(System.in);
         double diameter = 0.0;
         double circumference = 0.0;
         double area = 0.0;
         char choice = ' ';
         int radius = 0;
 
         do{
             System.out.print("Please enter Circle Radius: ");
             while (!sc.hasNextInt())
             {
                 System.out.println("Not valid integer!\n");
                 sc.next();
                 System.out.print("Please try again. Enter Circle Radius: ");
             }
             radius = sc.nextInt();
 
             System.out.println();
             
             //calculate diameter, circumference, and area
             diameter = (radius*2.0);
             circumference = Math.PI*(diameter);
             area = Math.PI*(radius*radius);
             
            //print output of diameter, circumference, and area
             System.out.println("Circle Diameter " + String.format("%,.2f", diameter) );
             System.out.println("Circle Circumference " + String.format("%,.2f", circumference) );
             System.out.println("Circle Area " + String.format("%,.2f", area) );

             
             System.out.print("\nDo you want to calculate another circle radius (y or n)? ");
             choice = sc.next().charAt(0);
             choice = Character.toLowerCase(choice);
         }
         while (choice == 'y');
 
         System.out.println("Thank you for using our Circle Formula Program!");
 
     }
 }
 