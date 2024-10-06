import greenfoot.*;

public class FloatingText extends Text {
    int dx, dy, transparencyChange, timeToLive;
    
    public FloatingText() {
        dx = 1;
        dy = -1;
        transparencyChange = 5;
        timeToLive = 100;
    }
    
    public FloatingText(int x, int y, int change, int life) {
        dx = x;
        dy = y;
        transparencyChange = change;
        timeToLive = life;
    }
    
    public void act() {
        if(timeToLive == 0) {
            getWorld().removeObject(this);
        } else {
            int currentTransparency = getImage().getTransparency();
            if(currentTransparency <= 255 && currentTransparency >= 0 + transparencyChange) {
                getImage().setTransparency(currentTransparency - transparencyChange);
            }

            setLocation(getX() + dx, getY() + dy);
            timeToLive --;
        }
    }
}