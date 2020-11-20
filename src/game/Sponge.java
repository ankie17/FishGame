package game;

import city.cs.engine.*;

public class Sponge extends DynamicBody {

    private static final Shape shape_pizza_box = new PolygonShape(
            -1.445f,-1.469f, -1.463f,1.451f, 1.463f,1.451f, 1.457f,-1.499f, -1.416f,-1.499f);
    private static final BodyImage image =
            new BodyImage("data/sponge.png", 2.95f);


    public Sponge(World w) {
        super(w, shape_pizza_box);
        addImage(image);
        // setAlwaysOutline(true);
    }

}