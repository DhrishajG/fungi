package cards;

public class Mushroom extends EdibleItem{
  protected int sticksPerMushroom;

  public Mushroom(CardType ctype, String cname){
    super(ctype, cname);
  }

  public int getSticksPerMushroom(){
    return sticksPerMushroom;
  }
}
