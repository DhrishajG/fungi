package board;

import cards.Card;
import java.util.*;

class CardPile{
  private Stack<Card> cPile;

  public CardPile(){
    cPile = new Stack<Card>();
  }

  public void addCard(Card c){
    cPile.push(c);
  }

  public Card drawCard(){
    return cPile.pop();
  }

  public void shufflePile(){
    Collections.shuffle(cPile);
  }

  public int pileSize(){
    int size = cPile.size();
    return size;
  }

  public boolean isEmpty(){
    if(this.pileSize() == 0){
      return true;
    }
    return false;
  }
  
}
