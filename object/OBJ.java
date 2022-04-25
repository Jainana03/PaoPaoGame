package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ extends SuperObject{
    public OBJ(){
        name = "Key";

        try {
            image = ImageIO.read(getClass().getResourceAsStream(""));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}