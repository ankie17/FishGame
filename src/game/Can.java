package game;

import city.cs.engine.*;

/**
 * Simple character
 */
public class Can extends DynamicBody {

    // Remember:  using the keyword static below means the fields shape and image belong to the class, rather than any instance.
    // That means there is a single shape and image for all instances of the class.
    private static final Shape shape_can = new PolygonShape(
            -0.59f,0.64f, 0.6f,0.64f, 0.61f,-0.63f, -0.62f,-0.64f, -0.62f,0.61f);
    private static final BodyImage image =
            new BodyImage("data/can.png", 3f);


    public Can(World w) {
        super(w, shape_can);
        addImage(image);
        //setAlwaysOutline(true);
    }

}
