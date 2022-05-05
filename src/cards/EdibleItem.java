package cards;

public abstract class EdibleItem extends Card{
  protected int flavourPoints;

  public EdibleItem(CardType ctype, String cname){
    super(ctype, cname);
  }

  public int getFlavourPoints(){
    return flavourPoints;
  }
}
