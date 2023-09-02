
import greenfoot.*; 
import java.util.List;
/**
 * Write a description of class gameover here.
 * 
 * Luciano Menezes e Mariana Melo
 * 1.0 - 09/2023
 */

public class MyWorld extends World {
    public int BCOUNT = 200;
    private int ballCounter = BCOUNT;
    public int FCOUNT = 400;
    private int level = 0;

    public MyWorld() {
        super(1000, 750, 1, false); 
        prepare();
    }
    public void addObjectNudge(Actor a, int x, int y) {
        int nudge = Greenfoot.getRandomNumber(8) - 4;
        
    }

    private void prepare()
    {
        Bob Bob =  new  Bob();
        addObject(Bob, 95, 617);
        pausar pausar =  new  pausar();
        addObject(pausar, 954, 41);
        moeda moeda =  new  moeda();
        addObject(moeda, 297, 334);
        moeda moeda2 =  new  moeda();
        addObject(moeda2, 634, 571);
        moeda moeda3 =  new  moeda();
        addObject(moeda3, 731, 264);
        moeda moeda4 =  new  moeda();
        addObject(moeda4, 567, 189);
        Bob Bob2 =  new  Bob();
        addObject(Bob2, 163, 574);
        Bob.setLocation(168, 498);
        Bob.setLocation(229, 509);
        removeObject(Bob);
        Bob2.setLocation(91, 568);
        Bob2.setLocation(88, 651);
        BrickWall BrickWall =  new  BrickWall();
        addObject(BrickWall, 499, 705);
        Bob2.setLocation(47, 581);
        Base Base =  new Base();
        addObject(Base, 210, 542);
        Base.setLocation(315, 412);
        Base Base2 =  new  Base();
        addObject(Base2, 447, 343);
        Base Base3 =  new  Base();
        addObject(Base3, 817, 523);
        Base Base4 =  new  Base();
        addObject(Base4, 564, 442);
        Base.setLocation(308, 394);
        Base2.setLocation(439, 330);
        moeda4.setLocation(450, 277);
        Base4.setLocation(567, 448);
        moeda3.setLocation(538, 418);
        Base3.setLocation(799, 514);
        moeda2.setLocation(811, 447);
        moeda2.setLocation(807, 352);
        Base3.setLocation(823, 384);
        moeda2.setLocation(817, 327);
        Base3.setLocation(742, 342);
        moeda2.setLocation(728, 300);
        Base4.setLocation(614, 495);
        moeda3.setLocation(629, 448);
        Base.setLocation(272, 434);
        moeda.setLocation(258, 402);
        Base2.setLocation(479, 401);
        moeda4.setLocation(479, 353);
        Base2.setLocation(441, 385);
        moeda4.setLocation(468, 348);
        moeda3.setLocation(631, 439);
        Base Base5 =  new  Base();
        addObject(Base5, 789, 551);
        moeda moeda5 =  new  moeda();
        addObject(moeda5, 789, 505);
        Base5.setLocation(767, 555);
        moeda5.setLocation(760, 506);
        Base4.setLocation(923, 424);
        moeda3.setLocation(911, 384);
        Base2.setLocation(577, 430);
        moeda4.setLocation(568, 388);
        Base4.setLocation(924, 429);
        moeda3.setLocation(912, 403);
        moeda.setLocation(238, 304);
        Base.setLocation(335, 363);
        moeda.setLocation(353, 319);
        moeda.setLocation(310, 322);
        moedas moedas =  new  moedas();
        addObject(moedas, 959, 634);
        moeda.setLocation(334, 325);
        moeda4.setLocation(580, 386);
        moeda3.setLocation(929, 383);
        moeda2.setLocation(755, 303);
        moeda2.setLocation(752, 309);
        moeda2.setLocation(745, 306);
        moeda5.setLocation(787, 505);
        moeda5.setLocation(762, 508);
        moeda5.setLocation(779, 513);
        moeda5.setLocation(758, 525);
        moeda5.setLocation(790, 509);
        moeda5.setLocation(759, 504);
        moeda5.setLocation(791, 500);
        moeda5.setLocation(752, 502);
        moeda5.setLocation(767, 510);
        baú baú =  new  baú();
        addObject(baú, 59, 52);
        baú.setLocation(74, 87);
        Base Base6 =  new  Base();
        addObject(Base6, 493, 223);
        Base Base7 =  new  Base();
        addObject(Base7, 76, 138);
        Base7.setLocation(76, 134);
        Base Base8 =  new  Base();
        addObject(Base8, 239, 199);
        Base8.setLocation(208, 227);
        Base Base9 =  new  Base();
        addObject(Base9, 133, 442);
        Base9.setLocation(128, 421);
        Base8.setLocation(192, 233);
        baú baú2 =  new  baú();
        addObject(baú2, 350, 598);
        inimigo inimigo =  new  inimigo();
        addObject(inimigo, 910, 616);
        removeObject(baú2);

        // Add floor

        // Add Score
        // Add turret
        // Add cupcake
        // Add platforms
        for(int i=0; i<5; i++) {
            for(int j=0; j<6; j++) {
                int stagger = (i % 2 == 0 ) ? 24 : -24;
                Base base = new Base();
                addObjectNudge(base, stagger + (j+1)*85, (i+1)*62);
            }
        }

        moedas moedas2 = new moedas();
        addObject(moedas2,128,384);
        moeda moeda6 = new moeda();
        addObject(moeda6,494,183);
        moeda moeda7 = new moeda();
        addObject(moeda7,192,192);
        Base base10 = new Base();
        addObject(base10,443,566);
        Base base11 = new Base();
        addObject(base11,913,218);
        base10.setLocation(373,559);
        Base base12 = new Base();
        addObject(base12,697,165);
        Base base13 = new Base();
        addObject(base13,327,120);
        base12.setLocation(711,139);
        moedas moedas3 = new moedas();
        addObject(moedas3,915,183);
        moeda4.setLocation(700,113);
        moedas moedas4 = new moedas();
        addObject(moedas4,576,392);
        moedas moedas5 = new moedas();
        addObject(moedas5,564,162);
        moeda6.setLocation(318,73);
        moedas5.setLocation(507,177);
        moeda4.setLocation(691,94);
        moeda moeda8 = new moeda();
        addObject(moeda8,372,521);
    }
}