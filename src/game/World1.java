package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//world with bodies;
public class World1 extends GameLevel {

    Can can;
    Box box;
    Pringles pringles;
    Newspaper newspaper;
    Green_star greenStar;

    public static Body[] bodies_puzzle3;

    public static int currentLevel = 1;

    public static Body star2;
    public static Body star3;
    public static Body star4;
    static ArrayList<Body> lvl1stars = new ArrayList<Body>();


    @Override
    public void populate(Game game){
        super.populate(game);

        //ground platform
        Shape groundShape = new BoxShape(16.25f, 0.625f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -15.625f));
        ground.setFillColor(Color.darkGray);

        //upper platform
        Shape upperShape = new BoxShape(15, 0.625f);
        Body upper = new StaticBody(this, upperShape);
        upper.setPosition(new Vec2(0, 15.625f));
        upper.setFillColor(Color.darkGray);

        //left vertical platform
        Shape leftShape = new BoxShape(0.625f, 16.25f);
        Body left = new StaticBody(this, leftShape);
        left.setPosition(new Vec2(-15.625f, 0));
        left.setFillColor(Color.darkGray);

        //right vertical platform
        Shape rightShape = new BoxShape(0.625f, 14.125f);
        Body right = new StaticBody(this, rightShape);
        right.setPosition(new Vec2(15.625f, 3.125f));
        right.setFillColor(Color.darkGray);

        //walls
        Shape wall1Shape = new BoxShape(0.5f, 4);
        Body wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(10.5f, -11));
        wall1.setFillColor(Color.darkGray);
        Shape wall2Shape = new BoxShape(3.5f, 0.5f);
        Body wall2 = new StaticBody(this, wall2Shape);
        wall2.setPosition(new Vec2(7.5f, -6.5f));
        wall2.setFillColor(Color.darkGray);
        Body wall3 = new StaticBody(this, wall1Shape);
        wall3.setPosition(new Vec2(3.5f, -3));
        wall3.setFillColor(Color.darkGray);
        Shape wall4Shape = new BoxShape(7.5f, 0.5f);
        Body wall4 = new StaticBody(this, wall4Shape);
        wall4.setPosition(new Vec2(-4.5f, 0.5f));
        wall4.setFillColor(Color.darkGray);
        Shape wall5Shape = new BoxShape(0.5f, 1.5f);
        Body wall5 = new StaticBody(this, wall5Shape);
        wall5.setPosition(new Vec2(-11.5f, -1.5f));
        wall5.setFillColor(Color.darkGray);
        Shape wall6Shape = new BoxShape(5, 0.5f);
        Body wall6 = new StaticBody(this, wall6Shape);
        wall6.setPosition(new Vec2(-7, -3.5f));
        wall6.setFillColor(Color.darkGray);
        Shape wall7Shape = new BoxShape(8.5f, 0.5f);
        Body wall7 = new StaticBody(this, wall7Shape);
        wall7.setPosition(new Vec2(-6.5f, 4.5f));
        wall7.setFillColor(Color.darkGray);
        Shape wall7_1Shape = new BoxShape(1.5f, 0.5f);
        Body wall7_1 = new StaticBody(this, wall7_1Shape);
        wall7_1.setPosition(new Vec2(-10.5f, 7.5f));
        wall7_1.setFillColor(Color.darkGray);
        Shape wall8Shape = new BoxShape(1,2);
        Body wall8 = new StaticBody(this, wall8Shape);
        wall8.setPosition(new Vec2(-7, 7));
        wall8.setFillColor(Color.darkGray);
        Body wall9 = new StaticBody(this, wall8Shape);
        wall9.setPosition(new Vec2(-7, 13));
        wall9.setFillColor(Color.darkGray);
        Shape wall10Shape = new BoxShape(4, 0.5f);
        Body wall10 = new StaticBody(this, wall10Shape);
        wall10.setPosition(new Vec2(2, 8.5f));
        wall10.setFillColor(Color.darkGray);
        Shape wall11Shape = new BoxShape(0.5f, 5);
        Body wall11 = new StaticBody(this, wall11Shape);
        wall11.setPosition(new Vec2(6.5f, 4));
        wall11.setFillColor(Color.darkGray);
        Shape wall12Shape = new BoxShape(1.5f, 0.5f);
        Body wall12 = new StaticBody(this, wall12Shape);
        wall12.setPosition(new Vec2(8.5f, -0.5f));
        wall12.setFillColor(Color.darkGray);
        Body wall13 = new StaticBody(this, wall5Shape);
        wall13.setPosition(new Vec2(10.5f, 0.5f));
        wall13.setFillColor(Color.darkGray);
        Shape wall14Shape = new BoxShape(1, 1.5f);
        Body wall14 = new StaticBody(this, wall14Shape);
        wall14.setPosition(new Vec2(10, 3.5f));
        wall14.setFillColor(Color.darkGray);
        Shape wall15Shape = new BoxShape(0.5f, 1);
        Body wall15 = new StaticBody(this, wall15Shape);
        wall15.setPosition(new Vec2(10.5f, 14));
        wall15.setFillColor(Color.darkGray);
        Body wall16 = new StaticBody(this, wall15Shape);
        wall16.setPosition(new Vec2(10.5f, 10));
        wall16.setFillColor(Color.darkGray);
        Shape wall17Shape = new BoxShape(2, 0.5f);
        Body wall17 = new StaticBody(this, wall17Shape);
        wall17.setPosition(new Vec2(13, 9.5f));
        wall17.setFillColor(Color.darkGray);


        //puzzle 1
        Body block1 = new Water_bottle(this);
        block1.setPosition(new Vec2(-4.5f, -1.5f));


        //puzzle 2
        Body block2 = new Box(this);
        block2.setPosition(new Vec2(4, -9));
        Body block3 = new Box(this);
        block3.setPosition(new Vec2(4, -13));

        // piramid puzzle 3
        int lowest_row=8;
        int hight = lowest_row;
        int number_bodies=lowest_row*lowest_row;
        float start_x_3=-11;
        float start_y_3=-15f;
