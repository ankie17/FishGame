package game;

import city.cs.engine.*;

public class Box extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -2.07f,-1.93f, -2.06f,1.9f, 2.05f,1.91f, 2.04f,-1.99f, -2.04f,-1.98f);
    private static final BodyImage image =
            new BodyImage("data/box.png", 4.5f);


    public Box(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}