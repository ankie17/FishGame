package game;

import city.cs.engine.*;

public class Coral extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -0.976f,-0.952f, -0.98f,0.98f, 0.976f,0.98f, 0.976f,-0.976f, -0.968f,-0.98f);
    private static final BodyImage image =
            new BodyImage("data/coral.png", 2f);


    public Coral(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}