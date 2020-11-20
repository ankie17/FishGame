package game;

import city.cs.engine.*;

public class ButtonUp extends StaticBody {

    private static final Shape shape_box = new PolygonShape(
            -1.464f,0.992f, -1.48f,-0.256f, 1.296f,-0.256f, 1.288f,0.992f, -1.4f,1.008f);
    private static final BodyImage image =
            new BodyImage("data/buttonup.png", 2f);


    public ButtonUp(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

}