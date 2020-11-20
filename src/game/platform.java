package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class platform extends Walker {

    private GameLevel world;

    private int walkingSpeed;

    public platform(World world, Shape shape) {
        super(world, shape);
        this.world = (GameLevel) world;

        this.startWalking(walkingSpeed);

        Shape platformShape = new BoxShape(1,1);
        Body platformBody = new StaticBody(world, platformShape);
        platformBody.setPosition(new Vec2(-11.5f, -7.5f));
    }

    public void changeWalkingDirection() {
        this.walkingSpeed *= -1;
        this.startWalking(walkingSpeed);
    }
}
