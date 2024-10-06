import greenfoot.*;
import java.util.List;

public class Ghost extends Actor {
    int randomDir;
    boolean canMove, randomize;
    
    GreenfootImage downImage = new GreenfootImage("GhostDown.png");
    GreenfootImage upImage = new GreenfootImage("GhostUp.png");
    GreenfootImage rightImage = new GreenfootImage("GhostRight.png");
    GreenfootImage leftImage = new GreenfootImage("GhostLeft.png");
    
    public Ghost() {
        randomDir = 0;
        canMove = false;
        randomize = true;
    }
    
    public Ghost(int dir, boolean isRandom) {
        randomDir = dir;
        canMove = false;
        randomize = isRandom;
    }
    
    public void act() {
        downImage.scale(20, 20);
        upImage.scale(20, 20);
        rightImage.scale(20, 20);
        leftImage.scale(20, 20);

        if(Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("Down")) {
            canMove = true;
        }
        
        if(Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("D")) {
            canMove = true;
        }
        
        if(Greenfoot.isKeyDown("B")) {
            canMove = !canMove;
        }
        
        if(canMove) {
            GreenfootImage img = getImage();
            int imageWidth = img.getWidth();
            int imageHeight = img.getHeight();
            List<Player> player = getWorld().getObjects(Player.class);
            int prevRandomDir = randomDir;
            
            if(randomize == true) {
                randomDir = Greenfoot.getRandomNumber(4);
            }
            
            if(randomDir == 0 && prevRandomDir == 3) {
                randomDir = prevRandomDir;
            }
            else if(randomDir == 3 && prevRandomDir == 0) {
                randomDir = prevRandomDir;
            }
            
            if(randomDir == 1 && prevRandomDir == 2) {
                randomDir = prevRandomDir;
            }
            else if(randomDir == 2 && prevRandomDir == 1) {
                randomDir = prevRandomDir;
            }
            
            if(randomize && randomDir == 0 && getOneObjectAtOffset(-imageWidth, 0, Wall.class) != null) {
                if(getOneObjectAtOffset(0, imageHeight, Wall.class) == null) {
                    randomDir = 1;
                }
                else if(getOneObjectAtOffset(0, -imageHeight, Wall.class) == null) {
                    randomDir = 2;
                }
                else if(getOneObjectAtOffset(imageWidth, 0, Wall.class) == null) {
                    randomDir = 3;
                }
            }
            
            if(randomize && randomDir == 3 && getOneObjectAtOffset(imageWidth, 0, Wall.class) != null) {
                if(getOneObjectAtOffset(0, imageHeight, Wall.class) == null) {
                    randomDir = 1;
                }
                else if(getOneObjectAtOffset(0, -imageHeight, Wall.class) == null) {
                    randomDir = 2;
                }
                else if(getOneObjectAtOffset(-imageWidth, 0, Wall.class) == null) {
                    randomDir = 0;
                }
            }
            
            if(randomize && randomDir == 1 && getOneObjectAtOffset(0, imageHeight, Wall.class) != null) {
                if(getOneObjectAtOffset(-imageWidth, 0, Wall.class) == null) {
                    randomDir = 0;
                }
                else if(getOneObjectAtOffset(imageWidth, 0, Wall.class) == null) {
                    randomDir = 3;
                }
                else if(getOneObjectAtOffset(0, -imageHeight, Wall.class) == null) {
                    randomDir = 2;
                }
            }
            
            if(randomize && randomDir == 2 && getOneObjectAtOffset(0, -imageHeight, Wall.class) != null) {
                if(getOneObjectAtOffset(-imageWidth, 0, Wall.class) == null) {
                    randomDir = 0;
                }
                else if(getOneObjectAtOffset(imageWidth, 0, Wall.class) == null) {
                    randomDir = 3;
                }
                else if(getOneObjectAtOffset(0, imageHeight, Wall.class) == null) {
                    randomDir = 1;
                }
            }
            
            if(!randomize && randomDir == 2  && getOneObjectAtOffset(0, -imageHeight, Wall.class) != null) {
                randomDir = 1;
            }
            
            if(!randomize && randomDir == 1 && getOneObjectAtOffset(0, imageHeight, Wall.class) != null) {
                randomDir = 2;
            }
            
            if(!randomize && randomDir == 0 && getOneObjectAtOffset(-imageWidth, 0, Wall.class) != null) {
                randomDir = 3;
            }
            
            if(randomize == false && randomDir == 3 && getOneObjectAtOffset(imageWidth, 0, Wall.class) != null) {
                randomDir = 0;
            }
            
            if (randomDir == 0 && getX() > imageWidth / 2) {
                setLocation(getX() - imageWidth, getY());
                setImage(leftImage);
            }
            
            if (randomDir == 1 && getY() < getWorld().getHeight() - imageHeight / 2) {
                setLocation(getX(), getY() + imageHeight);
                setImage(downImage);
            }
            
            if (randomDir == 2 && getY() > imageHeight / 2) {
                setLocation(getX(), getY() - imageHeight);
                setImage(upImage);
            }
            
            if (randomDir == 3 && getX() < getWorld().getWidth() - imageWidth / 2) {
                setLocation(getX() + imageWidth, getY());
                setImage(rightImage);
            }
        }
    }
}