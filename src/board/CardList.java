package board;

import cards.Card;
import java.util.ArrayList;

public class CardList{
  private ArrayList<Card> cList;

  public CardList(){
    cList = new ArrayList<Card>();
  }

  public void add(Card c){
    cList.add(0, c);
  }

  public int size(){
    return cList.size();
  }

  public Card getElementAt(int index){
    return cList.get(index);
  }

  public Card removeCardAt(int index){
    Card c = this.getElementAt(size()-1);
    cList.remove(index);
    return c;
  }
}
