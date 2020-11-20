package game;

import city.cs.engine.*;

public class Stone extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -1.46f,-1.45f, -1.45f,1.45f, 1.46f,1.45f, 1.47f,-1.5f, -1.45f,-1.49f);
    private static final BodyImage image =
            new BodyImage("data/stone.png", 3f);


    public Stone(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}