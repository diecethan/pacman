import greenfoot.*;
import java.util.List;

public abstract class GameWorld extends World {
    private State currentState;
    
    public GameWorld() {
        super(600, 400, 1);
        currentState = null;
    }
    
    public GameWorld(int width, int height, int cellSize, boolean bounded) {
        super(width, height, cellSize, bounded);
        currentState = null;
    }
    
    public GameWorld(int width, int height, int cellSize) {
        super(width, height, cellSize);
        currentState = null;
    }
    
    public void setState(State newState) {
        if(currentState != null) {
            currentState.onRemove();
        }

        currentState = newState;
        currentState.onSet();
    }
    
    public void act() {
        if(currentState != null) {
            currentState.onAct();
        }
    }
}