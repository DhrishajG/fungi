package cards;

public abstract class Card{

  protected CardType type;
  protected String cardName;

  public Card(CardType ctype, String cname){
    type = ctype;
    cardName = cname;
  }

  public CardType getType(){
    return type;
  }

  public String getName(){
    return cardName;
  }
}
