import java.util.*;
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";      // Objects of String class

      Scanner in = new Scanner(System.in);

      System.out.println("Enter a number or string to check if it is a palindrome");
      original = in.nextLine();

      int length = original.length();       //object length

      for ( int i = length - 1; i >= 0; i-- )       //loop check reverse number or strings
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))                   //check condition
         System.out.println("number or string is a palindrome.");
      else
         System.out.println("number or string isn't a palindrome.");

   }
}