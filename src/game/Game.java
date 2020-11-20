package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**
 * The computer game
 * @author Anna Kuznietsova
 */
public class Game {

    /**
     * Creates new field/world for game
     */
    private GameLevel world;

    /**
     * Creates view for person who playing
     */
    private UserView view;

    /**
     * Calls class that provides control for the game
     */
    private Controller controller;

    /**
     * Declaring variables that are used in following methods
     */
    public static int currentLevel = 1;
    /**
     * Declaring variables that are used in following methods
     */
    public SoundClip lvl1Music;
    /**
     * Declaring variables that are used in following methods
     */
    public SoundClip lvl2Music;
    /**
     * Declaring variables that are used in following methods
     */
    public SoundClip lvl3Music;
    /**
     * Declaring variables that are used in following methods
     */
    public SoundClip lvl4Music;
    /**
     * Declaring variables that are used in following methods
     */
    static int lengthstars;
    /**
     * Declaring variables that are used in following methods
     */
    private int level;


    /**
     * Initialises a new game
     */
    public Game() {

        // make the world
        level=1;
        world=new World1();
        world.populate(this);

        view = new MyView(world, world.getPlayer(), 650, 650);

        // make a view
        // uncomment this to draw a 1-metre grid over the view
         view.setGridResolution(1);

        // display the view in a frame
        final JFrame frame = new JFrame("Logic game");

        ControlPanel buttons = new ControlPanel(this);
        frame.add(buttons.getMainPanel(), BorderLayout.SOUTH);

        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window
        frame.add(view);
        // don't let the game window be resized
        frame.setResizable(false);
        // size the game window to fit the world view
        frame.pack();
        // make the window visible
        frame.setVisible(true);
        // get keyboard focus
        frame.requestFocus();
        // give keyboard focus to the frame whenever the mouse enters the view
        //view.addMouseListener(new GiveFocus(frame));
        view.addMouseListener(new MouseTest(view));
        controller = new Controller(world.getPlayer());
        frame.addKeyListener(controller);

        // uncomment to make the view track the bird
        // world.addStepListener(new Tracker(view, world.getPlayer()));

        // uncomment this to make a debugging view
        // JFrame debugView = new DebugViewer(world, 500, 500);

        setLvl1Music();
        // start!

        world.start();
        restart1(-8,-2);
    }

    /**
     *  Setting new soundtracks for levels one to four
     */
    public void setLvl1Music(){
        try{
            lvl1Music = new SoundClip("data/song1.wav");
            lvl1Music.loop();
            lvl1Music.setVolume(1f);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            System.out.println(e);
        }
    }

    public void setLvl2Music(){
        try{
            lvl2Music = new SoundClip("data/song2.wav");
            lvl2Music.loop();
            lvl2Music.setVolume(1f);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            System.out.println(e);
        }
    }

    public void setLvl3Music(){
        try{
            lvl3Music = new SoundClip("data/song3.wav");
            lvl3Music.loop();
            lvl3Music.setVolume(1f);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            System.out.println(e);
        }
    }

    public void setLvl4Music(){
        try{
            lvl4Music = new SoundClip("data/song4.wav");
            lvl4Music.loop();
            lvl4Music.setVolume(1f);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            System.out.println(e);
        }
    }

    /**
     * Method that restart level 1 when button pressed
     * @param x Horizontal position of the fish
     * @param y Vertical position of the fish
     */
    public void restart1(float x, float y){
        world = new World1();
        setup();
        lvl1Music.stop();
        setLvl1Music();
        world.getPlayer().setPosition(new Vec2(x,y));
    }

    /**
     * Method that restart level 2 when button pressed
     * @param x Horizontal position of the fish
     * @param y Vertical position of the fish
     */
    public void restart2(float x, float y){
        world = new World2();
        setup();
        lvl2Music.stop();
        setLvl2Music();
        world.getPlayer().setPosition(new Vec2(x,y));
    }
    /**
     * Method that restart level 3 when button pressed
     * @param x Horizontal position of the fish
     * @param y Vertical position of the fish
     */
    public void restart3(float x, float y){
        world = new World3();
        setup();
        lvl3Music.stop();
        setLvl3Music();
        world.getPlayer().setPosition(new Vec2(x,y));
    }
    /**
     * Method that restart level 4 when button pressed
     * @param x Horizontal position of the fish
     * @param y Vertical position of the fish
     */
    public void restart4(float x, float y){
        world = new World4();
        setup();
        lvl4Music.close();
        setLvl4Music();
        world.getPlayer().setPosition(new Vec2(x,y));
    }

