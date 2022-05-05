package board;

import java.util.ArrayList;
import cards;


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
      forestCardsPile.addCard(cards.HoneyFungus(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.HoneyFungus(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<8; i++){
      forestCardsPile.addCard(cards.TreeEar(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.TreeEar(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<6; i++){
      forestCardsPile.addCard(cards.LawyersWig(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.LawyersWig(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(cards.Shiitake(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.Shiitake(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<5; i++){
      forestCardsPile.addCard(cards.HenOfWoods(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.HenOfWoods(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(cards.BirchBolete(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.BirchBolete(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(cards.Porcini(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.Porcini(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<4; i++){
      forestCardsPile.addCard(cards.Chanterelle(cards.CardType.DAYMUSHROOM));
    }
    forestCardsPile.addCard(cards.Chanterelle(cards.CardType.NIGHTMUSHROOM));

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(cards.Morel(cards.CardType.DAYMUSHROOM));
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(cards.Butter());
    }

    for(int i=0; i<3; i++){
      forestCardsPile.addCard(cards.Cider());
    }

    for(int i=0; i<11; i++){
      forestCardsPile.addCard(cards.Pan());
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
