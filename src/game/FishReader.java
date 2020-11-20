package game;

import city.cs.engine.Body;
import org.jbox2d.common.Vec2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Demonstrates how high-score data can be read from a text
 * file and printed to the terminal.
 */
public class FishReader {

    GameLevel world;
    /**
     * declaring a variables that are used in the class
     */
    private String fileName;
    /**
     * declaring a variables that are used in the class
     */
    public Game game;
    /**
     * declaring a variables that are used in the class
     */
    public int l;
    /**
     * declaring a variables that are used in the class
     */
    public float x;
    /**
     * declaring a variables that are used in the class
     */
    public float y;
    /**
     * declaring a variables that are used in the class
     */
    public float starx;
    /**
     * declaring a variables that are used in the class
     */
    public float stary;
    /**
     * declaring a variables that are used in the class
     */
    public ArrayList<Float> allcoordinates = new ArrayList<Float>();
    /**
     * declaring a variables that are used in the class
     */
    public Body[] newStars;
    /**
     * declaring a variables that are used in the class
     */
    public int starCount;

    /**
     * Initialise a new file reader
     * @param fileName the name of the high-score file
     * @param world calls current world
     * @param game calls main game
     */
    public FishReader(String fileName, GameLevel world, Game game) {
        this.fileName = fileName;
        this.world = world;
        this.game = game;

    }

    /**
     * Read the fish position from the fish position file and print it to
     * the terminal window as well as setting it in the world
     */
    public void readFishPosition() throws IOException {
        FileReader fr = null;
        BufferedReader reader = null;
        try {
            System.out.println("Reading " + fileName + " ...");
            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                // file is assumed to contain one name, score pair per line
                String[] tokens = line.split(",");
                x = Float.parseFloat(tokens[0]);
                y = Float.parseFloat(tokens[1]);
                System.out.println("fish x: " + x + ", fish y: " + y);
                line = reader.readLine();
                l =  Integer.parseInt(line);
                System.out.println("level:" + l);
                line = reader.readLine();
            }
            System.out.println("...done.");
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }

    /**
     * Read the star positions from the star position file and set them in the world
     * @param fileName2 file where star position are stored
     * @throws IOException
     */
    public void readStar(String fileName2) throws IOException {
        FileReader fr = null;
        BufferedReader reader = null;
        try {
            System.out.println("Reading " + fileName2 + " ...");
            fr = new FileReader(fileName2);
            reader = new BufferedReader(fr);
            String line = reader.readLine();
            if (Game.currentLevel==1 || Game.currentLevel==2 || Game.currentLevel==3 ){
                line = reader.readLine();
                line = reader.readLine();
                line = reader.readLine();
            }
            if (Game.currentLevel==4) {
                line = reader.readLine();
                line = reader.readLine();
                line = reader.readLine();
                line = reader.readLine();
            }
            while (line != null) {
                // file is assumed to contain one name, score pair per line
                String[] tokens = line.split(",");
                starx = Float.parseFloat(tokens[0]);
                stary = Float.parseFloat(tokens[1]);
                System.out.println("star x: " + x + ", star y: " + y);
                allcoordinates.add(starx);
                allcoordinates.add(stary);
                line = reader.readLine();
            }

            System.out.println("...done.");

        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
        System.out.println(allcoordinates);
    }

    /**
     * creating stars after loading files
     */
    public void setNewStars(){
        int i=0;
        for (int j=0; j<allcoordinates.size()/2; j++){
            newStars[j] = new Green_star(world);
            float x = allcoordinates.get(i);
            float y = allcoordinates.get(i+1);
            newStars[j].setPosition(new Vec2(x,y));
            System.out.println(newStars[j].getPosition());
            i+=2;
        }
    }

    /**
     * load files
     */
    public void load() {
        game.stopMusic();
        if (l == 1) {
            newStars = new Body[allcoordinates.size() / 2];
            game.restart1(x, y);
            setNewStars();
            boolean star2 = false;
            boolean star3 = false;
            boolean star4 = false;
            for (int i = 0; i < allcoordinates.size() / 2; i++) {
                if (World1.star2.getPosition() == newStars[i].getPosition()) {
                    star2=true;
                }
                if (World1.star3.getPosition() == newStars[i].getPosition()) {
                    star3=true;
                }
                if (World1.star4.getPosition() == newStars[i].getPosition()) {
                    star4=true;
                }

            }
            if (star2==false){
                World1.star2.destroy();
            }
            if (star3=false){
                World1.star3.destroy();
            }
            if (star4=false){
                World1.star4.destroy();
            }
        }
        else if (l == 2) {
            game.restart2(x, y);
            setNewStars();
            boolean star2 = false;
            boolean star3 = false;
            boolean star4 = false;
            for (int i = 0; i < allcoordinates.size() / 2; i++) {
                if (World2.star2.getPosition() == newStars[i].getPosition()) {
                    star2=true;
                }
                if (World2.star3.getPosition() == newStars[i].getPosition()) {
                    star3=true;
                }
                if (World2.star4.getPosition() == newStars[i].getPosition()) {
                    star4=true;
                }

            }
            if (star2==false){
                World2.star2.destroy();
            }
            if (star3=false){
                World2.star3.destroy();
            }
            if (star4=false){
                World2.star4.destroy();
            }
        }
        else if (l == 3) {
            game.restart3(x, y);
            setNewStars();
            boolean star2 = false;
            boolean star3 = false;
            boolean star4 = false;
            for (int i = 0; i < allcoordinates.size() / 2; i++) {
                if (World3.star2.getPosition() == newStars[i].getPosition()) {
                    star2=true;
                }
                if (World3.star3.getPosition() == newStars[i].getPosition()) {
                    star3=true;
                }
                if (World3.star4.getPosition() == newStars[i].getPosition()) {
                    star4=true;
                }

            }
            if (star2==false){
                World3.star2.destroy();
            }
            if (star3=false){
                World3.star3.destroy();
            }
            if (star4=false){
                World3.star4.destroy();
            }
        }
        else if (l == 4) {
            game.restart4(x, y);
            setNewStars();
            boolean star2 = false;
            boolean star3 = false;
            boolean star4 = false;
            boolean star5 = false;
            for (int i = 0; i < allcoordinates.size() / 2; i++) {
                if (World4.star2.getPosition() == newStars[i].getPosition()) {
                    star2=true;
                }
                if (World4.star3.getPosition() == newStars[i].getPosition()) {
                    star3=true;
                }
                if (World4.star4.getPosition() == newStars[i].getPosition()) {
                    star4=true;
                }
                if (World4.star5.getPosition() == newStars[i].getPosition()) {
                    star5=true;
                }

            }
            if (star2==false){
                World4.star2.destroy();
            }
            if (star3=false){
                World4.star3.destroy();
            }
            if (star4=false){
                World4.star4.destroy();
            }
            if (star5=false){
                World4.star5.destroy();
            }
        }
        }

    /**
     * Read star count from the star count file and set it in the world
      * @param fileName file where it stored
     * @return new starcount
     * @throws IOException
     */
    public int readStarCount(String fileName) throws IOException {
        FileReader fr = null;
        BufferedReader reader = null;
        try {
            System.out.println("Reading " + fileName + " ...");
            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                // file is assumed to contain one name, score pair per line
                starCount = Integer.parseInt(line);
                line = reader.readLine();
                System.out.println("starCount:" + starCount);
            }
            System.out.println("...done.");
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
        return starCount;
    }

    }

