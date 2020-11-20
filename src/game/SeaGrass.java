package game;

import city.cs.engine.*;

public class SeaGrass extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -0.47f,-1.47f, -0.46f,1.47f, 0.5f,1.48f, 0.48f,-1.5f, -0.44f,-1.51f);
    private static final BodyImage image =
            new BodyImage("data/seagrass.png", 3f);


    public SeaGrass(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}