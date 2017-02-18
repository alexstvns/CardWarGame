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

private Label holdimage;
private  Image cardImg;
private int cardValue;
private String namehold;

private boolean loadCard(String path)
{
    this.cardImg = new Image(path);
    
    ImageView newIm = new ImageView(this.cardImg);
    this.holdimage.setGraphic(newIm);
    
    return true;
}
public void setImage(String path)
{
   this.namehold = path;
   loadCard(path);
    
}
public Label getCard()
{
    return this.holdimage;
}

    
}
