package board;

import cards.Card;
import java.util.ArrayList;

public class Hand implements Displayable{
  private ArrayList<Card> handList;

  public Hand(){
    handList = new ArrayList<Card>();
  }

  public void add(Card c){
    handList.add(c);
  }

  public int size(){
    return handList.size();
  }

  public Card getElementAt(int index){
    return handList.get(index);
  }

  public Card removeElement(int index){
    return handList.remove(index);
  }
}
