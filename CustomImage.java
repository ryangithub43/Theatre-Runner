import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image that can be customized with image filters
 */
public class CustomImage extends ImagePlus {

  /*
   * Sets the superclass filename to the specified filename
   */
  
  public CustomImage(String filename) {
    super(filename);
  }
  

public void zeroRed() {
    // 0. Get the 2D array of pixel
    Pixel[][] pixels = getImagePixels();
    // 1. Traverse the 2D array of pixels
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        // 2. Get the current pixel
        Pixel currentPixel = pixels[row][col];
        // 3. Set the red value to 0 for the current pixel
        currentPixel.setRed(0);
      }
    }
  }

  
public void keepColor(String color) {
      Pixel[][] pixels = getImagePixels(); 
  

      
  
  for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[0].length; col++) {
          Pixel currentPixel = pixels[row][col];

          if (color.equals("red")) {
            currentPixel.setBlue(0);
            currentPixel.setGreen(0);
          } else if (color.equals("blue")) {
            currentPixel.setGreen(0);
            currentPixel.setRed(0);
          } else if (color.equals("green")) {
            currentPixel.setRed(0);
            currentPixel.setBlue(0);
            
          }
          }
        }
      }
    }

  
