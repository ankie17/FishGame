package game;

import city.cs.engine.*;

public class Newspaper extends DynamicBody {

    private static final Shape shape_newspaper= new PolygonShape(
            0.952f,-0.512f, 0.96f,0.468f, -0.964f,0.468f, -0.964f,-0.524f, 0.928f,-0.524f);
    private static final BodyImage image =
            new BodyImage("data/newspapers.png", 2f);


    public Newspaper(World w) {
        super(w, shape_newspaper);
        addImage(image);
       // setAlwaysOutline(true);
    }

}