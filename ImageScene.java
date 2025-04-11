import org.code.theater.*;
import org.code.media.*;

public class ImageScene extends Scene {

  
  private SceneImage[] images; // 1D array of images
  private String[] backgroundImages;



  public ImageScene(String[] backgroundImages, SceneImage[] images) {
    this.backgroundImages = backgroundImages; 
    this.images = images; 
  }


  public void drawBackground(int imageCall) {
    drawImage(backgroundImages[imageCall], 0, 0, 800); 
  }
  



  public void drawScene() {

    int counter = 0; 
    
    while (images[0].getX() < 300) {

        drawBackground(0);

        drawImage(images[1].getFileName(), 300, 100, 100); 
        
        int newX = images[0].getX() + 10;
        images[0].setX(newX);

        drawImage(images[0].getFileName(), newX, images[0].getY(), 100);

        counter = counter + 1; 

        System.out.println("Loading Overworld Scene..." + "(" + counter + ")");
        pause(0.1);

    }

    
    pause(0.1); 

    int counter2 = 0;
    
    while (images[0].getX() == 300 || images[0].getX() > 0)  {

        drawBackground(1); 
      
        drawImage(images[1].getFileName(), 300, 150, 100);

        int newX = images[0].getX() - 10;

        images[0].setX(newX);
  
        drawImage(images[0].getFileName(), newX, 150, 100);

        counter2 = counter2 + 1; 

        System.out.println("Loading Nether Scene..." + "(" + counter2 + ")"); 
        pause(0.1); 
    }

    pause(0.5); 
    

  }
}
