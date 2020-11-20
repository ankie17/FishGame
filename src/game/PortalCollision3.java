package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class PortalCollision3 implements CollisionListener {
    private Game game;

    public PortalCollision3(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            e.getOtherBody().setPosition(new Vec2(-2.5f, 5.5f));
            //System.exit(0);
        }

    }
}