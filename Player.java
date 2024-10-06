import greenfoot.*;
import java.util.List;

public class Player extends Actor {
    int dir = 0;
    int currImage = 0;
    int preImage = 0;
    int wak = 0;
    GreenfootSound waka = new GreenfootSound("Waka.mp3");

    public void act() {
        if(wak == 1) {
            waka.playLoop();
            wak++;
        }

        GreenfootImage closeImage = new GreenfootImage("PacClose.png");
        GreenfootImage halfImage = new GreenfootImage("PacHalf.png");
        GreenfootImage fullImage = new GreenfootImage("PacFull.png");

        closeImage.scale(20, 20);
        halfImage.scale(20, 20);
        fullImage.scale(20, 20);
        
        GreenfootImage image = getImage();
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        
        if((Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("A")) && getX() != imageWidth / 2) {
            dir = 1;
        }
        
        if((Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("S")) && getY() != getWorld().getHeight() - imageHeight / 2) {
            dir = 2;
        }
        
        if((Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("W")) && getY() != imageHeight / 2) {
            dir = 3;
        }
        
        if((Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("D")) && getX() != getWorld().getWidth() - imageWidth / 2) {
            dir = 4;
        }
        
        if(Greenfoot.isKeyDown("B")) {
            dir = 5;
        }
        
        if(dir == 1 && getX() != imageWidth / 2 && getOneObjectAtOffset(-imageWidth, 0, Wall.class) == null) {
            setLocation(getX() - imageWidth, getY());
            setRotation(180);
            
            if(wak == 0) {
                wak++;
            }

            if(currImage == 0) {
                setImage(closeImage);
                currImage++;
                preImage = 0;
            }
            else if(currImage == 1) {
                setImage(halfImage);
                if(preImage == 0) {
                    currImage++;
                } else {
                    currImage--;
                }
            } else {
                setImage(fullImage);
                currImage--;
                preImage = 2;
            }
        }
        
        if(dir == 2 && getY() != getWorld().getHeight() - imageHeight / 2 && getOneObjectAtOffset(0, imageHeight, Wall.class) == null) {
            setLocation(getX(), getY() + imageHeight);
            setRotation(90);

            if(wak == 0) {
                wak++;
            }

            if(currImage == 0) {
                setImage(closeImage);
                currImage++;
                preImage = 0;
            }
            else if(currImage == 1) {
                setImage(halfImage);
                if(preImage == 0) {
                    currImage++;
                } else {
                    currImage--;
                }
            } else {
                setImage(fullImage);
                currImage--;
                preImage = 2;
            }
        }
        
        if(dir == 3 && getY() != imageHeight / 2 && getOneObjectAtOffset(0, -imageHeight, Wall.class) == null) {
            setLocation(getX(), getY() - imageHeight);
            setRotation(270);
            
            if(wak == 0) {
                wak++;
            }
            
            if(currImage == 0) {
                setImage(closeImage);
                currImage++;
                preImage = 0;
            }
            else if(currImage == 1) {
                setImage(halfImage);
                if(preImage == 0) {
                    currImage++;
                } else {
                    currImage--;
                }
            } else {
                setImage(fullImage);
                currImage--;
                preImage = 2;
            }
        }
        
        if(dir == 4 && getX() != getWorld().getWidth() - imageWidth / 2 && getOneObjectAtOffset(imageWidth, 0, Wall.class) == null) {
            setLocation(getX() + imageWidth, getY());
            setRotation(0);
            
            if(wak == 0) {
                wak++;
            }

            if(currImage == 0) {
                setImage(closeImage);
                currImage++;
                preImage = 0;
            }
            else if(currImage == 1) {
                setImage(halfImage);
                if(preImage == 0) {
                    currImage++;
                } else {
                    currImage--;
                }
            } else {
                setImage(fullImage);
                currImage--;
                preImage = 2;
            }
        }
        
        if(getOneIntersectingObject(Ghost.class) != null) {
            waka.stop();
            getWorld().removeObject(this);
        }
    }
}