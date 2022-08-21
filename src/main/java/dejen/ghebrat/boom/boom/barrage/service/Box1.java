package dejen.ghebrat.boom.boom.barrage.service;

import java.io.File;
import java.io.IOException;

public class Box1 {

    public static final String path;

    static{
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        String audioFilePath = path + "/src/main/resources/sounds/KICK.wav";
        Player player = new Player();
        player.play(audioFilePath);
    }

}
