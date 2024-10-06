import greenfoot.*;
import java.util.List;

public abstract class State {
    private GameWorld world;
    
    public State(GameWorld gameWorld) {
        world = gameWorld;
    }
    
    public GameWorld getWorld() {
        return world;
    }
    
    public abstract void onSet();
    
    public void onRemove() {
        List<Actor> actors = getWorld().getObjects(Actor.class);
        if(actors != null) {
            getWorld().removeObjects(actors);
        }
    }
    
    public void onAct() {}
}