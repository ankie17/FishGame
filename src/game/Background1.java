package game;

import city.cs.engine.BodyImage;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

public class Background1 extends StaticBody {

    private static final BodyImage image =
            new BodyImage("data/background1.jpg", 30f);


    public Background1(World w) {
        super(w);
        addImage(image);
        // setAlwaysOutline(true);
    }
}
