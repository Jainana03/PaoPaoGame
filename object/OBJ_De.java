package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_De extends SuperObject{
    public OBJ_De(GamePanel gPanel,String element){
        name = "DecreasePower";
        if(element.equals("-1")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-5")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("/2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("/3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-red.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        

    }
}
