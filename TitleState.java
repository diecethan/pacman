import greenfoot.*;
import java.util.List;

public class TitleState extends State  {
    public TitleState(GameWorld gameWorld) {
        super(gameWorld);
    }
    
    public void onSet() {
        GreenfootSound introSound = new GreenfootSound("Intro.mp3");
        introSound.play();
        
        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();
        
        Text textOne = new Text("PacMan", 75, Color.WHITE, null, null);
        Text textTwo = new Text("Press 'Space' To Start", 25, Color.WHITE, null, null);
        Text textThree = new Text("Press 'A' For Instructions", 25, Color.WHITE, null, null);

        getWorld().addObject(textOne, worldWidth / 2, worldHeight / 2);
        getWorld().addObject(textTwo, worldWidth / 2, worldHeight * 2 / 3);
        getWorld().addObject(textThree, worldWidth / 2, worldHeight * 3 / 4);
    }
    
    public void onAct() {
        if(Greenfoot.isKeyDown("Space")) {
            LevelOne state = new LevelOne(getWorld());
            getWorld().setState(state);
        }
        
        if(Greenfoot.isKeyDown("A")) {
            Instructions state = new Instructions(getWorld());
            getWorld().setState(state);
        }
    }
}