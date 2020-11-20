package game;

import city.cs.engine.*;

public class BluePortal extends StaticBody {

    private static final Shape shape_box = new PolygonShape(
            -0.48f,-1.45f, -0.48f,1.47f, 0.51f,1.48f, 0.51f,-1.47f, -0.43f,-1.46f);
    private static final BodyImage image =
            new BodyImage("data/pb.png", 3f);


    public BluePortal(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}