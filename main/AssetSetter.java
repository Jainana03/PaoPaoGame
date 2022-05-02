package main;

import object.OBJ_De;
import object.OBJ_In;

import java.util.Random;

public class AssetSetter {
    GamePanel gPanel;
    Random random = new Random();
    public String[] InPowerElement = {"+1","+2","+3","+4","+5","x2","x3"};
    public String[] DePowerElement = {"-1","-2","-3","-4","-5","/2","/3"};
    public int randomInNum = random.nextInt(6);
    public int randomDeNum = random.nextInt(6);
    int lastRandomNum = 7;

    public AssetSetter(GamePanel gPanel){
        this.gPanel = gPanel;
    }

    public void setObject1(){
        //complete
        System.out.println("set object for map1");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 5 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 8 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 11 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 4 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 15 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 8 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 11 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject2(){
        //complete
        System.out.println("set object for map2");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 8 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 11 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 15 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 4 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 6 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 13 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 13 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 6 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
}
    public void setObject3(){
        //complete
        System.out.println("set object for map3");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 5 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 4 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 15 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 6 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 13 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 13 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 6 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

    }
    public void setObject4(){
        //complete
        System.out.println("set object for map4");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 12 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 7 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 8 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 11 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 5 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 14 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 11 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 8 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject5(){
        //complete
        System.out.println("set object for map5");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 8 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 11 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 13 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 6 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 6 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 13 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 6 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 13 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject6(){
        //complete
        System.out.println("set object for map6");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 6 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 13 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 14 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 5 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 8 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 11 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 12 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 7 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
        
    }
    public void setObject7(){
        //complete
        System.out.println("set object for map7");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 5 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 8 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 11 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 7 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 12 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 14 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 5 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject8(){
        //complete
        System.out.println("set object for map8");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 8 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 11 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 15 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 4 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 11 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 8 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 5 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 14 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject9(){
        //complete
        System.out.println("set object for map9");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 11 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 8 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 7 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 12 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 13 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 6 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 7 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 12 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }
    public void setObject10(){
        //complete
        System.out.println("set object for map10");
        //obj_in = increase power door
        gPanel.obj[0] = new OBJ_In(gPanel);
        gPanel.obj[0].worldX = 7 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[1] = new OBJ_De(gPanel);
        gPanel.obj[1].worldX = 12 * gPanel.tileSize;
        gPanel.obj[1].worldY = 39 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[2] = new OBJ_In(gPanel);
        gPanel.obj[2].worldX = 13 * gPanel.tileSize;
        gPanel.obj[2].worldY = 29 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[3] = new OBJ_De(gPanel);
        gPanel.obj[3].worldX = 6 * gPanel.tileSize;
        gPanel.obj[3].worldY = 29 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[4] = new OBJ_In(gPanel);
        gPanel.obj[4].worldX = 8 * gPanel.tileSize;
        gPanel.obj[4].worldY = 19 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[5] = new OBJ_De(gPanel);
        gPanel.obj[5].worldX = 11 * gPanel.tileSize;
        gPanel.obj[5].worldY = 19 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);

        //obj_in = increase power door
        gPanel.obj[6] = new OBJ_In(gPanel);
        gPanel.obj[6].worldX = 14 * gPanel.tileSize;
        gPanel.obj[6].worldY = 9 * gPanel.tileSize;
        randomInNum = random.nextInt(6);

        //obj_de = decrease power door
        gPanel.obj[7] = new OBJ_De(gPanel);
        gPanel.obj[7].worldX = 5 * gPanel.tileSize;
        gPanel.obj[7].worldY = 9 * gPanel.tileSize;
        randomDeNum = random.nextInt(6);
    }

        
    
}
