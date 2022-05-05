package board;

import java.util.ArrayList;
import cards.Card;

public class Display implements Displayable{
  private ArrayList<Card> displayList;

  public void add(Card c){
    displayList.add(0, c);
  }

  public int size(){
    return displayList.size();
  }

  public Card getElementAt(int index){
    return displayList.get(index);
  }

  public Card removeElement(int index){
    Card c = displayList.getElementAt(index);
    displayList.remove(c);
    return c;
  }
}
