/**
 * Computer Science lab - Cards
 * 05-24-2021
 * Ryan Wagner
 */

public class Card {

   private String suit;      
   private String rank;      
   private int pointValue;   

   public Card(String cardRank, String cardSuit, int cardPointValue)
   {
      suit = cardSuit;
      rank = cardRank;
      pointValue = cardPointValue;
   }

    public String getSuit()
   {
      return suit;
    }

   public String getRank()
   {
      return rank;
   }

   public int getPointValue()
   {
      return pointValue;
   }

   public boolean matches(Card otherCard)
   {
      if((getSuit().compareTo(otherCard.getSuit()) == 0) && (getRank().compareTo(otherCard.getRank()) == 0) && getPointValue() == otherCard.getPointValue()){
          return true;
      }
      else return false;
   }

   @Override
   public String toString()
   {
      return String.format("%2s %s %s %s %s %s", rank, " of ", suit, "(point value = ", pointValue, ")");
   }
}
