package game;

import city.cs.engine.BodyImage;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

public class Background4 extends StaticBody {

    private static final BodyImage image =
            new BodyImage("data/background4.jpg", 30f);


    public Background4(World w) {
        super(w);
        addImage(image);
        // setAlwaysOutline(true);
    }
}
