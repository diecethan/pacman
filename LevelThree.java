import greenfoot.*;
import java.util.List;

public class LevelThree extends State {
    int score;

    public LevelThree(GameWorld gameWorld, int incomingScore) {
        super(gameWorld);
        score = incomingScore;
    }
    
    public void onSet() {
        for(int coinRow = 1; coinRow < 28; coinRow++) {
            for(int coinCol = 1; coinCol < 19; coinCol++) {
                Coin coin = new Coin();
                coin.getImage().scale(10, 10);
                
                if(coinRow != 2 && coinRow != 26 && coinRow != 12 && coinRow != 13 && coinRow != 14 & coinRow != 15 &&  coinRow != 16) {
                    getWorld().addObject(coin, coinRow * 20 + 10, coinCol * 20 + 10);
                }
            }
        }
        
        for(int horGridIndex = 0; horGridIndex < 30; horGridIndex++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();

            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, horGridIndex * 20 + wallImg.getWidth() / 2, wallImg.getHeight() / 2);
            getWorld().addObject(wallTwo, horGridIndex * 20 + wallImg.getWidth() / 2, getWorld().getHeight() - wallImg.getHeight() / 2);
        }
        
        for(int vertGridIndex = 0; vertGridIndex < 20; vertGridIndex++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);
            
            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, wallImg.getWidth() / 2, vertGridIndex * 20 + wallImg.getHeight() / 2);
            getWorld().addObject(wallTwo, getWorld().getWidth() - wallImg.getWidth() / 2, vertGridIndex * 20 + wallImg.getHeight() / 2);
        }
        
        for(int i = 0; i < 5; i++) {
            Wall wallOne = new Wall(50);
            Wall wallTwo = new Wall(50);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);
            
            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 + wallImg.getHeight() * 5 / 2);
        }
        
        for(int i = 0; i < 5; i++) {
            Wall wallOne = new Wall(50);
            Wall wallTwo = new Wall(50);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);
            
            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
        }
        
        for(int i = 0; i < 16; i++) {
            if(i != 7 && i != 8) {
                Wall wallOne = new Wall();
                Wall wallTwo = new Wall();
                
                wallOne.getImage().scale(20, 20);
                wallTwo.getImage().scale(20, 20);
                
                GreenfootImage wallImg = wallOne.getImage();
                getWorld().addObject(wallOne, 50, 50 + i * 20);
                getWorld().addObject(wallTwo, getWorld().getWidth() - 50, 50 + i * 20);
            }
        }
        
        Player player = new Player();
        player.getImage().scale(20, 20);
        GreenfootImage playerImg = player.getImage();
        getWorld().addObject(player, getWorld().getWidth() / 2, getWorld().getHeight() - (playerImg.getHeight() * 3 / 2));
        
        Text scoreText = new Text("Score:", 20, Color.WHITE, null, null);
        Text scoreNum = new Text(String.valueOf(score), 20, Color.WHITE, null, null);
        
        getWorld().addObject(scoreText, 25, 10);
        getWorld().addObject(scoreNum, 60, 10);
        
        int extraGhosts = (score - 157 + 360) / 360;
        for(int i = 0; i < extraGhosts; i++) {
            Ghost extraGhost = new Ghost();
            extraGhost.getImage().scale(20, 20);
            getWorld().addObject(extraGhost, getWorld().getWidth() / 2, getWorld().getHeight() / 2 - 10);
        }
        
        Ghost ghostOne = new Ghost(1, false);
        Ghost ghostTwo = new Ghost(1, false);
        Ghost ghostThree = new Ghost(1, false);
        Ghost ghostFour = new Ghost(1, false);
        
        ghostOne.getImage().scale(20, 20);
        ghostTwo.getImage().scale(20, 20);
        ghostThree.getImage().scale(20, 20);
        ghostFour.getImage().scale(20, 20);
        
        getWorld().addObject(ghostOne, 20 * 3 / 2, 20 * 3 / 2);
        getWorld().addObject(ghostTwo, getWorld().getWidth() - 20 * 3 / 2, 20 * 3 / 2);
        getWorld().addObject(ghostThree, getWorld().getWidth() - 30, getWorld().getHeight() - 30);
        getWorld().addObject(ghostFour, 30, getWorld().getHeight() - 30);
    }
    
    public void onAct() {
        List<Player> players = getWorld().getObjects(Player.class);
        List<Coin> coins = getWorld().getObjects(Coin.class);
        List<Ghost> ghosts = getWorld().getObjects(Ghost.class);
        List<Wall> walls = getWorld().getObjects(Wall.class);
        List<Text> texts = getWorld().getObjectsAt(55, 10, Text.class);
        
        Text scoreText = texts.get(0);
        int scoreVal = Integer.valueOf(scoreText.getText());
        
        if(players.size() == 0 && scoreVal < 517) {
            LoseState state = new LoseState(getWorld(), scoreVal);
            getWorld().setState(state);
        }
        
        if(players.size() == 0 && scoreVal >= 517) {
            WinState state = new WinState(getWorld(), scoreVal);
            getWorld().setState(state);
        }

        if(coins.size() == 0) {
            getWorld().removeObjects(players);
            getWorld().removeObjects(ghosts);
            getWorld().removeObjects(walls);
            
            LevelThree state = new LevelThree(getWorld(), scoreVal);
            getWorld().setState(state);
        }
    }
}
