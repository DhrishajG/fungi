package board;

public interface Displayable{
  public void addCard(Card c);
  public int size();
  public Card getElementAt(int index);
  public Card removeElement(int index);
}
