import greenfoot.*;

public class MyWorld extends GameWorld {
    private int score;
    private Text scoreText;

    public MyWorld() {
        super(580, 400, 1, false);
        score = 0;
        TitleState state = new TitleState(this);
        setState(state);
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int newScore) {
        score = newScore;
        scoreText.setText(String.valueOf(score));
    }
    
    public void setScoreText(Text txt) {
        scoreText = txt;
        scoreText.setText(String.valueOf(score));
    }
}