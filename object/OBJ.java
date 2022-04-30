package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ extends SuperObject{
    public OBJ(GamePanel gPanel){
        name = "x2HP";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : Lost object file");
        }

    }
}