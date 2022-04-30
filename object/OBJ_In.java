package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_In extends SuperObject{
    public OBJ_In(GamePanel gPanel){
        name = "IncreasePower";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : Lost object file");
        }

    }
}