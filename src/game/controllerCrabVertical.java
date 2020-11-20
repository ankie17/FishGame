package game;

import city.cs.engine.Walker;

import static java.lang.Thread.sleep;

public class controllerCrabVertical implements Runnable{
    private static final float jumpSpeed = 7f;
    private Walker body;

    public controllerCrabVertical(Walker body) {
        this.body = body;
    }


    @Override
    public void run() {
        while (true) {
            try {
                body.jump(jumpSpeed);
                sleep(750);
                body.jump(-jumpSpeed);
                sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
