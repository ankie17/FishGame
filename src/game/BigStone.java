package game;

import city.cs.engine.*;

public class BigStone extends DynamicBody {

    private static final Shape shape_box = new PolygonShape(
            -2.47f,-1.0f, -2.47f,0.95f, 2.54f,0.93f, 2.53f,-1.03f, -2.43f,-1.03f);
    private static final BodyImage image =
            new BodyImage("data/bigstone.png", 2f);


    public BigStone(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}