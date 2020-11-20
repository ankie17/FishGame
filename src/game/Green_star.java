package game;

import city.cs.engine.*;

public class Green_star extends StaticBody {

    private static final Shape shape_star= new PolygonShape(
            -0.68f,-0.97f, -1.11f,0.26f, 0.0f,1.02f, 1.09f,0.23f, 0.65f,-0.97f, -0.65f,-0.98f);
    private static final BodyImage image =
            new BodyImage("data/star_green.png", 3f);


    public Green_star(World w) {
        super(w, shape_star);
        addImage(image);
        // setAlwaysOutline(true);
    }

}
