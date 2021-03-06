package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

import main.GamePanel;

public class OBJ_In extends SuperObject{
    String[] IncreaseElementList = {"+1","+2","+3","+4","+5","x2","x3"};
    Random r = new Random();
    public OBJ_In(GamePanel gPanel){
        element = IncreaseElementList[r.nextInt(7)];
        name = "IncreasePower";
        if(element.equals("+1")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/plus1.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/plus2.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/plus3.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+4")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/plus4.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("+5")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/plus5.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("x2")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/multiply2.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        if(element.equals("x3")){
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/res/objects/multiply3.png"));
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR : Lost object file");
            }   
        }
        
    }
}
