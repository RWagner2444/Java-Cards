/**
 * Computer Science lab - Cards
 * 05-24-2021
 * Ryan Wagner
 */

public class CardTester
{
   public static void main(String[] args) {
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.getRank());
      System.out.println("  suit: " + aceHearts.getSuit());
      System.out.println("  pointValue: " + aceHearts.getPointValue());
      System.out.println("  toString: " + aceHearts.toString());


      // Test card 2
      Card _7spades = new Card("7", "spades", 7);
      System.out.println("\n**** Tests Card 2: seven of spades ****");
      System.out.println("  rank: " + _7spades.getRank());
      System.out.println("  suit: " + _7spades.getSuit());
      System.out.println("  pointValue: " + _7spades.getPointValue());
      System.out.println("  toString: " + _7spades.toString());
      
      // Test card 3
      Card _1ofHearts = new Card("ace", "hearts", 1);
      System.out.println("\n**** Tests Card 3: ace of hearts ****");
      System.out.println("  rank: " + _1ofHearts.getRank());
      System.out.println("  suit: " + _1ofHearts.getSuit());
      System.out.println("  pointValue: " + _1ofHearts.getPointValue());
      System.out.println("  toString: " + _1ofHearts.toString());
      
      // Test matches() method
      System.out.println("\n**** matches Tests with Card 1 ****\n");;
      if(aceHearts.matches(_7spades)){
          System.out.println("  matching with Card 2: true");
      }
      else System.out.println("  matching with Card 2: false"); 
      
      if(aceHearts.matches(_1ofHearts)){
          System.out.println("  matching with Card 3: true");
      }
      else System.out.println("  matching with Card 3: false");
   }
}
