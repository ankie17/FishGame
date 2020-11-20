package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;

/**
 * Key handler to control an Walker.
 */
public class Controller extends KeyAdapter {
    /**
     * declaring a variables that are used in the class
     */
    private Walker body;
    /**
     * declaring a variables that are used in the class
     */
    public static boolean leftSide = false;
    /**
     * declaring a variables that are used in the class
     */
    public static boolean rightSide = true;
    /**
     * declaring a variables that are used in the class
     */
    public static boolean mooving = false;
    /**
     * declaring an image for fish going right
     */
    private static final BodyImage imageRight =
            new BodyImage("data/FishRight.gif", 2.5f);
    /**
     * declaring an image for fish going left
     */
    private static final BodyImage imageLeft =
            new BodyImage("data/FishLeft.gif", 2.5f);
    /**
     * chose main character as a walker
     */
    public Controller(Walker body) {
        this.body = body;
    }

    /**
     * method that provide game with some action depending which key is pressed
     * @param e saves the key that pressed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //move and change picture depending on the motion
        if (code == KeyEvent.VK_Q) { // Q = quit
            System.exit(0);
        } else if (code == KeyEvent.VK_LEFT) { //left
            body.setLinearVelocity(new Vec2(-5, 0));
            leftSide = true;
            mooving = true;
        } else if (code == KeyEvent.VK_RIGHT) { //right
            body.setLinearVelocity(new Vec2(5, 0));
            rightSide = true;
            mooving = true;
        } else if (code == KeyEvent.VK_UP) { //up
            body.setLinearVelocity(new Vec2(0, 5));
        } else if (code == KeyEvent.VK_DOWN) {//down
            body.setLinearVelocity(new Vec2(0, -5));


        }


        if (leftSide) {
            body.removeAllImages();
            body.addImage(imageLeft);
        }


        if (rightSide) {
            body.removeAllImages();
            body.addImage(imageRight);
        }
    }

    /**
     * method that provide game with some action depending which key is released
     * @param e save the key that is released
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_UP || code == KeyEvent.VK_DOWN) {
            body.setLinearVelocity(new Vec2(0,0)); //stop
            leftSide = false;
            rightSide = false;
            mooving = true;

        }
    }

    /**
     * creates main character
     * @param body main character
     */
    public void setBody(Walker body){
        this.body=body;
    }

}
