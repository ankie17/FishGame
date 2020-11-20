package game;

import city.cs.engine.BodyImage;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

public class Background3 extends StaticBody {

    private static final BodyImage image =
            new BodyImage("data/background3.jpeg", 30f);


    public Background3(World w) {
        super(w);
        addImage(image);
        // setAlwaysOutline(true);
    }
}
