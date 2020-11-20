
package game;

import city.cs.engine.*;

public class ShowInfo implements CollisionListener {
    private Fish fish;

    public ShowInfo(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == fish) {
            System.out.println("Press on the star");
        }

    }
}