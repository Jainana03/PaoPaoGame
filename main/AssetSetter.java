package main;

import object.OBJ_De;
import object.OBJ_In;
import object.OBJ_Nomjib;

import java.util.Random;

public class AssetSetter {
    GamePanel gPanel;
    Random random = new Random();
    public String[] InPowerElement = {"+1","+2","+3","+4","+5","x2","x3"};
    public String[] DePowerElement = {"-1","-2","-3","-4","-5","/2","/3"};
    public int randomInNum = random.nextInt(6);
    public int randomDeNum = random.nextInt(6);
    public int randomX = random.nextInt(20);
    public int randomY = random.nextInt(50);
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 9 * gPanel.tileSize;
        gPanel.obj[8].worldY = 6 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 10 * gPanel.tileSize;
        gPanel.obj[9].worldY = 16 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 9 * gPanel.tileSize;
        gPanel.obj[10].worldY = 27 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = random.nextInt(43,47);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = 32;
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(25,27);
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(11,14);
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 6 * gPanel.tileSize;
        gPanel.obj[8].worldY = 14 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 15 * gPanel.tileSize;
        gPanel.obj[9].worldY = 26 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(46,49);
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = randomX * gPanel.tileSize;
        gPanel.obj[10].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = 37;
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(22,25);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        randomX = random.nextInt(20);
        randomY = random.nextInt(50);

        //randomNomJib
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        randomX = random.nextInt(20);
        randomY = random.nextInt(50);

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(13,16);
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 5 * gPanel.tileSize;
        gPanel.obj[8].worldY = 42 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 6 * gPanel.tileSize;
        gPanel.obj[9].worldY = 16 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 14 * gPanel.tileSize;
        gPanel.obj[10].worldY = 32 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(45,48);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);


        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(32,35);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(22,26);
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(16,19);
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 12 * gPanel.tileSize;
        gPanel.obj[8].worldY = 36 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 5 * gPanel.tileSize;
        gPanel.obj[9].worldY = 16 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 8 * gPanel.tileSize;
        gPanel.obj[10].worldY = 27 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(44,46);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = random.nextInt(34,37);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(25,28);
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(13,18);
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
    

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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 8 * gPanel.tileSize;
        gPanel.obj[8].worldY = 35 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 12 * gPanel.tileSize;
        gPanel.obj[9].worldY = 23 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 6 * gPanel.tileSize;
        gPanel.obj[10].worldY = 12 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(43,49);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = 36;
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = 26;
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = 14;
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 14 * gPanel.tileSize;
        gPanel.obj[8].worldY = 35 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 7 * gPanel.tileSize;
        gPanel.obj[9].worldY = 25 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 7 * gPanel.tileSize;
        gPanel.obj[10].worldY = 35 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(46,48);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(34,37);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(23,27);
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = 13;
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 5 * gPanel.tileSize;
        gPanel.obj[8].worldY = 36 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 11 * gPanel.tileSize;
        gPanel.obj[9].worldY = 26 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 14 * gPanel.tileSize;
        gPanel.obj[10].worldY = 14 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(45,48);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = 36;
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(23,25);
        randomY = 7;
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = 15;
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 15 * gPanel.tileSize;
        gPanel.obj[8].worldY = 31 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 5 * gPanel.tileSize;
        gPanel.obj[9].worldY = 13 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 11 * gPanel.tileSize;
        gPanel.obj[10].worldY = 23 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(45,49);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(33,36);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(24,26);
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = 16;
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 9 * gPanel.tileSize;
        gPanel.obj[8].worldY = 33 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 14 * gPanel.tileSize;
        gPanel.obj[9].worldY = 13 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 9 * gPanel.tileSize;
        gPanel.obj[10].worldY = 7 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(42,46);
        randomY = random.nextInt(8,12);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = random.nextInt(32,37);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = 26;
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = random.nextInt(11,15);
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
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

        //NomJib
        gPanel.obj[8] = new OBJ_Nomjib(gPanel);
        gPanel.obj[8].worldX = 13 * gPanel.tileSize;
        gPanel.obj[8].worldY = 32 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //NomJib
        gPanel.obj[9] = new OBJ_Nomjib(gPanel);
        gPanel.obj[9].worldX = 5 * gPanel.tileSize;
        gPanel.obj[9].worldY = 12 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
        //NomJib
        gPanel.obj[10] = new OBJ_Nomjib(gPanel);
        gPanel.obj[10].worldX = 7 * gPanel.tileSize;
        gPanel.obj[10].worldY = 36 * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);

        //randomNomJib
        randomX = random.nextInt(7,13);
        randomY = random.nextInt(44,47);
        gPanel.obj[11] = new OBJ_Nomjib(gPanel);
        gPanel.obj[11].worldX = randomX * gPanel.tileSize;
        gPanel.obj[11].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = random.nextInt(31,33);
        gPanel.obj[12] = new OBJ_Nomjib(gPanel);
        gPanel.obj[12].worldX = randomX * gPanel.tileSize;
        gPanel.obj[12].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(8,12);
        randomY = 22;
        gPanel.obj[13] = new OBJ_Nomjib(gPanel);
        gPanel.obj[13].worldX = randomX * gPanel.tileSize;
        gPanel.obj[13].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        

        //randomNomJib
        randomX = random.nextInt(6,14);
        randomY = 13;
        gPanel.obj[14] = new OBJ_Nomjib(gPanel);
        gPanel.obj[14].worldX = randomX * gPanel.tileSize;
        gPanel.obj[14].worldY = randomY * gPanel.tileSize;
        gPanel.player.randomNJ = random.nextInt(4);
        
    }

        
    
}
