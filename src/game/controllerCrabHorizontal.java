package game;

        import city.cs.engine.Walker;

        import static java.lang.Thread.sleep;

public class controllerCrabHorizontal implements Runnable{
    private static final float walkingSpeed = 5;
    private Walker body;

    public controllerCrabHorizontal(Walker body) {
        this.body = body;
    }


    @Override
    public void run() {
        while (true) {
            try {
                body.startWalking(walkingSpeed);
                sleep(750);
                body.startWalking(-walkingSpeed);
                sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
