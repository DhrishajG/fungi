package board;

import cards.Card;
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

  }

  public void addCardToHand(Card c){
    h.add(c);
  }

  public void addCardToDisplay(Card c){
    d.add(c);
  }

  public boolean takeCardFromTheForest(int i){

  }

  public boolean takeFromDecay(){

  }

}
