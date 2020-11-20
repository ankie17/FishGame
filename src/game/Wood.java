package game;

import city.cs.engine.*;

public class Wood extends Walker {

    private static final Shape shape_box = new PolygonShape(
            -0.503f,-0.468f, -0.501f,0.488f, 0.505f,0.485f, 0.505f,-0.479f, -0.488f,-0.474f);
    private static final BodyImage image =
            new BodyImage("data/wood.png", 1f);


    public Wood(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}