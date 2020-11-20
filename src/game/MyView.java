package game;

import java.awt.*;
import javax.swing.ImageIcon;
import city.cs.engine.*;

/**
 * extended view
 */
public class MyView extends UserView {
    Fish fish;
    private ImageIcon background;
    private String levelName;

    public MyView(World world, Fish fish, int width, int height) {
        super(world, width, height);
        this.fish = fish;
    }

    /*@Override
    protected void paintBackground(Graphics2D g) {
        if (level == 1){
            background = new ImageIcon("data/background.png");
        } else if (level == 2){
            background = new ImageIcon("data/background3.png");
        } else if (level == 3){
            background = new ImageIcon("data/background4.jpg");
        } else if (level == 4){
            background = new ImageIcon("data/background2.jpg");
        }
        g.drawImage(background.getImage(), 0, 0, 682, 640,this);
    }*/

    @Override
    protected void paintForeground(Graphics2D g) {
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.BOLD, 15));
        g.drawString("Stars: " + GameLevel.starCount , 30, 15);
        //g.drawString("LIVES: " + fish.getLiveCount() , 300, 15);
        g.drawString("LEVEL: " + GameLevel.level, 500, 15);

        if (Game.currentLevel == 1) {
           levelName = "SWAMP";
        } else if (Game.currentLevel == 2) {
            levelName = "RIVER";
        } else if (Game.currentLevel == 3) {
            levelName = "SEA";
        } else if (Game.currentLevel == 4) {
            levelName = "OCEAN";
        }

        g.drawString(levelName, 250, 15);
    }


}