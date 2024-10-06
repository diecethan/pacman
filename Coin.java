import greenfoot.*;
import java.util.List;

public class Coin extends Actor {
    GreenfootImage coinImage_Full = new GreenfootImage("Coin.png");
    GreenfootImage coinImage_Half = new GreenfootImage("CoinS.png");
    boolean spinCycle = false;
    boolean spin = true;

    public void act() {
        coinImage_Full.scale(10, 10);
        coinImage_Half.scale(5, 10);
            
        if(Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("Down")) {
            spin = true;
        }
        
        if(Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("D")) {
            spin = true;
        }
        
        if(Greenfoot.isKeyDown("B")) {
            spin = !spin;
        }
        
        if(spin) {
            if(spinCycle) {
                setImage(coinImage_Full);
            } else {
                setImage(coinImage_Half);
            }
            spinCycle = !spinCycle;
        }

        if(getOneIntersectingObject(Player.class) != null) {
            collect();
        }
    }
        
    public void collect() {
        List<Text> texts = getWorld().getObjectsAt(55, 10, Text.class);
        Text scoreText = texts.get(0);
        int score = Integer.valueOf(scoreText.getText());
        scoreText.setText(String.valueOf(score + 1));
        
        FloatingText text = new FloatingText(1, 1, 10, 20);
        getWorld().addObject(text, getX() + 10, getY() + 10);
    
        getWorld().removeObject(this);
    }    
}