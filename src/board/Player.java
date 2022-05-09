package board;

import cards.*;
import java.util.ArrayList;

public class Player{
  Hand h;
  Display d;
  int score, handlimit, sticks;

  public Player(){
    h = new Hand();
    d = new Display();
    score = 0;
    handlimit = 8;
    sticks = 0;
    d.add(new Pan());
  }

  public int getScore(){
    return score;
  }

  public int getHandLimit(){
    return handlimit;
  }

  public int getStickNumber(){
    return sticks;
  }

  public void addSticks(int n){
    sticks += n;
    for(int i=0; i<n; i++){
      Card s = new cards.Stick();
      d.add(s);
    }
  }

  public void removeSticks(int n){
    sticks -= n;
    int counter = 0;
    for(int i=0; i<d.size(); i++){
      if(d.getElementAt(i).getName().equals("stick")){
        Card stick = d.removeElement(i);
        i -= 1;
        counter += 1;
        if(counter == n){
          break;
        }
      }
    }
  }

  public Hand getHand(){
    return h;
  }

  public Display getDisplay(){
    return d;
  }

  public void addCardtoHand(Card c){
    h.add(c);
  }

  public void addCardtoDisplay(Card c){
    d.add(c);
  }

  public boolean takeCardFromTheForest(int n){
    if(h.size()+1 <= handlimit && Board.getForest().size() >= n){
      if(sticks >= (n-2)){
        Card c = Board.getForest().removeCardAt(Board.getForest().size()-(n+1));
        h.add(c);
        if(c.getName().equals("basket")){
          handlimit += 2;
        }
        if(n!=1 && n!=2){
          removeSticks(2);
        }
        return true;
      }
    }
    return false;
  }

  public boolean takeFromDecay(){
    if((h.size()+Board.getDecayPile().size()) <= handlimit){
      int increaseHandLimit = 0;
      for(int i=0; i<Board.getDecayPile().size(); i++){
        Card c = Board.getDecayPile().get(i);
        this.addCardtoHand(c);
        if(c.getName().equals("basket")){
          increaseHandLimit += 2;
        }
      }
      handlimit += increaseHandLimit;
      Board.getDecayPile().clear();
      return true;
    }
    return false;
  }

  public boolean cookMushrooms(ArrayList<Card> shrooms){
    boolean isPanInList = false;
    boolean isPanInDisplay = false;
    for(int i=0; i<shrooms.size(); i++){
      if(shrooms.get(i).getName().equals("pan")){
        isPanInList = true;
        break;
      }
    }
    if(isPanInList == false){

    }
    return false;
  }

  public boolean sellMushrooms(String n, int i){
    return true;
  }

  public boolean putPanDown(){
    int flag = -1;
    for(int i=0; i<h.size(); i++){
      if(h.getElementAt(i).getName().equals("pan")){
        flag += 1;
        Card c = h.removeElement(i);
        d.add(c);
        return true;
      }
    }
    return false;
  }

}
