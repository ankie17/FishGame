package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.DynamicBody;
import city.cs.engine.StaticBody;

public class MoveBlocks implements CollisionListener {
    private Game game;

    public MoveBlocks(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getReportingBody() instanceof platform && e.getOtherBody() instanceof StaticBody) {
            platform otherBody = (platform) e.getReportingBody();
            otherBody.changeWalkingDirection();
        }

    }
}
