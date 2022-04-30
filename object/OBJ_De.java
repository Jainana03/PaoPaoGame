package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_De extends SuperObject{
    public OBJ_De(GamePanel gPanel){
        name = "DecreasePower";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : Lost object file");
        }

    }
}
