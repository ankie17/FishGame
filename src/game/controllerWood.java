package game;

import city.cs.engine.Walker;

import static java.lang.Thread.sleep;

public class controllerWood implements Runnable{
    private static final float walkingSpeed = 6;
    private Walker body;

    public controllerWood(Walker body) {
        this.body = body;
    }


    @Override
    public void run() {
        while (true) {
            try {
                body.startWalking(walkingSpeed);
                sleep(870);
                body.startWalking(-walkingSpeed);
                sleep(870);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
