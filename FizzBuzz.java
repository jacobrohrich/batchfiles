// Name : Jacob Rohrich
// Class : CIST1400-821
// Colleagues : None
// Resources : Lab Documents

// Plays the game fizzbuzz from a user inputed value

import java.util.Scanner;

public class FizzBuzz
{
   public static void main(String[] args)
   {
      Scanner get = new Scanner(System.in);
      System.out.println("FizzBuzz");
      System.out.print("Enter a non-negative number: ");
      int number = get.nextInt();
      System.out.println();
      int count = 1;
      while (count <= number)
      {
         if (count % 5 == 0 && count % 3 == 0)
         {
            System.out.println("FizzBuzz");
            count++;
         }
         else if (count % 5 == 0)
         {
            System.out.println("Buzz");
            count++;
         }
         else if (count % 3 == 0)
         {
            System.out.println("Fizz");
            count++;
         }
         else
         {
            System.out.println(count);
            count++;
         }
      }      
   }
}