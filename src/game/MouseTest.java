package game;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import javax.swing.text.JTextComponent;


/**
 * Dummy mouse listener.
 */
public class MouseTest extends MouseAdapter {
    public Fish fish;
    public GameLevel world;

    static MouseEvent mouseevent;


    private WorldView view;


    public MouseTest(WorldView view) {
        this.view = view;
    }


    @Override
    //create new info window
    public void mouseClicked(MouseEvent e) {
        if (e.getX()>346 && e.getX()<389 && e.getY()<366 && e.getY()>325){
            final JFrame frame_info = new JFrame("Info");
            JLabel line = new JLabel("Hey, little fish. It's hard to be washed away from home. So now you can try to escape right to the ocean. Move yourself with arrows and find the exit to escape. Good luck");
            frame_info.add(line);
            frame_info.pack();
            frame_info.setSize(2000,50);
            frame_info.setVisible(true);


        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

//        float MouseX = (e.getX() - 350) / 20;
//        float MouseY = (350 - e.getY()) / 20;
//
//        Vec2 mousePos = new Vec2(MouseX, MouseY);
//        Vec2 bodyPos = fish.getPosition();
//
//        Vec2 vec = mousePos.sub(bodyPos);
//
//        world.getPlayer().shoot(mouseevent, view, vec);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        mouseevent = e;
//        Vec2 bodyPos = fish.getPosition();
//        Vec2 mousePos = view.viewToWorld(e.getPoint());
//        Vec2 vec = mousePos.sub(bodyPos);
//        double ang = Math.atan2(vec.y, vec.x);

    }

//    @Override
//    public void mouseReleased(MouseEvent e) {
//        System.out.println("mouse released");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        System.out.println("mouse entered");
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        System.out.println("mouse exited");
//    }
   
}
