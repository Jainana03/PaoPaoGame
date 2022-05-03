package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

import main.GamePanel;

public class OBJ_De extends SuperObject{
    String[] DecreaseElementList = {"-1","-2","-3","-4","-5","/2","/3"};
    Random r = new Random();
    public OBJ_De(GamePanel gPanel){
        element = DecreaseElementList[r.nextInt(7)];
        name = "DecreasePower";
        if(element.equals("-1")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/minus1.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/minus2.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/minus3.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-4")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/minus4.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("-5")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/minus5.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("/2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/divide2.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        if(element.equals("/3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/divide3.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }
        }
        

    }
}
