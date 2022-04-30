package main;

import object.OBJ_De;
import object.OBJ_In;

import java.util.Random;
import java.awt.Graphics2D;

public class AssetSetter {
    GamePanel gPanel;
    Graphics2D g2D;
    Random random = new Random();
    public String[] InPowerElement = {"+1","+2","+3","+5","x2","x3"};
    public String[] DePowerElement = {"-1","-2","-3","-5","/2","/3"};
    public int randomNum = random.nextInt(6);
    int lastMapsNum = 7;

    public AssetSetter(GamePanel gPanel){
        this.gPanel = gPanel;
    }

    public void setObject(){
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        
        

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 5 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        
    }
    
}
