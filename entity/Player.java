package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Player extends Entity{
    GamePanel gPanel;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;
    int door = 0;

    public Player(GamePanel gPanel,KeyHandler keyH){
        this.gPanel = gPanel;
        this.keyH = keyH;

        screenX = gPanel.ScreenWidth/2 - (gPanel.tileSize/2);
        screenY = gPanel.ScreenHeight/2 - (gPanel.tileSize/2);
        
        //Player hit block is 24x21 pixels and start at (12,15)
        solidArea = new Rectangle();
        solidArea.x = 12;
        solidArea.y = 15;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 24;
        solidArea.height = 21;

        setDefaultValues();
        getPlayerImage();
    }
    // start player's position, speed, direction and action
    public void setDefaultValues (){
        worldX = gPanel.tileSize*10;
        worldY = gPanel.tileSize*48;
        Power = 2;
        speed = 2;
        direction = "right";
        action = "walk";
    }
    public void getPlayerImage(){
        try {
            // -name : Pao -action : walk -direction : up
            upwalk1 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-upwalk1.png"));
            upwalk2 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-upwalk2.png"));
            upwalk3 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-upwalk3.png"));
            upwalk4 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-upwalk4.png"));
            // -name : Pao -action : walk -direction : down
            downwalk1 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-downwalk1.png"));
            downwalk2 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-downwalk2.png"));
            downwalk3 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-downwalk3.png"));
            downwalk4 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-downwalk4.png"));
            // -name : Pao -action : walk -direction : left
            leftwalk1 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-leftwalk1.png"));
            leftwalk2 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-leftwalk2.png"));
            leftwalk3 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-leftwalk3.png"));
            leftwalk4 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-leftwalk4.png"));
            // -name : Pao -action : walk -direction : right
            rightwalk1 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-rightwalk1.png"));
            rightwalk2 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-rightwalk2.png"));
            rightwalk3 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-rightwalk3.png"));
            rightwalk4 = ImageIO.read(getClass().getResourceAsStream("/res/paopao-walk/Pao2-rightwalk4.png"));

            // -name : Pao -action : stand -direction : left
            leftstand1 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-leftstand1.png"));
            leftstand2 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-leftstand2.png"));
            leftstand3 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-leftstand3.png"));
            leftstand4 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-leftstand4.png"));
            // -name : Pao -action : stand -direction : right
            rightstand1 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-rightstand1.png"));
            rightstand2 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-rightstand2.png"));
            rightstand3 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-rightstand3.png"));
            rightstand4 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-rightstand4.png"));
            // -name : Pao -action : stand -direction : down
            downstand1 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-downstand1.png"));
            downstand2 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-downstand2.png"));
            downstand3 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-downstand3.png"));
            downstand4 = ImageIO.read(getClass().getResourceAsStream("/res/pao-stand/Pao2-downstand4.png"));

            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : lost Player Image");
        }
    }
    public void update(){
        if(!collisionUpOn){
            worldY -= 3;
        }
        //spriteNum use to change player animation and spriteCounter use to count for change animation on time.
        if (keyH.upPressed == true || keyH.downPressed == true||
            keyH.leftPressed == true || keyH.rightPressed == true){
            if(keyH.upPressed){
                direction = "up";
                action = "walk";
            }else if(keyH.downPressed){
                direction = "down";
                action = "walk";
            }else if(keyH.leftPressed){
                direction = "left";
                action = "walk";
            }else if(keyH.rightPressed){
                direction = "right";
                action = "walk";
            }

            //Check tile collision
            collisionUpOn = false;
            collisionDownOn = false;
            collisionLeftOn = false;
            collisionRightOn = false;
            gPanel.collisionCheck.checkTile(this);

            int objIndex = gPanel.collisionCheck.checkObject(this, true);
            PassOBJ(objIndex);

            // if collision is false, player can move pass this tile
            if(!collisionUpOn&&!collisionDownOn&&!collisionLeftOn&&!collisionRightOn){
                switch(direction){
                    case "up" :
                        worldY -= speed;
                        break;
                    case "down" :
                        worldY += speed;
                        break;
                    case "left" :
                        worldX -= speed;
                        break;
                    case "right" : 
                        worldX += speed;
                        break;
                }
            }
            if(!collisionUpOn){
                if(direction.equals("up")){
                    worldY -= speed;
                }
            }
            if(!collisionDownOn){
                if(direction.equals("down")){
                    worldY += speed;
                }
            }
            if(!collisionLeftOn){
                if(direction.equals("left")){
                    worldX -= speed;
                }
            }
            if(!collisionRightOn){
                if(direction.equals("right")){
                    worldX += speed;
                }
            }

            spriteCounter++;
            if (spriteCounter > 15){
                if (spriteNum == 1){
                    spriteNum = 2;
                }else if (spriteNum == 2){
                    spriteNum = 3;
                }else if (spriteNum == 3){
                    spriteNum = 4;
                }else if (spriteNum ==4){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }else{
            // if there's no keys insert then player action will change to stand until new action come in
            action = "stand";
            if(direction.equals("up")){
                direction = "right";
            }
            //Check tile collision
            collisionUpOn = false;
            collisionDownOn = false;
            collisionLeftOn = false;
            collisionRightOn = false;
            gPanel.collisionCheck.checkTile(this);

            int objIndex = gPanel.collisionCheck.checkObject(this, true);
            PassOBJ(objIndex);

            spriteCounter++;
            if (spriteCounter > 30){
                if (spriteNum == 1){
                    spriteNum = 2;
                }else if (spriteNum == 2){
                    spriteNum = 3;
                }else if (spriteNum == 3){
                    spriteNum = 4;
                }else if (spriteNum ==4){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
    }
    public void PassOBJ(int index){
        if(index != 999){
            switch(gPanel.obj[index].name){
                case "IncreasePower" :
                    System.out.println("This is "+gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum]);
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "+1"){
                        Power += 1;
                    }
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "+2"){
                        Power += 2;
                    }
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "+3"){
                        Power += 3;
                    }
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "+5"){
                        Power += 5;
                    }
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "x2"){
                        Power = Power*2;
                    }
                    if(gPanel.aSetter.InPowerElement[gPanel.aSetter.randomInNum] == "x3"){
                        Power = Power*3;
                    }
                    gPanel.obj[index] = null;
                    break;
                case "DecreasePower" :
                    System.out.println("This is "+gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum]);
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "-1"){
                        if(Power >= 1){
                            Power -= 1;
                        }else{
                            Power = 0;
                        }
                    }
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "-2"){
                        if(Power >= 2){
                            Power -= 2;
                        }else{
                            Power = 0;
                        }
                    }
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "-3"){
                        if(Power >= 3){
                            Power -= 3;
                        }else{
                            Power = 0;
                        }
                    }
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "-5"){
                        if(Power >= 5){
                            Power -= 5;
                        }else{
                            Power = 0;
                        }
                    }
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "/2"){
                        if(Power >= 2){
                            Power = Power/2;
                        }else{
                            Power = 0;
                        }
                    }
                    if(gPanel.aSetter.DePowerElement[gPanel.aSetter.randomDeNum] == "/3"){
                        if(Power >= 3){
                            Power = Power/3;
                        }else{
                            Power = 0;
                        }
                    }
                    gPanel.obj[index] = null;
                    break;
            }
            
        }
    }
    public void draw(Graphics2D g2){
        BufferedImage image = null;
        
        if(action.equals("stand")){
            switch (direction){
            case "down" :
                if (spriteNum == 1){
                    image = downstand1;
                }
                if (spriteNum == 2){
                    image = downstand2;
                }
                if (spriteNum == 3){
                    image = downstand3;
                }
                if (spriteNum == 4){
                    image = downstand4;
                }
                break;
            case "right" :
                if (spriteNum == 1){
                    image = rightstand1;
                }
                if (spriteNum == 2){
                    image = rightstand2;
                }
                if (spriteNum == 3){
                    image = rightstand3;
                }
                if (spriteNum == 4){
                    image = rightstand4;
                }
                break;
            case "left" :
                if (spriteNum == 1){
                    image = leftstand1;
                }
                if (spriteNum == 2){
                    image = leftstand2;
                }
                if (spriteNum == 3){
                    image = leftstand3;
                }
                if (spriteNum == 4){
                    image = leftstand4;
                }
                break;
                }
        }else if(action.equals("walk")){
            switch(direction){
            case "up" :
                if (spriteNum == 1){
                    image = upwalk1;
                }
                if (spriteNum == 2){
                    image = upwalk2;
                }
                if (spriteNum == 3){
                    image = upwalk3;
                }
                if (spriteNum == 4){
                    image = upwalk4;
                }
                break;
            case "down" :
                if (spriteNum == 1){
                    image = downwalk1;
                }
                if (spriteNum == 2){
                    image = downwalk2;
                }
                if (spriteNum == 3){
                    image = downwalk3;
                }
                if (spriteNum == 4){
                    image = downwalk4;
                }
                break;
            case "left" :
                if (spriteNum == 1){
                    image = leftwalk1;
                }
                if (spriteNum == 2){
                    image = leftwalk2;
                }
                if (spriteNum == 3){
                    image = leftwalk3;
                }
                if (spriteNum == 4){
                    image = leftwalk4;
                }
                break;
            case "right" :
                if (spriteNum == 1){
                    image = rightwalk1;
                }
                if (spriteNum == 2){
                    image = rightwalk2;
                }
                if (spriteNum == 3){
                    image = rightwalk3;
                }
                if (spriteNum == 4){
                    image = rightwalk4;
                }
                break;
            }
            
        }
        int x = screenX;
        int y = screenY;
        if(screenX > worldX){
            x = worldX;
        }
        if(screenY > worldY){
            y = worldY;
        }
        int rightOffset = gPanel.ScreenWidth - screenX;
            if(rightOffset > gPanel.worldWidth - worldX){
                x = gPanel.ScreenWidth - (gPanel.worldWidth - worldX);
            }
            
        int bottomOffset = gPanel.ScreenHeight - screenY;
            if(bottomOffset > gPanel.worldHeight - worldY){
                y = gPanel.ScreenHeight - (gPanel.worldHeight - worldY);
            }
        g2.drawImage(image, x, y, gPanel.tileSize, gPanel.tileSize, null);
        //check hitblock
        //g2.drawRect(x+12, y+15, 24, 21);
    }
    public void endGame(){
        gPanel.ui.gameFinished = true;
        //gp.stopMusic();

    }
}