package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;

    public Player(GamePanel gp,KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.ScreenWidth/2 - (gp.tileSize/2);
        screenY = gp.ScreenHeight/2 - (gp.tileSize/2);
        
        //Player hit block is 24x21 pixels and start at (12,15)
        solidArea = new Rectangle();
        solidArea.x = 12;
        solidArea.y = 15;
        solidArea.width = 24;
        solidArea.height = 21;

        setDefaultValues();
        getPlayerImage();
    }
    // start player's position, speed, direction and action
    public void setDefaultValues (){
        worldX = gp.tileSize*24;
        worldY = gp.tileSize*24;
        Power = 2;
        speed = 4;
        direction = "right";
        action = "stand";
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
        //spriteNum use to change player animation and spriteCounter use to count for change animation on time.
        if (keyH.upPressed == true || keyH.downPressed == true||
            keyH.leftPressed == true || keyH.rightPressed == true){
            if(keyH.upPressed == true){
                direction = "up";
                action = "walk";
            }else if(keyH.downPressed == true){
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
            collisionOn = false;
            gp.collisionCheck.checkTile(this);

            // if collision is false, player can move pass this tile
            if(!collisionOn){
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
                direction = "down";
            }
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
        int rightOffset = gp.ScreenWidth - screenX;
            if(rightOffset > gp.worldWidth - worldX){
                x = gp.ScreenWidth - (gp.worldWidth - worldX);
            }
            
        int bottomOffset = gp.ScreenHeight - screenY;
            if(bottomOffset > gp.worldHeight - worldY){
                y = gp.ScreenHeight - (gp.worldHeight - worldY);
            }
        
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
    public void endGame(){
        gp.ui.gameFinished = true;
        //gp.stopMusic();

    }
}