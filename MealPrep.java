// Name : Jacob Rohrich
// Class : CIST1400-821
// Colleagues : None
// Resources : Program Documents

// Gives the user a meal based on what they have.

import java.util.Scanner;

public class MealPrep
{
   public static void main(String[] args)
   {
      Scanner get = new Scanner(System.in);
      System.out.println("Welcome to the Meal Prep Program. Let's see what you can make.");
      System.out.println("Do you have any meat?");
      String meat = get.nextLine();
      char yes = 'y';
      char no = 'n';
      char bigyes = 'Y';
      char bigno = 'N';
      if (meat.equalsIgnoreCase("yes") || (meat.charAt(0) == yes || meat.charAt(0) == bigyes))
      {
         System.out.println("Do you have beef, chicken, or other meat?");
         String typeMeat = get.nextLine();
         if (typeMeat.equalsIgnoreCase("beef"))
         {
            System.out.println("Do you have steak, ground, or roast?");
            String theBeef = get.nextLine();
            if (theBeef.equalsIgnoreCase("steak"))
            {
               System.out.println("Do you have Potatoes?");
               String potatoes = get.nextLine();
               if (potatoes.equalsIgnoreCase("yes") || (potatoes.charAt(0) == yes || potatoes.charAt(0) == bigyes))
               {
                  System.out.println("Do you have salad?");
                  String salad = get.nextLine();
                  if (salad.equalsIgnoreCase("yes") || (salad.charAt(0) == yes || salad.charAt(0) == bigyes))
                  {
                     System.out.println("Steak, Baked Potato and Salad");
                  }
                  else if (salad.equalsIgnoreCase("no") || (salad.charAt(0) == no || salad.charAt(0) == bigno))
                  {
                     System.out.println("Do you have fruit?");
                     String fruit = get.nextLine();
                     if (fruit.equalsIgnoreCase("yes") || (fruit.charAt(0) == yes || fruit.charAt(0) == bigyes))
                     {
                        System.out.println("steak, baked potato, and fruit");
                     }
                     else if (fruit.equalsIgnoreCase("no") || (fruit.charAt(0) == no || fruit.charAt(0) == bigno))
                     {
                        System.out.println("Steak and Potato Hash");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
                  
               }
               else if (potatoes.equalsIgnoreCase("no") || (potatoes.charAt(0) == no || potatoes.charAt(0) == bigno))
               {
                  System.out.println("Do you have salad?");
                  String salad = get.nextLine();
                  if (salad.equalsIgnoreCase("yes") || (salad.charAt(0) == yes || salad.charAt(0) == bigyes))
                  {
                     System.out.println("Steak salad");
                  }
                  else if (salad.equalsIgnoreCase("no") || (salad.charAt(0) == no || salad.charAt(0) == bigno))
                  {
                     System.out.println("Steak sandwich");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }
            }
            else if (theBeef.equalsIgnoreCase("ground"))
            {
               System.out.println("Do you have buns?");
               String buns = get.nextLine();
               if (buns.equalsIgnoreCase("yes") || (buns.charAt(0) == yes || buns.charAt(0) == bigyes))
               {
                  System.out.println("Hamburgers");
               }
               else if (buns.equalsIgnoreCase("no") || (buns.charAt(0) == no || buns.charAt(0) == bigno))
               {
                  System.out.println("Do you have rice?");
                  String rice = get.nextLine();
                  if (rice.equalsIgnoreCase("yes") || (rice.charAt(0) == yes || rice.charAt(0) == bigyes))
                  {
                     System.out.println("Casserole");
                  }
                  else if (rice.equalsIgnoreCase("no") || (rice.charAt(0) == no || rice.charAt(0) == bigno))
                  {
                     System.out.println("Chili");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }
            }
            else if (theBeef.equalsIgnoreCase("roast"))
            {
               System.out.println("Do you have Potatoes?");
               String potatoes = get.nextLine();
               if (potatoes.equalsIgnoreCase("yes") || (potatoes.charAt(0) == yes || potatoes.charAt(0) == bigyes))
               {
                  System.out.println("Do you have vegetables?");
                  String veg = get.nextLine();
                  if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
                  {
                     System.out.println("Pot Roast and veggies with Mashed Potatoes");
                  }
                  else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
                  {
                     System.out.println("Roasted potatoes and meat");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else if (potatoes.equalsIgnoreCase("no") || (potatoes.charAt(0) == no || potatoes.charAt(0) == bigno))
               {
                  System.out.println("Do you have vegetables?");
                  String veg = get.nextLine();
                  if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
                  {
                     System.out.println("Meat and veggie soup");
                  }
                  else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
                  {
                     System.out.println("Pot Roast");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }  
            }
            else
            {
               System.out.println("Invalid response.");
            }
         }
         else if (typeMeat.equalsIgnoreCase("chicken"))
         {
            System.out.println("Do you have whole or pieces?");
            String chickenType = get.nextLine();
            if (chickenType.equalsIgnoreCase("whole"))
            {
               System.out.println("Do you have pasta?");
               String pasta = get.nextLine();
               if (pasta.equalsIgnoreCase("yes") || (pasta.charAt(0) == yes || pasta.charAt(0) == bigyes))
               {
                  System.out.println("Chicken Pasta Casserole");
               }
               else if (pasta.equalsIgnoreCase("no") || (pasta.charAt(0) == no || pasta.charAt(0) == bigno))
               {
                  System.out.println("Do you have rice?");
                  String rice = get.nextLine();
                  if (rice.equalsIgnoreCase("yes") || (rice.charAt(0) == yes || rice.charAt(0) == bigyes))
                  {
                     System.out.println("Do you have vegetables?");
                     String veg = get.nextLine();
                     if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
                     {
                        System.out.println("Stir Fry");
                     }
                     else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
                     {
                        System.out.println("Chicken Rice Casserole");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
                  }
                  else if (rice.equalsIgnoreCase("no") || (rice.charAt(0) == no || rice.charAt(0) == bigno))
                  {
                     System.out.println("Smoked Chicken");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }
               
            }
            else if (chickenType.equalsIgnoreCase("pieces"))
            {
               System.out.println("Do you have vegetables?");
               String veg = get.nextLine();
               if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
               {
                  System.out.println("Grilled Chicken & Veggies");
               }
               else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
               {
                  System.out.println("Do you have pasta?");
                  String pasta = get.nextLine();
                  if (pasta.equalsIgnoreCase("yes") || (pasta.charAt(0) == yes || pasta.charAt(0) == bigyes))
                  {
                     System.out.println("Chicken Piccata");
                  }
                  else if (pasta.equalsIgnoreCase("no") || (pasta.charAt(0) == no || pasta.charAt(0) == bigno))
                  {
                     System.out.println("Fried Chicken");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }
            }
            else
            {
               System.out.println("Invalid response.");
            }
         }
         else if (typeMeat.equalsIgnoreCase("other"))
         {
            System.out.println("Do you have eggs?");
            String eggs = get.nextLine();
            if (eggs.equalsIgnoreCase("yes") || (eggs.charAt(0) == yes || eggs.charAt(0) == bigyes))
            {
               System.out.println("meat and eggs");
            }
            else if (eggs.equalsIgnoreCase("no") || (eggs.charAt(0) == no || eggs.charAt(0) == bigno))
            {
               System.out.println("Do you have vegetables?");
               String veg = get.nextLine();
               if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
               {
                    System.out.println("meat and veggies");
               }
               else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
               {
                     System.out.println("Do you have pasta?");
                     String pasta = get.nextLine();
                     if (pasta.equalsIgnoreCase("yes") || (pasta.charAt(0) == yes || pasta.charAt(0) == bigyes))
                     {
                        System.out.println("meat & pasta");
                     }
                     else if (pasta.equalsIgnoreCase("no") || (pasta.charAt(0) == no || pasta.charAt(0) == bigno))
                     {
                        System.out.println("you should have just meat");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
               }
               else
               {
                  System.out.println("Invalid response.");
               }
            }
            else
            {
               System.out.println("Invalid response.");
            }
         }
         else
         {
            System.out.println("Invalid response.");
         }
      }
      else if (meat.equalsIgnoreCase("no") || (meat.charAt(0) == no || meat.charAt(0) == bigno))
      {
               System.out.println("Do you have vegetables?");
               String veg = get.nextLine();
               if (veg.equalsIgnoreCase("yes") || (veg.charAt(0) == yes || veg.charAt(0) == bigyes))
               {
                  System.out.println("Do you have eggplant?");
                  String egg = get.nextLine();
                  if (egg.equalsIgnoreCase("yes") || (egg.charAt(0) == yes || egg.charAt(0) == bigyes))
                  {
                     System.out.println("Do you have Tomato?");
                     String tomato = get.nextLine();
                     if (tomato.equalsIgnoreCase("yes") || (tomato.charAt(0) == yes || tomato.charAt(0) == bigyes))
                     {
                        System.out.println("Eggplant Parmesan");
                     }
                     else if (tomato.equalsIgnoreCase("no") || (tomato.charAt(0) == no || tomato.charAt(0) == bigno))
                     {
                        System.out.println("Roasted Eggplant");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
                  }
                  else if (egg.equalsIgnoreCase("no") || (egg.charAt(0) == no || egg.charAt(0) == bigno))
                  {
                     System.out.println("Vegetable soup");
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else if (veg.equalsIgnoreCase("no") || (veg.charAt(0) == no || veg.charAt(0) == bigno))
               {
                  System.out.println("Do you have eggs?");
                  String egg = get.nextLine();
                  if (egg.equalsIgnoreCase("yes") || (egg.charAt(0) == yes || egg.charAt(0) == bigyes))
                  {
                     System.out.println("Do you have onions & peppers?");
                     String op = get.nextLine();
                     if (op.equalsIgnoreCase("yes") || (op.charAt(0) == yes || op.charAt(0) == bigyes))
                     {
                        System.out.println("Frittata");
                     }
                     else if (op.equalsIgnoreCase("no") || (op.charAt(0) == no || op.charAt(0) == bigno))
                     {
                        System.out.println("Omelette");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
                  }
                  else if (egg.equalsIgnoreCase("no") || (egg.charAt(0) == no || egg.charAt(0) == bigno))
                  {
                     System.out.println("Do you have bread?");
                     String bread = get.nextLine();
                     if (bread.equalsIgnoreCase("yes") || (bread.charAt(0) == yes || bread.charAt(0) == bigyes))
                     {
                        System.out.println("PB & J sandwich");
                     }
                     else if (bread.equalsIgnoreCase("no") || (bread.charAt(0) == no || bread.charAt(0) == bigno))
                     {
                        System.out.println("Your cupboard is bare!");
                     }
                     else
                     {
                        System.out.println("Invalid response.");
                     }
                  }
                  else
                  {
                     System.out.println("Invalid response.");
                  }
               }
               else
               {
                  System.out.println("Invalid response.");
               }               
      }
      else
      {
         System.out.println("Invalid response.");
      }
      
   }
}