package game;

import city.cs.engine.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Star_pickup implements CollisionListener {
    private Fish fish;
    private SoundClip gameMusic;

    public Star_pickup(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == fish) {
            if (Game.currentLevel==1){
                World1.lvl1stars.remove(e.getReportingBody());
                System.out.println(e.getReportingBody().getPosition());
            }
            if (Game.currentLevel==2){
                World2.lvl2stars.remove(e.getReportingBody());
            }
            if (Game.currentLevel==3){
                World3.lvl3stars.remove(e.getReportingBody());
            }
            if (Game.currentLevel==4){
                World4.lvl4stars.remove(e.getReportingBody());
            }
            e.getReportingBody().destroy();
            Green_star reportingBody = (Green_star) e.getReportingBody();
            try {
                gameMusic = new SoundClip("data/beep.wav");   // Open an audio input stream
                gameMusic.play();  // Set it to continous playback (looping)
            } catch (UnsupportedAudioFileException|IOException|LineUnavailableException e1) {
                System.out.println(e1);
            }
            GameLevel.starCount++;

        }

    }
}
