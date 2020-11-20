package game;

import city.cs.engine.*;

public class Exit extends StaticBody {

    private static final Shape shape_exit= new PolygonShape(
            0.46f,1.89f, 0.44f,-1.91f, -0.5f,-1.91f, -0.48f,1.9f, 0.39f,1.9f);
    private static final BodyImage image =
            new BodyImage("data/exit.png", 4f);


    public Exit(World w) {
        super(w, shape_exit);
        addImage(image);
        // setAlwaysOutline(true);
    }

}
