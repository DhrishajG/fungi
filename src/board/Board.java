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
      forestCardsPile.addCard(HoneyFungus(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(HoneyFungus(CardType.NIGHTMUSHROOM));

    for(int i=0; i<8; i++){
      forestCardsPile.addCard(TreeEar(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(TreeEar(CardType.NIGHTMUSHROOM));

    for(int i=0; i<6; i++){
      forestCardsPile.addCard(LawyersWig(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(LawyersWig(CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(Shiitake(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(Shiitake(CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(HenOfWoods(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(HenOfWoods(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(BirchBolete(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(BirchBolete(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(Porcini(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(Porcini(CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(Chanterelle(CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(Chanterelle(CardType.NIGHTMUSHROOM));

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(Morel(CardType.DAYMUSHROOM));
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(Butter());
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(Cider());
    }

    for(int i=0; i<11; i++){
      forestCardsPile.addCard(Pan());
    }
  }

  public CardPile getForestCardPile(){
    return forestCardsPile;
  }

  public CardList getForest(){
    return forest;
  }

  public ArrayList<Card> getDecayPile(){
    return decayPile;
  }

  public void updateDecayPile(){

  }
}