    /**
     * method that stops music when level is finished or changed
     */
    public void stopMusic(){
        if (currentLevel==1){
            lvl1Music.close();
        }
        else if (currentLevel==2){
            lvl2Music.close();
        }
        else if (currentLevel==3){
            lvl3Music.close();
        }
        else if (currentLevel==4){
            lvl4Music.close();
        }
    }

    /**
     * method that creates all the objects in the current level
     */
    public void setup(){
        world.populate(this);
        controller.setBody(world.getPlayer());
        view.setWorld(world);
        world.start();
    }

    /**
     * shows which level is currently on
     * @return current level
     */
    public int getLevel() {return level;}

    /**
     * Calls the character to the current level
     * @return main character to level
     */
    public Fish getPlayer(){
        return world.getPlayer();
    }

    /**
     * stops completing the level
     */
    public  void pause(){
        world.stop();
    }

    /**
     * resuming compliting the level
     */
    public void play(){
        world.start();
    }

    /**
     * when restart button pressed this method decides which level to restart
     */
    public void restart() {
        if (level == 1) {
            restart1(-8,-2);
        } else if (level == 2) {
            restart2(-6, 7.5f);
        } else if (level == 3) {
            restart3(-13.5f, -10);
        } else if (level == 4) {
            restart4(-13.5f, 14);
        }
    }

    /**
     * method that changes level depending on what is chosen from drop-down list
     * @param levelGo number from drop-down list
     */
    public void go(int levelGo) {
        if (levelGo == 1){
            stopMusic();
            level = 1;
            world = new World1();
            setup();
            setLvl1Music();
            GameLevel.level = 1;
            currentLevel = 1;
            restart1(-8, -2);
        } else if (levelGo == 2){
            stopMusic();
            level = 2;
            setup();
            setLvl2Music();
            GameLevel.level = 2;
            currentLevel = 2;
            restart2(-6, 7.5f);
        } else if (levelGo == 3){
            stopMusic();
            world = new World3();
            setup();
            setLvl3Music();
            level = 3;
            GameLevel.level = 3;
            currentLevel = 3;
            restart3(-13.5f, -10);
        } else if (levelGo == 4) {
            stopMusic();
            world = new World4();
            setup();
            setLvl4Music();
            level = 4;
            GameLevel.level = 4;
            currentLevel = 4;
            restart4(-13.5f, 14);
        }
    }

    /**
     * method that changes level when the aim of previous is completed
     */
    public void goNextLevel(){
        if (level == 1){
            currentLevel = 2;
            level = 2;
            GameLevel.level = 2;
            world = new World2();
            lvl1Music.stop();
            setLvl2Music();
            setup();
            restart2(-6, 7.5f);
        } else if (level == 2){
            currentLevel = 3;
            level = 3;
            GameLevel.level = 3;
            world = new World3();
            lvl2Music.stop();
            setLvl3Music();
            setup();
            restart3(-13.5f, -10);
        } else if (level == 3){
            currentLevel = 4;
            level = 4;
            GameLevel.level = 4;
            world = new World4();
            lvl3Music.stop();
            setLvl4Music();
            setup();
            restart4(-13.5f, -14);
        } else if (level == 4) {
            currentLevel = 4;
            System.exit(0);

        }
    }

    /**
     * runs the game
     * @param args  arguments for game
     */
    public static void main(String[] args) {
        new Game();
    }

    /**
     * calls the level that should be displayed now
     * @return current level
     */
    public GameLevel getWorld() {
        return world;
    }

    /**
     * saving to files when 'save' button pressed
     */
    public void save() {
        if (currentLevel==1){
            lengthstars = World1.lvl1stars.size();
        }
        if (currentLevel==2){
            lengthstars = World2.lvl2stars.size();
        }
        if (currentLevel==3){
            lengthstars = World3.lvl3stars.size();
        }
        if (currentLevel==4){
            lengthstars = World4.lvl4stars.size();
            System.out.println(lengthstars);
        }
        FishWriter FW = new FishWriter();
        try {
            FW.writePosition("game.txt",level, world.getPlayer().getPosition().x, world.getPlayer().getPosition().y);
            FW.writeStarPosition("star1.txt", lengthstars);
            FW.writeStarCount("starCount.txt", GameLevel.starCount);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * loading from files when 'load' button pressed
     */
    public void read() {
        FishReader FR = new FishReader("game.txt", world, this);
        try {
            FR.readFishPosition();
            FR.readStar("star1.txt");
            GameLevel.starCount = FR.readStarCount("starCount.txt");
            FR.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
