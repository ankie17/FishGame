package game;

import city.cs.engine.*;

public class Chuck extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -0.82f,-3.47f, -0.82f,3.21f, 0.85f,3.21f, 0.9f,-3.53f, -0.79f,-3.54f);
    private static final BodyImage image =
            new BodyImage("data/chuck.png", 7f);


    public Chuck(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}