package game;

import city.cs.engine.*;


public class FinishLvl implements CollisionListener {
    public Game game;
    public World1 world1;
    public World2 world2;
    public World3 world3;
    public World4 world4;


    public FinishLvl(Game game) {
        this.game=game;
        this.world1 = world1;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == game.getPlayer()) {
//            world1.gameMusic.stop();
            game.goNextLevel();
        }

    }
}