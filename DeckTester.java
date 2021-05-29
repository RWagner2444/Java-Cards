/**
 * Computer Science lab - Cards
 * 05-24-2021
 * Ryan Wagner
 */

public class DeckTester
{
   public static void main(String[] args)
   {
      String[] myRanks = {"king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four"};
      String[] mySuits = {"heart", "diamond", "spade", "club", "spade", "heart", "club", "diamond", "heart", "spade"};
      int[] myPointValues = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4};
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println("   UnDealt Cards:\n");
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      /*System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: " );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: "  );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " );
      System.out.println();
      System.out.println();
      */

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
