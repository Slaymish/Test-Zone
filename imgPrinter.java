import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class imgPrinter {

    public static final int WIDTH = 1024;
    public static final int HEIGHT = 920;
    public static String fileName = "";
  
    public imgPrinter(String fileName, Color[][] sceneArray) throws IOException{
      this.fileName = fileName;
      
      // For storing image in RAM
        BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        File f = null;
        // WRITE IMAGE
        
        try {
            for (int y = 0; y < HEIGHT; y++){
                for (int x = 0; x < WIDTH; x++){
                    img.setRGB(x,y,scene.sceneArray[x][y].toInt());
                }
            } 
            // Output file path
            f = new File(fileName + ".png");
  
            // Writing to file taking type and path as
            ImageIO.write(img, "png", f);
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
