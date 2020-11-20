package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class RedPortal1 extends StaticBody implements CollisionListener{

    private Game game;

    private static final Shape shape_box = new PolygonShape(
            -0.48f,-1.45f, -0.48f,1.47f, 0.51f,1.48f, 0.51f,-1.47f, -0.43f,-1.46f);
    private static final BodyImage image =
            new BodyImage("data/pr.png", 3f);


    public RedPortal1(World w) {
        super(w, shape_box);
        addImage(image);
        //setAlwaysOutline(true);
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            game.getPlayer().destroy();
            System.out.println("gegefgfgdfg");

        }

    }

}