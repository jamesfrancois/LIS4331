import java.util.Scanner;

public class Methods {

   public static void getRequirements(){
      System.out.println("\nDeveloper: James Francois");
      System.out.println("Program counts, totals, and averages total number of user-entered exam scores.");
      System.out.println("Please enter exam scores between 0 and 100, inclusive");
      System.out.println("Enter out of range number to end the program");
      System.out.println("Must *only* permit numeric entry\n");
   }
    
    public static void calculateScores() {
        
        double total = 0.0;
        int count = 0;
        double score = 0.0;
        double average = 0.0;
        Scanner sc = new Scanner(System.in);

        //get exam scores
        while (score >= 0 && score <= 100)
        {
            System.out.print("Enter exam score: ");
            
            while (!sc.hasNextDouble())
            {
              System.out.println("Not valid number!\n");
              sc.next();
              System.out.print("Please try again. Enter exam score: ");
            }
           score = sc.nextDouble();

            //count and total score 
            if (score >= 0 && score <= 100)
            {
                count = ++count;
                total = total + score;
            }
        }
      average = total / count;
      System.out.println();        
      //display values
      System.out.println("Count: " + count);
      System.out.println("Total: " + total);
      System.out.println("Average: " + average);
      System.out.println();
      
    sc.close();
  }
}