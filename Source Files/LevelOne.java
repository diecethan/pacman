import greenfoot.*;
import java.util.List;

public class LevelOne extends State {
    public LevelOne(GameWorld gameWorld) {
        super(gameWorld);
    }
    
    public void onSet() {
        for(int vertGridIndex = 1; vertGridIndex < 19; vertGridIndex++) {
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);

            getWorld().addObject(coinOne, 30, vertGridIndex * 20 + 10);
            getWorld().addObject(coinTwo, getWorld().getWidth() - 30, vertGridIndex * 20 + 10);
        }
        
        for(int horGridIndex = 1; horGridIndex < 26; horGridIndex++) {
            Coin coinOne = new Coin();
            coinOne.getImage().scale(10, 10);
            getWorld().addObject(coinOne, horGridIndex * 20 + 30, 30);

            if(horGridIndex != 13) {
                Coin coinTwo = new Coin();
                coinTwo.getImage().scale(10, 10);
                getWorld().addObject(coinTwo, horGridIndex * 20 + 30, getWorld().getHeight() - 30);
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
        
        for(int i = 0; i < 5; i ++) {
            Wall wallOne = new Wall(150);
            Wall wallTwo = new Wall(150);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 + wallImg.getHeight() * 5 / 2);
        }
        
        for(int i = 0; i < 5; i ++) {
            Wall wallOne = new Wall(150);
            Wall wallTwo = new Wall(150);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
        }
        
        for(int i = 0; i < 6; i ++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 6, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 6, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
        }
        
        for(int i = 0; i < 6; i ++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 8, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 8, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
        }
        
        Player player = new Player();
        player.getImage().scale(20, 20);
        GreenfootImage playerImg = player.getImage();
        getWorld().addObject(player, getWorld().getWidth() / 2, getWorld().getHeight() - (playerImg.getHeight() * 3 / 2));
        
        Ghost ghostOne = new Ghost(1, false);
        Ghost ghostTwo = new Ghost(1, false);
        Ghost ghostThree = new Ghost();
        Ghost ghostFour = new Ghost(3, false);
        GreenfootImage ghostImg = ghostOne.getImage();

        ghostOne.getImage().scale(20, 20);
        ghostTwo.getImage().scale(20, 20);
        ghostThree.getImage().scale(20, 20);
        ghostFour.getImage().scale(20, 20);
        
        getWorld().addObject(ghostOne, ghostImg.getWidth() * 3 / 2, ghostImg.getHeight() * 3 / 2);
        getWorld().addObject(ghostTwo, getWorld().getWidth() - ghostImg.getWidth() * 3 / 2, ghostImg.getHeight() * 3 / 2);
        getWorld().addObject(ghostThree, getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 10);
        getWorld().addObject(ghostFour, getWorld().getWidth() / 2, ghostImg.getHeight() * 3 / 2);
        
        Text scoreText = new Text("Score:", 20, Color.WHITE, null, null);
        Text score = new Text(String.valueOf(0), 20, Color.WHITE, null, null);
        
        getWorld().addObject(scoreText, 25, 10);
        getWorld().addObject(score, 60, 10);
    }
    
    public void onAct() {
        List<Player> players = getWorld().getObjects(Player.class);
        List<Coin> coins = getWorld().getObjects(Coin.class);
        List<Ghost> ghosts = getWorld().getObjects(Ghost.class);
        List<Wall> walls = getWorld().getObjects(Wall.class);
        List<Text> texts = getWorld().getObjectsAt(55, 10, Text.class);
        
        Text scoreText = texts.get(0);
        int score = Integer.valueOf(scoreText.getText());
        
        if(players.size() == 0) {
            LoseState state = new LoseState(getWorld(), score);
            getWorld().setState(state);
        }

        if(coins.size() == 0) {
            getWorld().removeObjects(players);
            getWorld().removeObjects(ghosts);
            getWorld().removeObjects(walls);
            
            LevelTwo state = new LevelTwo(getWorld(), score);
            getWorld().setState(state);
        }
    }
}