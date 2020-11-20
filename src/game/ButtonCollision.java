package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class ButtonCollision implements CollisionListener {
    private Game game;
    public static boolean loadTimer=false;

    public ButtonCollision(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            World4.block6.destroy();
            //System.exit(0);
        }

    }
}