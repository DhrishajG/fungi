package board;

import cards.*;
import java.util.ArrayList;

public class Player{
  private Hand h;
  private Display d;
  private int score, handlimit, sticks;

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
    if(c.getName().equals("basket")){
      addCardtoDisplay(c);
      handlimit += 2;
    }
    else{
      h.add(c);
    }
  }

  public void addCardtoDisplay(Card c){
    d.add(c);
  }

  public boolean takeCardFromTheForest(int n){
    if(sticks >= (n-2)){
      Card c = Board.getForest().removeCardAt(Board.getForest().size()-(n));
      if(c.getName().equals("basket")){
        handlimit += 2;
        d.add(c);
      }
      else if(h.size() < handlimit){
        h.add(c);
      }
      if(n!=1 && n!=2){
        removeSticks(n-2);
      }
      return true;
    }
    return false;
  }

  public boolean takeFromDecay(){
    int dsize = Board.getDecayPile().size();
    int pihl = 0; //potential increase in hand limit.
    for(int i=0; i<Board.getDecayPile().size(); i++){
      Card c = Board.getDecayPile().get(i);
      if(c.getName().equals("basket")){
        pihl += 2;
        dsize -= 1;
      }
    }
    if((h.size() + dsize) <= (handlimit+pihl)){
      for(int i=0; i<Board.getDecayPile().size(); i++){
        Card c = Board.getDecayPile().get(i);
        if(c.getName().equals("basket")){
          d.add(c);
          handlimit += 2;
        }
        else{
          h.add(c);
        }
      }
      Board.getDecayPile().clear();
      return true;
    }
    return false;
  }

  public boolean cookMushrooms(ArrayList<Card> shrooms){
    int addScore = 0;
    boolean isPanInList = false;
    boolean isPanInDisplay = false;
    int numCider = 0;
    int numButter = 0;
    int mushroomIndex = -1;
    boolean canCook = false;
    boolean res = false;
    for(int i=0; i<shrooms.size(); i++){
      if(shrooms.get(i).getName().equals("pan")){
        isPanInList = true;
      }
      else if(shrooms.get(i).getType() == CardType.DAYMUSHROOM || shrooms.get(i).getType() == CardType.NIGHTMUSHROOM){
        mushroomIndex = i;
      }
      else if(shrooms.get(i).getType() == CardType.CIDER){
        numCider += 1;
      }
      else if(shrooms.get(i).getType() == CardType.BUTTER){
        numButter += 1;
      }
      else if(shrooms.get(i).getType() == CardType.BASKET){
        return false;
      }
    }

    for(int i=0; i<d.size(); i++){
      if(d.getElementAt(i).getName().equals("pan")){
        isPanInDisplay = true;
      }
    }


    if(mushroomIndex == -1){
      return false;
    }

    if(isPanInList == true || isPanInDisplay == true){
      int mushcount = 0;
      Card mush = shrooms.get(mushroomIndex);
      for(int i=0; i<shrooms.size(); i++){
        Card c = shrooms.get(i);
        if(c.getType() == CardType.DAYMUSHROOM || c.getType() == CardType.NIGHTMUSHROOM){
          if(c.getName().equals(mush.getName()) != true){
            return false;
          }
          if(c.getType() == CardType.DAYMUSHROOM){
            mushcount += 1;
          }
          else if(c.getType() == CardType.NIGHTMUSHROOM){
            mushcount += 2;
          }
        }
      }
      if(mushcount < 3){
        return false;
      }

      int mushRequired = (numCider*5) + (numButter*4);

      if(numCider == 0 && numButter == 0){
        mushRequired = 3;
      }

      if(mushcount >= mushRequired){
        canCook = true;
      }
      if(canCook){
        for(int i=0; i<shrooms.size(); i++){
          if(shrooms.get(i).getName().equals("pan") == false && shrooms.get(i).getName().equals("basket") == false){
            EdibleItem e = (EdibleItem)shrooms.get(i);
            if(shrooms.get(i).getType() == CardType.NIGHTMUSHROOM){
              score += e.getFlavourPoints()*2;
            }
            else{
              score += e.getFlavourPoints();
            }
          }
          else if(shrooms.get(i).getName().equals("basket")){
            handlimit += 2;
          }
          d.add(shrooms.get(i));
        }
        res = true;
      }
    }
    return res;
  }

  public boolean sellMushrooms(String n, int quantity){
    if(quantity < 2){
      return false;
    }
    String mushroomName = "";
    for(int i=0; i<n.length(); i++){
      char c = n.charAt(i);
      if(Character.isLetter(c) == false){
        continue;
      }
      if(Character.isUpperCase(c)){
        c = Character.toLowerCase(c);
      }
      mushroomName += c;


    }
    return false;
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
