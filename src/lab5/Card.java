/*
Alex Stevens
2/15/2017
Lab-5 Card Class
Csis 123B-3183
0495503
 */
package lab5;

import javafx.scene.image.ImageView;
import javafx.scene.control.*;
import javafx.scene.image.Image;
/**
 *
 * @author Alex
 */
public class Card 
{
// Private Variables

private Label holdimage = new Label();
private  Image cardImg;
private int cardValue;
private String namehold;
private Suit suit;

private boolean loadCard(String Dir)
{
    this.cardImg = new Image(Dir);
    
    ImageView newIm = new ImageView(this.cardImg);
    holdimage.setGraphic(newIm);
    
    getCardValue(Dir);
    
    return true;
}
public void setImage(String Dir)
{
    
   this.namehold = Dir;
   loadCard(Dir);
    
}
public Label getCard()
{
    return this.holdimage;
}
private void getCardValue(String Dir)
{
    //9,10,11\

    String rep = Dir.replaceAll("[a-zA-Z:./:]","");
    int valu = Integer.parseInt(rep);
    
// find out the suit of the card
  if(valu>=101&&valu<=113)
  {
   this.suit = Suit.Diamonds;  
   
  }
  else if(valu>=114&&valu<=126)
  {
      this.suit = Suit.Clubs;
  }
  
  else if(valu >= 127&& valu<=139)
  {
      this.suit = Suit.Hearts;
  }
  else if(valu>=140&&valu<=152)
  {
    this.suit = Suit.Spades;
  }
  
  // find out the value of the card
  int Algo = valu%13;
  // the number modulus 13 = the same number for each card face. ace is always 10 etc..
  switch(Algo)
  {
      case 0:
          this.cardValue = 4;
          break;
      case 1:
           this.cardValue = 5;
           break;
      
      case 2:
           this.cardValue = 6;
           break;
      
      case 3:
          this.cardValue = 7;
          break;
       
      case 4:
          this.cardValue = 8;
          break;
      
      case 5:
          this.cardValue = 9;
          break;
     
     // case 6 thru 9 is 10,jack,queen, and King - all worth 10 points.     
      case 6:
      case 7:
      case 8:
      case 9:
          this.cardValue =10;
          break;
      case 10:
          this.cardValue = 11;
          break;
      
      case 11:
           this.cardValue = 2;
           break;
           
      case 12:
          this.cardValue =3;
          break;
          
  }
  
}
  public int getValue()
  {
      return this.cardValue;
  }
  public Suit getSuit()
  {
      return this.suit;
  }


}