package game;

        import java.io.FileWriter;
        import java.io.IOException;

public class FishWriter {

    public Fish fish;
    public World1 world1;

    public FishWriter() {
    }

    public void writePosition( String fileName, int l, float x,float y)
            throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(x + "," + y + "\n");
            writer.write(l + "\n");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        System.out.println("saved");
    }

    public void writeStarPosition( String fileName, int lenght)
            throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            float x = 0;
            float y = 0;
            for (int i=0; i<lenght; i++){
                if (Game.currentLevel==1){
                    x = World1.lvl1stars.get(i).getPosition().x;
                    y = World1.lvl1stars.get(i).getPosition().y;
//                    writer.write(x + "," + y + "\n");
                }
                if (Game.currentLevel==2){
                    x = World2.lvl2stars.get(i).getPosition().x;
                    y = World2.lvl2stars.get(i).getPosition().y;
//                    writer.write(x + "," + y + "\n");
                }
                if (Game.currentLevel==3){
                    x = World3.lvl3stars.get(i).getPosition().x;
                    y = World3.lvl3stars.get(i).getPosition().y;
//                    writer.write(x + "," + y + "\n");
                }
                if (Game.currentLevel==4){
                    x = World4.lvl4stars.get(i).getPosition().x;
                    y = World4.lvl4stars.get(i).getPosition().y;
//                    writer.write(x + "," + y + "\n");
                }

                writer.write(x + "," + y + "\n");

            }


        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        System.out.println("saved");
    }


    public void writeStarCount( String fileName, int starCount)
            throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(starCount+ "\n");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        System.out.println("saved");
    }

}
