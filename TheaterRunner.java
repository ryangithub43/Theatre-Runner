import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {


    String[] backgroundImages = {"minecraftworld.png", "thenether.png"};

    
    SceneImage[] images = {new SceneImage("jackblack.png", 0, 100), 
                           new SceneImage("netherportal.png", 0, 0)
                          };

    ImageScene scene = new ImageScene(backgroundImages, images);


    scene.drawScene();

    /*
     * Plays the scene
     */
    
    Theater.playScenes(scene); 
  }
}
