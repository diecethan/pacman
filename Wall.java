import greenfoot.*;

public class Wall extends Actor {
    int frames, lifeSpan, halfSpan, xPos, yPos;
    boolean halfLived, gameOn;
    
    public Wall() {
        gameOn = false;
        frames = 1;
        lifeSpan = 0;
        halfSpan = 1;
        halfLived = false;
        xPos = 0;
        yPos = 0;
    }
    
    public Wall(int lifeTime) {
        gameOn = false;
        frames = 0;
        lifeSpan = lifeTime;
        halfLived = false;
        xPos = 0;
        yPos = 0;
    }
    
    public Wall(int halfTime, int xPosition, int yPosition) {
        gameOn = false;
        frames = 0;
        lifeSpan = -1;
        halfSpan = halfTime;
        halfLived = true;
        xPos = xPosition;
        yPos = yPosition;
    }
    
    public void act()  {
        if(Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("Down")) {
            gameOn = true;
        }
        
        if(Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("D")) {
            gameOn = true;
        }
        
        if(Greenfoot.isKeyDown("B") && gameOn == false) {
            gameOn = !gameOn;
        }
        
        if(gameOn) {
            frames++;
        }
        
        if(frames == lifeSpan) {
            getWorld().removeObject(this);
        }
        
        if(gameOn == true && halfLived == true && (frames % halfSpan == 0)) {
            setLocation(0, 0);
        }

        if(halfLived == true && (frames % halfSpan == halfSpan / 2)){
            setLocation(xPos, yPos);
        }
    }    
}