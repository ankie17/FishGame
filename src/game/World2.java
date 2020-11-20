package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.util.ArrayList;

public class World2 extends GameLevel {

    public float block2speed;
    public Body block2;
    private Wood wood;

    public static int currentLevel = 2;

    public static Body star2;
    public static Body star3;
    public static Body star4;
    static ArrayList<Body> lvl2stars = new ArrayList<Body>();


    @Override
    public void populate(Game game) {
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
        Shape wall1Shape = new BoxShape(0.5f, 2);
        Body wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(-1.5f, 13));
        wall1.setFillColor(Color.darkGray);
        Shape wall2Shape = new BoxShape(3f, 0.5f);
        Body wall2 = new StaticBody(this, wall2Shape);
        wall2.setPosition(new Vec2(-6f, 9.5f));
        wall2.setFillColor(Color.darkGray);
        Body wall3 = new StaticBody(this, wall2Shape);
        wall3.setPosition(new Vec2(-6f, 5.5f));
        wall3.setFillColor(Color.darkGray);
        Shape wall4Shape = new BoxShape(0.5f, 1.5f);
        Body wall4 = new StaticBody(this, wall4Shape);
        wall4.setPosition(new Vec2(-8.5f, 7.5f));
        wall4.setFillColor(Color.darkGray);
        Shape wall5Shape = new BoxShape(2f, 0.5f);
        Body wall5 = new StaticBody(this, wall5Shape);
        wall5.setPosition(new Vec2(0f, 5.5f));
        wall5.setFillColor(Color.darkGray);
        Body wall6 = new StaticBody(this, wall5Shape);
        wall6.setPosition(new Vec2(8f, 9.5f));
        wall6.setFillColor(Color.darkGray);
        Body wall7 = new StaticBody(this, wall5Shape);
        wall7.setPosition(new Vec2(8f, 5.5f));
        wall7.setFillColor(Color.darkGray);
        Body wall7_1 = new StaticBody(this, wall4Shape);
        wall7_1.setPosition(new Vec2(9.5f, 7.5f));
        wall7_1.setFillColor(Color.darkGray);
        Shape wall8Shape = new BoxShape(6f,1.5f);
        Body wall8 = new StaticBody(this, wall8Shape);
        wall8.setPosition(new Vec2(-9f, 0.5f));
        wall8.setFillColor(Color.darkGray);
        Shape wall9Shape = new BoxShape(7.5f, 0.5f);
        Body wall9 = new StaticBody(this, wall9Shape);
        wall9.setPosition(new Vec2(7.5f, 1.5f));
        wall9.setFillColor(Color.darkGray);
        Shape wall10Shape = new BoxShape(0.5f, 3f);
        Body wall10 = new StaticBody(this, wall10Shape);
        wall10.setPosition(new Vec2(5.5f, -2f));
        wall10.setFillColor(Color.darkGray);
        Shape wall11Shape = new BoxShape(1f, 0.5f);
        Body wall11 = new StaticBody(this, wall11Shape);
        wall11.setPosition(new Vec2(-9f, -4.5f));
        wall11.setFillColor(Color.darkGray);
        Shape wall12Shape = new BoxShape(0.5f, 1.5f);
        Body wall12 = new StaticBody(this, wall12Shape);
        wall12.setPosition(new Vec2(-8.5f, -6.5f));
        wall12.setFillColor(Color.darkGray);
        Body wall13 = new StaticBody(this, wall12Shape);
        wall13.setPosition(new Vec2(-4.5f, -6.5f));
        wall13.setFillColor(Color.darkGray);
        Shape wall14Shape = new BoxShape(1.5f, 0.5f);
        Body wall14 = new StaticBody(this, wall14Shape);
        wall14.setPosition(new Vec2(-6.5f, -7.5f));
        wall14.setFillColor(Color.darkGray);
        Shape wall15Shape = new BoxShape(5f, 0.5f);
        Body wall15 = new StaticBody(this, wall15Shape);
        wall15.setPosition(new Vec2(0f, -4.5f));
        wall15.setFillColor(Color.darkGray);
        Shape wall16Shape = new BoxShape(2.5f, 1.5f);
        Body wall16 = new StaticBody(this, wall16Shape);
        wall16.setPosition(new Vec2(-5.5f, -13.5f));
        wall16.setFillColor(Color.darkGray);
        Shape wall17Shape = new BoxShape(4, 1.5f);
        Body wall17 = new StaticBody(this, wall17Shape);
        wall17.setPosition(new Vec2(8, -13.5f));
        wall17.setFillColor(Color.darkGray);


        //puzzle1
        Body block1 = new Stone(this);
        block1.setPosition(new Vec2(0.5f, 7.5f));

        //puzzle2
        wood = new Wood(this);
        wood.setPosition(new Vec2(-11.5f, -7.5f));
        wood.setGravityScale(0);
        new Thread(new controllerWood(wood)).start();
        //((Wood) block2).setLinearVelocity(new Vec2(2*block2speed,0));


        //puzzle3
        Body[] bodies_puzzle4;
        bodies_puzzle4 = new Body[4];
        float x_3=-7.5f;
        for (int i=0; i<3; i++){
            bodies_puzzle4[i] = new Grass(this);
            //bodies[i].setFillColor(Color.orange);
            //bodies[i].setLineColor(Color.blue);
            bodies_puzzle4[i].setPosition(new Vec2(x_3, -10.5f));
            x_3+=2;
        }

        //puzzle4
        Body block3 = new Chuck(this);
        block3.setPosition(new Vec2(7, -8));


        //stars and picking them up
        star2 = new Green_star(this);
        star2.setPosition(new Vec2(-5,12.5f));
        star2.addCollisionListener(new Star_pickup(getPlayer()));
        lvl2stars.add(star2);
        star3 = new Green_star(this);
        star3.setPosition(new Vec2(10.5f, -1f));
        star3.addCollisionListener(new Star_pickup(getPlayer()));
        lvl2stars.add(star3);
        star4 = new Green_star(this);
        star4.setPosition(new Vec2(-2,-6.5f));
        star4.addCollisionListener(new Star_pickup(getPlayer()));
        lvl2stars.add(star4);

        //background
        Body background2 = new Background2(this);
        background2.setPosition(new Vec2(0,0));

        getPlayer().setPosition(new Vec2(-6, 7.5f));


    }
    public void ChangeDirection(){
        block2speed*=-1;
    }

//    @Override
//    public Vec2 startPosition(){
//
//        //return new Vec2(13f, -8);
//        return new Vec2(-6, 7.5f);
//    }
    @Override
    public Vec2 exitPosition(){
        return new Vec2(15.75f,-13f);
    }

    /*@Override
    public String setMusic(){
        return "data/song2.wav";
    }*/
}

