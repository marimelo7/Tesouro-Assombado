/**
 * Note, the images for this actor were acquired at www.wikia.com.  The 
 * sprite sheet was submitted by the user "Mecha Mario".  The direct url
 * to it is: http://smbz.wikia.com/wiki/File:Dawson_Sprite_Sheet.PNG
 * 
 * All assets at www.wikia.com are licensed under the Creative Commons 
 * Attribution-Share Alike License 3.0 (Unported) (CC-BY-SA).
 */
import greenfoot.*;

public class Bob extends Jumper {
    private int speed = 3;
    private int animationDelay = 0;
    private int frame = 0;
    private int actorWidth;

    private static final int DELAY = 3;
    private static final int SIDEHIT = 10;
    
    public int velocidade = 4;
    public int gravidade = 1;
    private int qtde = 0;

    public Bob() {
        super();

        actorWidth = getImage().getWidth();
    }

    public void act() {
        super.act();
    }

    

    // Called by superclass
    protected void handleKeyPresses() {
        super.handleKeyPresses();

        if( Greenfoot.isKeyDown("a") ) {
            if( canMoveLeft() ) {
                setLocation(getX() - 5, getY());
                setImage("esquerda.png");
                moveLeft();
            }
        }
        if( Greenfoot.isKeyDown("d") ) {
            if( canMoveRight() ) {
                setLocation(getX() + 5, getY());
                setImage("direita.png");
                moveRight();
            }
        }
        score();
    }

    private boolean canMoveLeft() {
        if( getX() < 5 ) return false;
        return true;
    }

    private void moveLeft() {
        setLocation(getX() - speed, getY());
        if( animationDelay % DELAY == 0 ) { 
            animateLeft();
            animationDelay = 0;
        }
        animationDelay++;
    }

    private void animateLeft() {
        frame = frame % 5;
        actorWidth = getImage().getWidth();
    }

    private boolean canMoveRight() {
        if( getX() > getWorld().getWidth() - 5) return false;
        return true;
    }

    private void moveRight() {
        setLocation(getX() + speed, getY());
        if( animationDelay % DELAY == 0 )  { 
            animateRight();
            animationDelay = 0;
        }
        animationDelay++;
    }

    private void animateRight() {
        frame = frame % 5;
        actorWidth = getImage().getWidth();
    }
     public void pular()
    {
        velocidade = -20;
    }
    public void score()
    {
        getWorld().showText("SCORE: " + qtde, 50, 30);
        if (isTouching(moeda.class)) {
            removeTouching(moeda.class);
            qtde = qtde + 1;
        }
        if (isTouching(moedas.class)) {
            removeTouching(moedas.class);
            qtde = qtde + 5;
        }
    }
} 