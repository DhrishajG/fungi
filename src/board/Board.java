package board;

import java.util.ArrayList;
import cards.*;


public class Board{
  private CardPile forestCardsPile;
  private CardList forest;
  private ArrayList<Card> decayPile;

  public void initialisePiles(){
    forestCardsPile = new CardPile();
    forest = new CardList();
    decayPile = new ArrayList<Card>();
  }

  public void setUpCards(){
    for(int i=0; i<10; i++){
      forestCardsPile.addCard(new HoneyFungus(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new HoneyFungus(CardType.NIGHTMUSHROOM));

    for(int i=0; i<8; i++){
      forestCardsPile.addCard(new TreeEar(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new TreeEar(CardType.NIGHTMUSHROOM));

    for(int i=0; i<6; i++){
      forestCardsPile.addCard(new LawyersWig(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new LawyersWig(CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(new Shiitake(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new Shiitake(CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(new HenOfWoods(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new HenOfWoods(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(new BirchBolete(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new BirchBolete(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(new Porcini(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new Porcini(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(new Chanterelle(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(new Chanterelle(CardType.NIGHTMUSHROOM));

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(new Morel(CardType.DAYMUSHROOM));
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(new Butter());
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(new Cider());
    }

    for(int i=0; i<11; i++){
      forestCardsPile.addCard(new Pan());
    }
  }

  public CardPile getForestCardsPile(){
    return forestCardsPile;
  }

  public CardList getForest(){
    return forest;
  }

  public ArrayList<Card> getDecayPile(){
    return decayPile;
  }

  public void updateDecayPile(){
    int s = forest.size();
    if(s != 0){
      Card c = forest.getElementAt(s-1);
      forest = forest.removeCardAt(s-1);
      decayPile.add(c);
    }
  }
}
