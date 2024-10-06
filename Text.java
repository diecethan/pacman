import greenfoot.*;

public class Text extends Actor {
    private String text;
    private int fontSize;
    private Color foreground, background, outline;
    
    public Text() {
        text = "1";
        fontSize = 20;
        foreground = Color.WHITE;
        background = null;
        outline = null;
        updateImage();
    }
    
    public Text(String str) {
        text = str;
        fontSize = 40;
        foreground = Color.RED;
        background = Color.BLUE;
        outline = Color.GREEN;
        updateImage();
    }
    
    public Text(String str, int size, Color fore, Color back, Color out) {
        text = str;
        fontSize = size;
        foreground = fore;
        background = back;
        outline = out;
        updateImage();
    }
    
    public Text(String str, int size, Color fore) {
        text = str;
        fontSize = size;
        foreground = fore;
        background = null;
        outline = null;
        updateImage();
    }
    
    public int getSize() {
        return fontSize;
    }
    
    public void setSize(int size) {
        fontSize = size;
        updateImage();
    }
    
    public Color getForeground() {
        return foreground;
    }
    
    public void setForeground(Color fore) {
        foreground = fore;
        updateImage();
    }
    
    public Color getBackground() {
        return background;
    }
    
    public void setBackground(Color back) {
        background = back;
        updateImage();
    }
    
    public Color getOutline() {
        return outline;
    }
    
    public void setOutline(Color out) {
        outline = out;
        updateImage();
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String txt) {
        text = txt;
        updateImage();
    }
    
    public void setText(String txt, Color back) {
        text = txt;
        background = back;
        updateImage();
    }
    
    public void setText(String txt, int size) {
        text = txt;
        fontSize = size;
        updateImage();
    }
    
    public void setText(Color fore, String txt) {
        text = txt;
        foreground = fore;
        updateImage();
    }
    
    public void updateImage() {
        GreenfootImage img = new GreenfootImage(text, fontSize, foreground, background, outline);
        setImage(img);
    }
    
    public void act() {}
}