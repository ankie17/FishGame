package game;

import city.cs.engine.*;

public class Pizza_box extends DynamicBody {

    private static final Shape shape_pizza_box = new PolygonShape(
            1.317f,-0.694f, 1.306f,0.64f, -1.38f,0.634f, -1.374f,-0.746f, 1.294f,-0.734f);
    private static final BodyImage image =
            new BodyImage("data/pizza_box.png", 2.5f);


    public Pizza_box(World w) {
        super(w, shape_pizza_box);
        addImage(image);
       // setAlwaysOutline(true);
    }

}