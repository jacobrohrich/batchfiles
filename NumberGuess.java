// Name : Jacob Rohrich
// Class : CIST1400-821
// Colleagues : None
// Resources : Lab Documents

// This code plays a guessing game with the user
import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
   public static void main(String[] args)
   {
      Scanner get = new Scanner(System.in);
      Random r = new Random();
      int answer = (r.nextInt(100) + 1);
      System.out.println("Guess the number I'm thinking of!");
      int guess = get.nextInt();
      while (guess != answer) {
         if (guess < answer)
         {
            System.out.println("Your guess of " + guess + " is too low. Try again!");
            guess = get.nextInt();
         }
         else if (guess > answer)
         {
            System.out.println("Your guess of " + guess + " is too high. Try again!");
            guess = get.nextInt();
         }
      }
      System.out.println("You guessed " + answer + ", which is the number I was thinking of!");
   }
}