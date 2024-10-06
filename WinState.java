import greenfoot.*;
import java.util.List;

public class WinState extends State {
    int score;
    
    public WinState(GameWorld gameWorld, int incomingScore) {
        super(gameWorld);
        score = incomingScore;
    }
    
    public void onSet() {
        GreenfootSound winSound = new GreenfootSound("Victory.mp3");
        winSound.play();
        
        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();

        Text textOne = new Text("You Win", 75, Color.WHITE, null, null);
        Text textTwo = new Text("Press 'Space' To Restart", 25, Color.WHITE, null, null);
        Text textThree = new Text("Score: " + score, 25, Color.WHITE, null, null);
        Text textFour = new Text("Press 'B' To  To Enter The Title Screen", 25, Color.WHITE, null, null);
        
        getWorld().addObject(textOne, worldWidth / 2, worldHeight / 2);
        getWorld().addObject(textTwo, worldWidth / 2, worldHeight * 2 / 3);
        getWorld().addObject(textFour, worldWidth / 2, worldHeight * 3 / 4);
        getWorld().addObject(textThree, worldWidth / 2, worldHeight * 4 / 5);
    }
    
    public void onAct() {
        if(Greenfoot.isKeyDown("Space")) {
            LevelOne state = new LevelOne(getWorld());
            getWorld().setState(state);
        }

        if(Greenfoot.isKeyDown("B")) {
            TitleState state = new TitleState(getWorld());
            getWorld().setState(state);
        }
    }
}
