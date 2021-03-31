import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class FibElement{

   public static void main(String[] args) {
      Scanner scan = new Scanner((System.in));
      System.out.println("This program Gives the nth element of the Fibonacci code");
      System.out.print("Enter the element number you would like to find: ");
      int n = scan.nextInt();
      Code(n);
   
   }
   public static void Code(int nth){
      int[] codeFib = new int[nth];
      codeFib[0] = 0;
      codeFib[1] = 1;
      int numb;
      long startTime = System.currentTimeMillis();
      for(int z=2; z < nth; z++){
         codeFib[z]=(codeFib[z-1]+codeFib[z-2]);
         System.out.println(codeFib[z]);
      }
      long endTime = System.currentTimeMillis();
      System.out.println("The " + nth + " element is: " + codeFib[nth-1]);
      System.out.println("Duration: " + (endTime - startTime) + " milliseconds");
   }
}