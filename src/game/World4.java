package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.util.ArrayList;

public class World4 extends GameLevel {

    public static int currentLevel = 4;
    public static Sponge block6;
    public static Sponge block1;
    public static RedPortal2 portal2;
    public static RedPortal1 portal1;
    public static Button button;

    public static Body star2;
    public static Body star3;
    public static Body star4;
    public static Body star5;
    static ArrayList<Body> lvl4stars = new ArrayList<Body>();

    @Override
    public void populate(Game game) {
        super.populate(game);

        //ground platform
        Shape groundShape = new BoxShape(16.25f, 1.125f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -16.125f));
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
        Shape rightShape = new BoxShape(0.625f, 16.125f);
        Body right = new StaticBody(this, rightShape);
        right.setPosition(new Vec2(15.625f, 0f));
        right.setFillColor(Color.darkGray);

        //walls
        Shape wall1Shape = new BoxShape(0.5f, 0.5f);
        Body wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(-8.5f, 14.5f));
        wall1.setFillColor(Color.darkGray);
        Shape wall2Shape = new BoxShape(1.5f, 0.5f);
        Body wall2 = new StaticBody(this, wall2Shape);
        wall2.setPosition(new Vec2(-13.5f, 12.5f));
        wall2.setFillColor(Color.darkGray);
        Body wall3 = new StaticBody(this, wall1Shape);
        wall3.setPosition(new Vec2(-4.5f, 12.5f));
        wall3.setFillColor(Color.darkGray);
        Shape wall4Shape = new BoxShape(5.5f, 0.5f);
        Body wall4 = new StaticBody(this, wall4Shape);
        wall4.setPosition(new Vec2(-9.5f, 11.5f));
        wall4.setFillColor(Color.darkGray);
        Shape wall5Shape = new BoxShape(0.5f, 2f);
        Body wall5 = new StaticBody(this, wall5Shape);
        wall5.setPosition(new Vec2(-0.5f, 13f));
        wall5.setFillColor(Color.darkGray);
        Body wall7 = new StaticBody(this, wall1Shape);
        wall7.setPosition(new Vec2(11.5f, 12.5f));
        wall7.setFillColor(Color.darkGray);
        Shape wall7_1Shape = new BoxShape(1.5f, 0.5f);
        Body wall7_1 = new StaticBody(this, wall7_1Shape);
        wall7_1.setPosition(new Vec2(1.5f, 11.5f));
        wall7_1.setFillColor(Color.darkGray);
        Shape wall8Shape = new BoxShape(4f,0.5f);
        Body wall8 = new StaticBody(this, wall8Shape);
        wall8.setPosition(new Vec2(11f, 11.5f));
        wall8.setFillColor(Color.darkGray);
        Shape wall9Shape = new BoxShape(2.5f, 1.5f);
        Body wall9 = new StaticBody(this, wall9Shape);
        wall9.setPosition(new Vec2(-12.5f, 6.5f));
        wall9.setFillColor(Color.darkGray);
        Shape wall10Shape = new BoxShape(6f, 0.5f);
        Body wall10 = new StaticBody(this, wall10Shape);
        wall10.setPosition(new Vec2(-1f, 7.5f));
        wall10.setFillColor(Color.darkGray);
        Shape wall11Shape = new BoxShape(2f, 0.5f);
        Body wall11 = new StaticBody(this, wall11Shape);
        wall11.setPosition(new Vec2(10f, 7.5f));
        wall11.setFillColor(Color.darkGray);
        Shape wall12Shape = new BoxShape(0.5f, 1.5f);
        Body wall12 = new StaticBody(this, wall12Shape);
        wall12.setPosition(new Vec2(11.5f, 5.5f));
        wall12.setFillColor(Color.darkGray);
        Shape wall13Shape = new BoxShape(1.5f, 0.5f);
        Body wall13 = new StaticBody(this, wall13Shape);
        wall13.setPosition(new Vec2(13.5f, 4.5f));
        wall13.setFillColor(Color.darkGray);
        Shape wall14Shape = new BoxShape(0.5f, 3f);
        Body wall14 = new StaticBody(this, wall14Shape);
        wall14.setPosition(new Vec2(-6.5f, 4f));
        wall14.setFillColor(Color.darkGray);
        Shape wall15Shape = new BoxShape(4.5f, 0.5f);
        Body wall15 = new StaticBody(this, wall15Shape);
        wall15.setPosition(new Vec2(-10.5f, 1.5f));
        wall15.setFillColor(Color.darkGray);
        Shape wall16Shape = new BoxShape(0.5f, 1.5f);
        Body wall16 = new StaticBody(this, wall16Shape);
        wall16.setPosition(new Vec2(-11.5f, -0.5f));
        wall16.setFillColor(Color.darkGray);
        Shape wall17Shape = new BoxShape(2f, 3f);
        Body wall17 = new StaticBody(this, wall17Shape);
        wall17.setPosition(new Vec2(-13f, -11f));
        wall17.setFillColor(Color.darkGray);
        Shape wall18Shape = new BoxShape(4.5f, 0.5f);
        Body wall18 = new StaticBody(this, wall18Shape);
        wall18.setPosition(new Vec2(2.5f, -13.5f));
        wall18.setFillColor(Color.darkGray);
        Shape wall19Shape = new BoxShape(1.5f, 0.5f);
        Body wall19 = new StaticBody(this, wall19Shape);
        wall19.setPosition(new Vec2(2.5f, -12.5f));
        wall19.setFillColor(Color.darkGray);
        Shape wall20Shape = new BoxShape(1.5f, 1.5f);
        Body wall20 = new StaticBody(this, wall20Shape);
        wall20.setPosition(new Vec2(-6.5f, -9.5f));
        wall20.setFillColor(Color.darkGray);
        Shape wall21Shape = new BoxShape(1.5f, 1f);
        Body wall21 = new StaticBody(this, wall21Shape);
        wall21.setPosition(new Vec2(-3.5f, -9f));
        wall21.setFillColor(Color.darkGray);
        Shape wall22Shape = new BoxShape(1.5f, 0.5f);
        Body wall22 = new StaticBody(this, wall22Shape);
        wall22.setPosition(new Vec2(-0.5f, -8.5f));
        wall22.setFillColor(Color.darkGray);
        Shape wall23Shape = new BoxShape(2.5f, 0.5f);
        Body wall23 = new StaticBody(this, wall23Shape);
        wall23.setPosition(new Vec2(6.5f, -8.5f));
        wall23.setFillColor(Color.darkGray);
        Body wall24 = new StaticBody(this, wall1Shape);
        wall24.setPosition(new Vec2(8.5f, -9.5f));
        wall24.setFillColor(Color.darkGray);
        Shape wall25Shape = new BoxShape(2f, 0.5f);
        Body wall25 = new StaticBody(this, wall25Shape);
        wall25.setPosition(new Vec2(10f, -10.5f));
        wall25.setFillColor(Color.darkGray);
        Shape wall26Shape = new BoxShape(0.5f, 5.5f);
        Body wall26 = new StaticBody(this, wall26Shape);
        wall26.setPosition(new Vec2(11.5f, -4.5f));
        wall26.setFillColor(Color.darkGray);
        Shape wall27Shape = new BoxShape(1.5f, 0.5f);
        Body wall27 = new StaticBody(this, wall27Shape);
        wall27.setPosition(new Vec2(13.5f, 0.5f));
        wall27.setFillColor(Color.darkGray);
        Shape wall28Shape = new BoxShape(2f, 0.5f);
        Body wall28 = new StaticBody(this, wall28Shape);
        wall28.setPosition(new Vec2(9f, -2.5f));
        wall28.setFillColor(Color.darkGray);
        Body wall29 = new StaticBody(this, wall28Shape);
        wall29.setPosition(new Vec2(0f, -0.5f));
        wall29.setFillColor(Color.darkGray);
        Shape wall30Shape = new BoxShape(5.5f, 0.5f);
        Body wall30 = new StaticBody(this, wall30Shape);
        wall30.setPosition(new Vec2(2.5f, -5.5f));
        wall30.setFillColor(Color.darkGray);
        Body wall31 = new StaticBody(this, wall30Shape);
        wall31.setPosition(new Vec2(2.5f, 3.5f));
        wall31.setFillColor(Color.darkGray);
        Shape wall32Shape = new BoxShape(0.5f, 4f);
        Body wall32 = new StaticBody(this, wall32Shape);
        wall32.setPosition(new Vec2(-2.5f, -1f));
        wall32.setFillColor(Color.darkGray);
        Shape wall33Shape = new BoxShape(0.5f, 2.5f);
        Body wall33 = new StaticBody(this, wall33Shape);
        wall33.setPosition(new Vec2(7.5f, 0.5f));
        wall33.setFillColor(Color.darkGray);


        //puzzle1

        block1 = new Sponge(this);
        block1.setPosition(new Vec2(3.5f, 9.5f));
        block6 = new Sponge(this);
        block6.setPosition(new Vec2(-5.5f, 9.5f));

        //puzzle2
        Body block2 = new Coral(this);
        block2.setPosition(new Vec2(6f, -8f));

        //puzzle3
        Body portal1 = new RedPortal1(this);
        portal1.setPosition(new Vec2(-14, -6.5f));
        Body portal2 = new RedPortal1(this);
        portal2.setPosition(new Vec2(-14, 9.5f));
        portal2.addCollisionListener(new PortalCollision2(game));
        Body portal3 = new BluePortal(this);
        portal3.setPosition(new Vec2(-5, 5.5f));
        Body portal4 = new BluePortal(this);
        portal4.setPosition(new Vec2(1, 13.5f));
        portal4.addCollisionListener(new PortalCollision3(game));


        //puzzle4
        Body block3 = new SeaGrass(this);
        block3.setPosition(new Vec2(4.5f, -3.5f));
        Body block4 = new SeaGrass(this);
        block4.setPosition(new Vec2(2.5f, -3.5f));
        Body block5 = new BigStone(this);
        block5.setPosition(new Vec2(-9.5f, -6f));

        //puzzle5
        Body button = new Button(this);
        button.setPosition(new Vec2(14.5f, 13.5f));
        button.addCollisionListener(new ButtonCollision(game));


        //stars and picking them up
        star2 = new Green_star(this);
        star2.setPosition(new Vec2(13.5f,7.5f));
        star2.addCollisionListener(new Star_pickup(getPlayer()));
        lvl4stars.add(star2);
        star3 = new Green_star(this);
        star3.setPosition(new Vec2(13.5f, 2.5f));
        star3.addCollisionListener(new Star_pickup(getPlayer()));
        lvl4stars.add(star3);
        star4 = new Green_star(this);
        star4.setPosition(new Vec2(-12,3.5f));
        star4.addCollisionListener(new Star_pickup(getPlayer()));
        lvl4stars.add(star4);
        star5 = new Green_star(this);
        star5.setPosition(new Vec2(-13.5f,-1f));
        star5.addCollisionListener(new Star_pickup(getPlayer()));
        lvl4stars.add(star5);

        //background
        Body background4 = new Background4(this);
        background4.setPosition(new Vec2(0,0));

        getPlayer().setPosition(new Vec2(-13.5f, 14));
    }

//    @Override
//    public Vec2 startPosition(){
//
//        //return new Vec2(-9f, -1.5f);
//        return new Vec2(-13.5f, 14);
//    }
    @Override
    public Vec2 exitPosition(){
        return new Vec2(-1.5f,1.5f);
    }

    /*@Override
    public String setMusic(){
        return "data/song4.wav";
    }*/
}

