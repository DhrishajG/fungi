package board;

import java.util.ArrayList;
import cards.Card;

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

  public Card getElementsAt(int index){
    return cList.get(index)
  }

  public Card removeCardAt(int index){
    cList.remove(index);
    return cList;
  }
}
