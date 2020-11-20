package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

import java.util.Timer;
import java.util.TimerTask;

public class ButtonUpCollision implements CollisionListener {
    private Game game;
    public static boolean loadTimer=false;

    public ButtonUpCollision(Game game) {
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    World3.plant.destroy();
                }
            };
            timer.schedule(task, 1000);
            //World3.plant.destroy();
            //System.exit(0);
        }

    }
}