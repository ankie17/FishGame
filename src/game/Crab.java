package game;

import city.cs.engine.*;

public class Crab extends Walker {

    private static final Shape shape_box = new PolygonShape(
            -0.976f,0.484f, 1.004f,0.48f, 1.008f,-0.492f, -0.988f,-0.5f, -0.988f,0.46f);
    private static final BodyImage image =
            new BodyImage("data/crab.png", 1f);


    public Crab(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}