package game;

import city.cs.engine.*;

public class Pringles extends DynamicBody {

    private static final Shape shape_pringles= new PolygonShape(
            0.44f,-1.4f, 0.44f,1.42f, -0.43f,1.42f, -0.43f,-1.43f, 0.39f,-1.44f);
    private static final BodyImage image =
            new BodyImage("data/pringles.dms", 3f);


    public Pringles(World w) {
        super(w, shape_pringles);
        addImage(image);
        // setAlwaysOutline(true);
    }

}
