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

  public Card getElementsAt(int index){
    return cList.get(index);
  }

  public Card removeCardAt(int index){
    cList.remove(index);
    return cList;
  }
}
