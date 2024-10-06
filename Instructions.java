import greenfoot.*;
import java.util.List;

public class Instructions extends State {
    public Instructions(GameWorld gameWorld) {
        super(gameWorld);
    }
    
    public void onSet() {
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        
        Text intro = new Text("How To Play", 50, Color.WHITE, null, null);
        Text returnHome = new Text("Press 'Space' To Go Back To Title Screen", 15, Color.WHITE, null, null);
        
        getWorld().addObject(intro, 135, 25);
        getWorld().addObject(returnHome, width - 125, 10);
        
        Text move = new Text("Movement", 35, Color.RED, null, null);
        Text up = new Text("- Up (Up Arrow Or 'W')", 25, Color.WHITE, null, null);
        Text down = new Text("- Down (Down Arrow Or 'S')", 25, Color.WHITE, null, null);
        Text right = new Text("- Right (Right Arrow Or 'D')", 25, Color.WHITE, null, null);
        Text left = new Text("- Left (Left Arrow Or 'A')", 25, Color.WHITE, null, null);
        
        getWorld().addObject(move, 85, 60);
        getWorld().addObject(up, 129, 90);
        getWorld().addObject(down, 159, 110);
        getWorld().addObject(right, 156, 130);
        getWorld().addObject(left, 142, 150);
        
        Text extra = new Text("Extras", 35, Color.RED, null, null);
        Text pause = new Text("- (Un)Pause ('B' During The Game)", 25, Color.WHITE, null, null);
        
        getWorld().addObject(extra, 60, 180);
        getWorld().addObject(pause, 195, 210);
        
        Text winIntro = new Text("How To Win", 35, Color.RED, null, null);
        Text winCon = new Text("- Finish 3 Levels To Win", 25, Color.WHITE, null, null);
        Text endlessOne = new Text("- The Game Becomes Endless To", 25, Color.WHITE, null, null);
        Text endlessTwo = new Text("Increase Your Score Until Defeat", 25, Color.WHITE, null, null);
        
        getWorld().addObject(winIntro, 100, 240);
        getWorld().addObject(winCon, 141, 270);
        getWorld().addObject(endlessOne, 184, 290);
        getWorld().addObject(endlessTwo, 202, 310);
    }
    
    public void onAct() {
        if(Greenfoot.isKeyDown("space")) {
            TitleState state = new TitleState(getWorld());
            getWorld().setState(state);
        }
    }
}
