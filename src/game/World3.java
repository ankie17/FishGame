package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.util.ArrayList;

public class World3 extends GameLevel {

    private Fish fish;

    private Crab crab1;
    private Crab crab2;
    private Squid squid;
    public static Plant plant;
    public static ButtonUp buttonUp;

    public static int currentLevel = 3;

    public static Body star2;
    public static Body star3;
    public static Body star4;
    static ArrayList<Body> lvl3stars = new ArrayList<Body>();

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
        Shape wall1Shape = new BoxShape(0.5f, 6.5f);
        Body wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(-1.5f, -8.5f));
        wall1.setFillColor(Color.darkGray);
        Shape wall2Shape = new BoxShape(8f, 0.5f);
        Body wall2 = new StaticBody(this, wall2Shape);
        wall2.setPosition(new Vec2(7f, -2.5f));
        wall2.setFillColor(Color.darkGray);
        Shape wall3Shape = new BoxShape(1,3);
        Body wall3 = new StaticBody(this, wall3Shape);
        wall3.setPosition(new Vec2(6f, 9f));
        wall3.setFillColor(Color.darkGray);
        Shape wall4Shape = new BoxShape(1f, 1f);
        Body wall4 = new StaticBody(this, wall4Shape);
        wall4.setPosition(new Vec2(-1f, 8f));
        wall4.setFillColor(Color.darkGray);
        Shape wall5Shape = new BoxShape(1f, 9f);
        Body wall5 = new StaticBody(this, wall5Shape);
        wall5.setPosition(new Vec2(-8f, -3f));
        wall5.setFillColor(Color.darkGray);
        Shape wall6Shape = new BoxShape(11,0.5f);
        Body wall6 = new StaticBody(this, wall6Shape);
        wall6.setPosition(new Vec2(-4f, 6.5f));
        wall6.setFillColor(Color.darkGray);


        //puzzle1
        crab1 = new Crab(this);
        crab1.setPosition(new Vec2(-13f, 0.5f));
        crab1.setGravityScale(0);
        new Thread(new controllerCrabHorizontal(crab1)).start();

        //puzzle2
        crab2 = new Crab(this);
        crab2.setPosition(new Vec2(-1f, 10.5f));
        crab2.setGravityScale(0);
        new Thread(new controllerCrabVertical(crab2)).start();

        //puzzle3
        squid = new Squid(this);
        squid.setPosition(new Vec2(9.5f, 6.5f));
        squid.setGravityScale(0);
        new Thread( new controllerSquid(squid)).start();

        //puzzle4
        Body block4 = new Nautilus(this);
        block4.setPosition(new Vec2(6, 13));

        //puzzle5
        Body block5 = new ButtonUp(this);
        block5.setPosition(new Vec2(-12.5f, 5f));
        block5.addCollisionListener(new ButtonUpCollision(game));

        //puzzle6
        plant = new Plant(this);
        plant.setPosition(new Vec2(6f, 2f));

        //puzzle7
        Body portal1 = new RedPortal1(this);
        portal1.setPosition(new Vec2(-11, 12));
        portal1.addCollisionListener(new PortalCollision1(game));
        Body portal2 = new RedPortal2(this, fish);
        portal2.setPosition(new Vec2(3, -9));



        //stars and picking them up
        star2 = new Green_star(this);
        star2.setPosition(new Vec2(8,-10));
        star2.addCollisionListener(new Star_pickup(getPlayer()));
        lvl3stars.add(star2);
        star3 = new Green_star(this);
        star3.setPosition(new Vec2(-5, 3f));
        star3.addCollisionListener(new Star_pickup(getPlayer()));
        lvl3stars.add(star3);
        star4 = new Green_star(this);
        star4.setPosition(new Vec2(2,13f));
        star4.addCollisionListener(new Star_pickup(getPlayer()));
        lvl3stars.add(star4);

        //background
        Body background3 = new Background3(this);
        background3.setPosition(new Vec2(0,0));

        getPlayer().setPosition(new Vec2(-13.5f, -10));
    }

//    @Override
//    public Vec2 startPosition(){
//
//        //return new Vec2(-12f, -5);
//        return new Vec2(-13.5f, -10);
//    }
    @Override
    public Vec2 exitPosition(){
        return new Vec2(15.75f,-13f);
    }

    /*@Override
    public String setMusic(){
        return "data/song3.wav";
    }*/
}

