package object;

import main.GamePanel;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Nomjib extends SuperObject{
    public OBJ_Nomjib(GamePanel gPanel){
        name = "NomJib";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/nomnom/NomJib-1.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : Lost Nomjib image");
        }
    }
    
}
