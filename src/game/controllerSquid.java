package game;

import city.cs.engine.Walker;

import static java.lang.Thread.sleep;

public class controllerSquid implements Runnable{
    private static final float walkingSpeed = 3;
    private Walker body;

    public controllerSquid(Walker body) {
        this.body = body;
    }


    @Override
    public void run() {
        while (true) {
            try {
                body.startWalking(walkingSpeed);
                sleep(1650);
                body.startWalking(-walkingSpeed);
                sleep(1650);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
