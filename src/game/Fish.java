package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.event.MouseEvent;

/**
 * Simple character
 */
public class Fish extends Walker implements CollisionListener{

    private static final float RADIUS = 0.5f;

    private static final Shape bulletShape
            = new CircleShape(RADIUS);

    // Remember:  using the keyword static below means the fields shape and image belong to the class, rather than any instance. 
    // That means there is a single shape and image for all instances of the class.
    private static final Shape shape = new PolygonShape(
            -1.45f,0.23f, -0.21f,1.02f, 1.45f,0.57f, 1.45f,-0.88f, -0.55f,-0.9f, -1.49f,-0.43f);

    private static final BodyImage imageStill =
            new BodyImage("data/still.png", 1.5f);

    private int starCount;

    GameLevel world;

    private int bulletSpeed = 15;

    public Fish(GameLevel gameWorld) {
        super(gameWorld, shape);
        addImage(imageStill);
        starCount = 0;

        this.world = gameWorld;
    }

    public int getStarCount(){
        return starCount;
    }

    public void incrementStarCount(){
        starCount++;
        System.out.println("Hurray! Star count = " + starCount);
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {

    }
}
