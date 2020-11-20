package game;

import city.cs.engine.*;

public class Bottle extends DynamicBody {

    private static final Shape shape_bottle = new PolygonShape(
            -0.339f,-0.773f, -0.322f,0.77f, 0.329f,0.767f, 0.322f,-0.798f, -0.322f,-0.798f);
    private static final BodyImage image =
            new BodyImage("data/bottle.png", 1.75f);


    public Bottle(World w) {
        super(w, shape_bottle);
        addImage(image);
        //setAlwaysOutline(true);
    }

}
