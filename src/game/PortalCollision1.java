package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import org.jbox2d.common.Vec2;

public class PortalCollision1 implements CollisionListener {
    private Game game;

    public PortalCollision1(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            e.getOtherBody().setPosition(new Vec2(6.5f, -9));
            //System.exit(0);
        }

    }
}