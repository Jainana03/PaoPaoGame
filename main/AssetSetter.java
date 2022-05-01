package main;

import object.OBJ_De;
import object.OBJ_In;

import java.util.Random;

public class AssetSetter {
    GamePanel gPanel;
    Random random = new Random();
    public String[] InPowerElement = {"+1","+2","+3","+5","x2","x3"};
    public String[] DePowerElement = {"-1","-2","-3","-5","/2","/3"};
    public int randomInNum = random.nextInt(6);
    public int randomDeNum = random.nextInt(6);
    int lastRandomNum = 7;

    public AssetSetter(GamePanel gPanel){
        this.gPanel = gPanel;
    }

    public void setObject1(){
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel,InPowerElement[randomInNum]);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel,DePowerElement[randomDeNum]);
        gPanel.obj[1].worldX = 5 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel,InPowerElement[randomInNum]);
        gPanel.obj[2].worldX = 8 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel,DePowerElement[randomDeNum]);
        gPanel.obj[3].worldX = 11 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
        
    
}
