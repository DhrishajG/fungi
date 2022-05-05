package board;

import java.util.ArrayList;

public class Hand implements Displayable{
  private ArrayList<Card> handList;

  public void add(Card c){
    handList.add(0, c);
  }

  public int size(){
    return handList.size();
  }

  public Card getElementsAt(int index){
    return handList.get(index);
  }

  public Card removeElement(int index){
    Card c = handList.getElementAt(index);
    handList.remove(c);
    return c;
  }
}
