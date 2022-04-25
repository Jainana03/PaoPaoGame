package entity;

import main.GamePanel;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Monster extends Entity {
    GamePanel gp;

    public Monster(GamePanel gp){
        this.gp = gp;
    }
    public void getMonsterImage(){
        try {
            upwalk1 = ImageIO.read(getClass().getResourceAsStream("/res/nomnom/NomJib-1.png")); 
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : lost Monster Image");
        }
    }
    
}