//        Body[] bodies_puzzle3;
        bodies_puzzle3 = new Body[number_bodies];
        for (int i=0; i<hight; i++){
            float x_3=start_x_3;
            float y_3=start_y_3;
            for (int j=0; j<lowest_row; j++){
                bodies_puzzle3[i] = new Can(this);
                //bodies[i].setFillColor(Color.orange);
                //bodies[i].setLineColor(Color.blue);
                bodies_puzzle3[i].setPosition(new Vec2(x_3, y_3));
                x_3+=0.75;
            }
            lowest_row-=1;
            start_x_3+=0.375;
            start_y_3+=1;

        }

        //puzzle 4
        Body[] bodies_puzzle4;
        bodies_puzzle4 = new Body[4];
        float x_4=-10.5f;
        for (int i=0; i<4; i++){
            bodies_puzzle4[i] = new Pringles(this);
            //bodies[i].setFillColor(Color.orange);
            //bodies[i].setLineColor(Color.blue);
            bodies_puzzle4[i].setPosition(new Vec2(x_4, 2.25f));
            x_4+=3;
        }

        //puzzle5
        Body[] bodies_puzzle5;
        bodies_puzzle5 = new Body[6];
        float x_5=-11.5f;
        float y_5=9;
        for (int i=0; i<6; i++) {
            bodies_puzzle5[i] = new Bottle(this);
            //bodies[i].setFillColor(Color.orange);
            //bodies[i].setLineColor(Color.blue);
            bodies_puzzle5[i].setPosition(new Vec2(x_5, y_5));
            x_5 += 1;
            if (i==2){
                y_5=12;
                x_5=-11.5f;
            }
        }
        Body block6 = new Pizza_box(this);
        block6.setPosition(new Vec2(-10.5f, 10.5f));

        //puzzle6
        Body[] bodies_puzzle6;
        bodies_puzzle6 = new Body[6];
        float y_6=9.5f;
        for (int i=0; i<6; i++) {
            bodies_puzzle6[i] = new Newspaper(this);
            //bodies[i].setFillColor(Color.orange);
            //bodies[i].setLineColor(Color.blue);
            bodies_puzzle6[i].setPosition(new Vec2(3, y_6));
            y_6 += 1;
        }


        //stars and picking them up
        Body star1 = new Red_star(this);
        star1.setPosition(new Vec2(2,-1));
        star2 = new Green_star(this);
        star2.setPosition(new Vec2(-14,14));
        star2.addCollisionListener(new Star_pickup(getPlayer()));
        star3 = new Green_star(this);
        star3.setPosition(new Vec2(13, 12));
        star3.addCollisionListener(new Star_pickup(getPlayer()));
        star4 = new Green_star(this);
        star4.setPosition(new Vec2(8,-3));
        star4.addCollisionListener(new Star_pickup(getPlayer()));
        lvl1stars.add(star2);
        lvl1stars.add(star3);
        lvl1stars.add(star4);

        //background
        Body background1 = new Background1(this);
        background1.setPosition(new Vec2(0,0));

        getPlayer().setPosition(new Vec2(-8, -2));

    }


//    @Override
//    public Vec2 startPosition(){
//        return new Vec2(-8, -2);
//        //return  new Vec2(13,-13);
//    }
    @Override
    public Vec2 exitPosition(){
        return new Vec2(15.75f,-13f);
    }
    /*@Override
    public String setMusic(){
        return "data/song1.wav";
    }*/

}
