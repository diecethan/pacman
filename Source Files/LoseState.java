import greenfoot.*;
import java.util.List;

public class LoseState extends State {
    int score;
    
    public LoseState(GameWorld gameWorld, int incomingScore) {
        super(gameWorld);
        score = incomingScore;
    }
    
    public void onSet() {
        GreenfootSound deathSound = new GreenfootSound("Death.mp3");
        deathSound.play();

        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();
        
        Text textOne = new Text("Game Over", 75, Color.WHITE, null, null);
        Text textTwo = new Text("Press 'Space' To Restart", 25, Color.WHITE, null, null);
        Text textThree = new Text("Score: " + score, 25, Color.WHITE, null, null);
        Text textFour = new Text("Press 'B' To Enter The Title Screen", 25, Color.WHITE, null, null);

        getWorld().addObject(textOne, worldWidth / 2, worldHeight / 2);
        getWorld().addObject(textTwo, worldWidth / 2, worldHeight * 2 / 3);
        getWorld().addObject(textThree, worldWidth / 2, worldHeight * 4 / 5);
        getWorld().addObject(textFour, worldWidth / 2, worldHeight * 3 / 4);
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