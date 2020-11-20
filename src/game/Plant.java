package game;

import city.cs.engine.*;

public class Plant extends StaticBody {

    private static final Shape shape_box = new PolygonShape(
            -0.95f,-3.98f, -0.94f,3.87f, 1.02f,3.87f, 1.0f,-4.06f, -0.84f,-4.05f);
    private static final BodyImage image =
            new BodyImage("data/plant.png", 8f);


    public Plant(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}