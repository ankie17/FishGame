package game;

import city.cs.engine.*;

public class Grass extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -0.48f,-1.45f, -0.48f,1.47f, 0.57f,1.46f, 0.56f,-1.49f, -0.47f,-1.49f);
    private static final BodyImage image =
            new BodyImage("data/grass.png", 3f);


    public Grass(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}