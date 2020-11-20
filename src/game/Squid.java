package game;

import city.cs.engine.*;

public class Squid extends Walker {

    private static final Shape shape_box = new PolygonShape(
            -1.47f,-0.448f, -1.47f,0.47f, 1.506f,0.47f, 1.506f,-0.484f, -1.434f,-0.472f);
    private static final BodyImage image =
            new BodyImage("data/squid.png", 1f);


    public Squid(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}