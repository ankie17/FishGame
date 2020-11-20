package game;

import city.cs.engine.World;
import org.jbox2d.common.Vec2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * superclass for all level subclasses
 */
public abstract class GameLevel extends World {

    /**
     * declaring a variables that are used in superclass
     */
    private Fish player;
    /**
     * Declaring variables that are used in following methods
     */
    private Exit exit;
    /**
     * Declaring variables that are used in following methods
     */
    private MyView view;
    /**
     * Declaring variables that are used in following methods
     */
    private World world;
    /**
     * Declaring variables that are used in following methods
     */
    public static int starCount = 0;
    /**
     * Declaring variables that are used in following methods
     */
    public static int level = 1;

    /**
     * Creating an object depending on a timer
     */
    private Runnable timer = new Runnable() {
        @Override
        public void run() {
            World3.plant = new Plant(world);
            World3.plant.setPosition(new Vec2(6f, 2f));
        }
    };

    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    /**
     * Creating an object depending on a timer
     */
    public GameLevel() {
        if (ButtonUpCollision.loadTimer) {
            service.scheduleAtFixedRate(timer, 0, 10, TimeUnit.SECONDS);
            World3.plant = new Plant(this);
            World3.plant.setPosition(new Vec2(6f, 2f));
        }
    }

    /**
     * calls main character to the world
     * @return main character to the world
     */
    public Fish getPlayer(){
        return player;
    }

    /**
     * setting character and exit to each level
     * @param game choose main game
     */
    public void populate(Game game){
        player = new Fish(this);
//        player.setPosition(startPosition());
        player.setGravityScale(0);

        Exit exit = new Exit(this);
        exit.setPosition(exitPosition());
        exit.addCollisionListener(new FinishLvl(game));
    }

    /**
     * creates an exit object on levels
     * @return position of exit on each level
     */
    public abstract Vec2 exitPosition();



}
