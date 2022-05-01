package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_In extends SuperObject{
    public OBJ_In(GamePanel gPanel,String element){
        name = "IncreasePower";
        if(element.equals("+1")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+4")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+5")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("x2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("x3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/wood-yellow.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        
    }
}