package game;

import city.cs.engine.*;

public class Water_bottle extends DynamicBody {

    private static final Shape shape_water_bottle= new PolygonShape(
            0.49f,-1.28f, 0.48f,1.31f, -0.47f,1.31f, -0.47f,-1.34f, 0.46f,-1.33f);
    private static final BodyImage image =
            new BodyImage("data/bottle_water.png", 3.25f);


    public Water_bottle(World w) {
        super(w, shape_water_bottle);
        addImage(image);
       // setAlwaysOutline(true);
    }

}