package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class PortalCollision2 implements CollisionListener {
    private Game game;

    public PortalCollision2(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            e.getOtherBody().setPosition(new Vec2(-12f, -4f));
            //System.exit(0);
        }

    }
}