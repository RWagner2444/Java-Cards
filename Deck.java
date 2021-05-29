import java.util.List;
import java.util.ArrayList;

/**
 * Computer Science lab - Cards
 * 05-24-2021
 * Ryan Wagner
 */
public class Deck
{
   private List<Card> cards;

   private int size;   

   public Deck(String[] ranks, String[] suits, int[] values)
   {
       cards = new ArrayList<Card>();
       for(int i = 0; i < ranks.length; i++){
           cards.add(new Card(ranks[i], suits[i], values[i]));
       }
   }

   public boolean isEmpty()
   {
      if(cards.size() == 0){
          return true;
      }
      else return false;
   }

   public int size()
   {
          return cards.size();
   }

   public Card deal()
   {
      int size = cards.size() - 1;
       if(size < 0){
          return null;
      }
      else{
          Card temp = cards.get(size);
          cards.remove(cards.get(size));
          return temp;
      }
   }

   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}
