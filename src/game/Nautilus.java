package game;

import city.cs.engine.*;

public class Nautilus extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -0.984f,-0.944f, -0.98f,0.972f, 0.984f,0.964f, 0.984f,-0.956f, -0.968f,-0.956f);
    private static final BodyImage image =
            new BodyImage("data/nautilus.png", 2f);


    public Nautilus(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}