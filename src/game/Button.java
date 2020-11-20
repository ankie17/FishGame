package game;

import city.cs.engine.*;

public class Button extends StaticBody {

    private static final Shape shape_box = new PolygonShape(
            -0.34f,2.69f, 2.0f,2.7f, 1.97f,-2.3f, -0.37f,-2.3f, -0.38f,2.58f);
    private static final BodyImage image =
            new BodyImage("data/button.png", 2f);


    public Button(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}