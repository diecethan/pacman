import greenfoot.*;
import java.util.List;

public class LevelTwo extends State {
    int score;
    
    public LevelTwo(GameWorld gameWorld, int incomingScore) {
        super(gameWorld);
        score = incomingScore;
    }
    
    public void onSet() {
        for(int vertGridIndex = 1; vertGridIndex < 19; vertGridIndex++) {
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);

            GreenfootImage coinImg = coinOne.getImage();
            getWorld().addObject(coinOne, 30, vertGridIndex * 20 + 10);
            getWorld().addObject(coinTwo, getWorld().getWidth() - 30, vertGridIndex * 20 + 10);
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
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);

            Wall wallOne = new Wall(30);
            Wall wallTwo = new Wall(30);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(coinOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2);
            getWorld().addObject(coinTwo,getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 + wallImg.getHeight() * 5 / 2);
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 - wallImg.getWidth() * 2 + i * 20, getWorld().getHeight() / 2 + wallImg.getHeight() * 5 / 2);
        }
        
        for(int i = 0; i < 5; i ++) {
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);

            Wall wallOne = new Wall(30);
            Wall wallTwo = new Wall(30);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(coinOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(coinTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallOne, getWorld().getWidth() / 2 - wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
            getWorld().addObject(wallTwo,getWorld().getWidth() / 2 + wallImg.getWidth() * 2, getWorld().getHeight() / 2 - wallImg.getHeight() * 5 / 2 + i * 20);
        }
        
        for(int i = 0; i < 4; i ++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, wallImg.getWidth() * 5 / 2, wallImg.getHeight() * 5 / 2 + i * 40);
            getWorld().addObject(wallTwo, getWorld().getWidth() - wallImg.getWidth() * 5 / 2, wallImg.getHeight() * 5 / 2 + i * 40);
        }
        
        for(int i = 0; i < 4; i ++) {
            Wall wallOne = new Wall();
            Wall wallTwo = new Wall();
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);

            GreenfootImage wallImg = wallOne.getImage();
            getWorld().addObject(wallOne, wallImg.getWidth() * 5 / 2, getWorld(). getHeight() - wallImg.getHeight() * 5 / 2 - i * 40);
            getWorld().addObject(wallTwo, getWorld().getWidth() - wallImg.getWidth() * 5 / 2, getWorld(). getHeight() - wallImg.getHeight() * 5 / 2 - i * 40);
        }
        
        for(int i = 0; i < 3; i ++) {
            Wall wallOne = new Wall(10, 110 + i * 20, 90);
            Wall wallTwo = new Wall(10, 110 + i * 20, 130);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);
            
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);
            
            getWorld().addObject(wallOne, 110 + i * 20, 90);
            getWorld().addObject(wallTwo, 110 + i * 20, 130);
            getWorld().addObject(coinOne, 110 + i * 20, 90);
            getWorld().addObject(coinTwo, 110 + i * 20, 130);
        }
        
        for(int i = 0; i < 3; i ++) {
            Wall wallOne = new Wall(10, getWorld().getWidth() - 110 - i * 20, 90);
            Wall wallTwo = new Wall(10, getWorld().getWidth() - 110 - i * 20, 130);
            
            wallOne.getImage().scale(20, 20);
            wallTwo.getImage().scale(20, 20);
            
            Coin coinOne = new Coin();
            Coin coinTwo = new Coin();
            
            coinOne.getImage().scale(10, 10);
            coinTwo.getImage().scale(10, 10);
            
            getWorld().addObject(wallOne, getWorld().getWidth() - 110 - i * 20, 90);
            getWorld().addObject(wallTwo, getWorld().getWidth() - 110 - i * 20, 130);
            getWorld().addObject(coinOne, getWorld().getWidth() - 110 - i * 20, 90);
            getWorld().addObject(coinTwo, getWorld().getWidth() - 110 - i * 20, 130);
        }
        
        Coin coinOne = new Coin();
        Coin coinTwo = new Coin();
        Coin coinThree = new Coin();
        Coin coinFour = new Coin();

        coinOne.getImage().scale(10, 10);
        coinTwo.getImage().scale(10, 10);
        coinThree.getImage().scale(10, 10);
        coinFour.getImage().scale(10, 10);
        
        getWorld().addObject(coinOne, 110, 110);
        getWorld().addObject(coinTwo, 150, 110);
        getWorld().addObject(coinThree, getWorld().getWidth() - 150, 110);
        getWorld().addObject(coinFour, getWorld().getWidth() - 110, 110);
        
        Wall wallOne = new Wall(10, 110, 110);
        Wall wallTwo = new Wall(10, 150, 110);
        Wall wallThree = new Wall(10, getWorld().getWidth() - 150, 110);
        Wall wallFour = new Wall(10, getWorld().getWidth() - 110, 110);

        wallOne.getImage().scale(20, 20);
        wallTwo.getImage().scale(20, 20);
        wallThree.getImage().scale(20, 20);
        wallFour.getImage().scale(20, 20);

        getWorld().addObject(wallOne, 110, 110);
        getWorld().addObject(wallTwo, 150, 110);
        getWorld().addObject(wallThree, getWorld().getWidth() - 150, 110);
        getWorld().addObject(wallFour, getWorld().getWidth() - 110, 110);
        
        Player player = new Player();
        GreenfootImage playerImg = player.getImage();
        player.getImage().scale(20, 20);
        getWorld().addObject(player, getWorld().getWidth() / 2, getWorld().getHeight() - (playerImg.getHeight() * 3 / 2));
        
        Ghost ghostOne = new Ghost();
        Ghost ghostTwo = new Ghost(1, false);
        Ghost ghostThree = new Ghost(1, false);
        Ghost ghostFour = new Ghost();
        Ghost ghostFive = new Ghost();
        Ghost ghostSix = new Ghost(4, false);
        Ghost ghostSeven = new Ghost(4, false);
        GreenfootImage ghostImg = ghostOne.getImage();
        
        ghostOne.getImage().scale(20, 20);
        ghostTwo.getImage().scale(20, 20);
        ghostThree.getImage().scale(20, 20);
        ghostFour.getImage().scale(20, 20);
        ghostFive.getImage().scale(20, 20);
        ghostSix.getImage().scale(20, 20);
        ghostSeven.getImage().scale(20, 20);
        
        getWorld().addObject(ghostOne, getWorld().getWidth() / 2, ghostImg.getHeight() * 3 / 2);
        getWorld().addObject(ghostTwo, ghostImg.getWidth() * 3 / 2, ghostImg.getHeight() * 3 / 2);
        getWorld().addObject(ghostThree, getWorld().getWidth() - ghostImg.getWidth() * 3 / 2, ghostImg.getHeight() * 3 / 2);
        getWorld().addObject(ghostFour, getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 10);
        getWorld().addObject(ghostFive, getWorld().getWidth() / 2, getWorld().getHeight() / 2 - 10);
        getWorld().addObject(ghostSix, 130, 110);
        getWorld().addObject(ghostSeven, getWorld().getWidth() - 130, 110);
        
        Text scoreText = new Text("Score:", 20, Color.WHITE, null, null);
        Text scoreNum = new Text(String.valueOf(score), 20, Color.WHITE, null, null);
        
        getWorld().addObject(scoreText, 25, 10);
        getWorld().addObject(scoreNum, 60, 10);
    }
    
    public void onAct() {
        List<Player> players = getWorld().getObjects(Player.class);
        List<Coin> coins = getWorld().getObjects(Coin.class);
        List<Ghost> ghosts = getWorld().getObjects(Ghost.class);
        List<Wall> walls = getWorld().getObjects(Wall.class);
        List<Text> texts = getWorld().getObjectsAt(55, 10, Text.class);
        
        Text scoreText = texts.get(0);
        int scr = Integer.valueOf(scoreText.getText());
        if(players.size() == 0) {
            LoseState state = new LoseState(getWorld(), score);
            getWorld().setState(state);
        }

        if(coins.size() == 0) {
            getWorld().removeObjects(players);
            getWorld().removeObjects(ghosts);
            getWorld().removeObjects(walls);
            
            LevelThree state = new LevelThree(getWorld(), score);
            getWorld().setState(state);
        }
    }
}