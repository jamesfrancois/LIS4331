import java.util.Scanner;
import java.util.Random;

public class Methods 
{
    
    public static void getRequirements()
    {
        System.out.println("Developer: James S. Francois");
        System.out.println("Print minimum and maximum integer values.");
        System.out.println("Program prompts user to enter desired number f pseudorandom-generated intergers (min 1).");
        System.out.println("Use following decisions structures: for, enhanced for, while, do...while.");
        System.out.println();
        System.out.println("Integer.MIN_VALUE = -214783648");
        System.out.println("Integer.MAX_VALUE = 214783647");
    
 }
 
    
 public static int[] createArray()
 {
    Scanner scnr = new Scanner(System.in);
    int arraySize = 0;

    System.out.print("Enter desired number of pseudorandom intergers (min 1): ");
    arraySize = scnr.nextInt();

    int yourArray[] = new int[arraySize];
    return yourArray;
}
public static void generatePseudoRandomNumbers(int[] myArray)
{
    Random r = new Random();

    int i = 0;
    System.out.println("for loop");
    for(i=0; i<myArray.length; i++){

        System.out.println(r.nextInt());
        
    }

    System.out.println("\nEnhanced for loop");
    for(int n: myArray)
    {
    System.out.println(r.nextInt()); 
       
}
    System.out.println("\nWhile loop:");
    i=0;
    while(i < myArray.length)
    {
    System.out.println(r.nextInt());
    i++;
    }

    i=0;
    System.out.println("\ndo...while loop:");
    do
    {
        System.out.println(r.nextInt());
        i++;
    }
    while (i < myArray.length);
    
}


}
    