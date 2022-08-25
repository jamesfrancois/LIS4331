import java.util.Scanner;

public class Methods 
{
    
    public static void getRequirements()
    {
        System.out.println("Developer: James S. Francois");
        System.out.println("Program evaluates largest of two values");
        System.out.println("Note: Program does *not* check for non-numeric characters.");
        System.out.println();
 }
    

public static void largestNumber()
{

int num1, num2;
Scanner scnr = new Scanner(System.in);

System.out.print("Enter first integer: ");
num1 = scnr.nextInt();

System.out.print("Enter second integer: ");
num2 = scnr.nextInt();

System.out.println(); // print blank line
if (num1 > num2)
System.out.println(num1 + " is larger than " + num2);
else if ( num2 > num1)

System.out.println(num2 + " is larger than " + num1);
else

System.out.println("Integers are equal.");
}

}


    