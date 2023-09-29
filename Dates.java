import java.util.*;
public class Dates
{
   public static void main(String[]args)
   {
      SimpleDate d1 = new SimpleDate();
      System.out.println(d1);
      SimpleDate birthday = new SimpleDate(2, 1, 2002);
      System.out.println(birthday);
      Random rng = new Random();
      int month = (rng.nextInt(12)+1);
      int day = (rng.nextInt(28)+1);
      int year = rng.nextInt(400)+1800;
      System.out.println(month + " "+day+" "+year);
      SimpleDate randomDate = new SimpleDate(month, day, year);
      System.out.println(randomDate);
      randomDate.nextDay();
      System.out.println(randomDate);
      randomDate.nextDay();
      randomDate.nextDay();
      randomDate.nextDay();
      System.out.println(randomDate);
      int randomDay = randomDate.getDay();
      int randomMonth = randomDate.getMonth();
      int randomYear = randomDate.getYear();
      System.out.println(randomDay+"-"+randomMonth+"-"+randomYear);
      
   
   }
}