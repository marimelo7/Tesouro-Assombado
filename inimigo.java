import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class inimigo extends Actor
{
    private int velocidade;
    private int direcao;

    public inimigo()
    {
        velocidade = 4;
        direcao = 0;
    }

    public void act()
    {
        if (direcao == 0)
        {
            move(velocidade);
        }
        else
        {
            move(-velocidade);
        }

        if (getX() >= getWorld().getWidth() - getImage().getWidth() / 2 || getX() <= 0 + getImage().getWidth() / 2)
        {
            direcao = (direcao + 1) % 2;
        }
        remover();
    }
    /**
     * Act - do whatever the inimigo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void remover()
    {
        if (isTouching(Bob.class)) {
            removeTouching(Bob.class);
            Greenfoot.setWorld( new  gameover());
        }
    }
}
