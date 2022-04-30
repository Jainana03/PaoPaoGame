package object;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import main.GamePanel;

public class SuperObject {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX,worldY;

    public void draw(Graphics2D g2D,GamePanel gPanel){
            int screenX = worldX - gPanel.player.worldX + gPanel.player.screenX;
            int screenY = worldY - gPanel.player.worldY + gPanel.player.screenY;

            //Stop camera at the edge
            if(gPanel.player.screenX > gPanel.player.worldX){
                screenX = worldX;
            }
            if(gPanel.player.screenY > gPanel.player.worldY){
                screenY = worldY;
            }
            int rightOffset = gPanel.ScreenWidth - gPanel.player.screenX;
            if(rightOffset > gPanel.worldWidth - gPanel.player.worldX){
                screenX = gPanel.ScreenWidth - (gPanel.worldWidth - worldX);
            }
            int bottomOffset = gPanel.ScreenHeight - gPanel.player.screenY;
            if(bottomOffset > gPanel.worldHeight - gPanel.player.worldY){
                screenY = gPanel.ScreenHeight - (gPanel.worldHeight - worldY);
            }


        //draw map only tiles that player can see on the screen
        if(worldX + gPanel.tileSize > gPanel.player.worldX - gPanel.player.screenX &&
                worldX - gPanel.tileSize < gPanel.player.worldX + gPanel.player.screenX &&
                worldY + gPanel.tileSize > gPanel.player.worldY - gPanel.player.screenY &&
                worldY - gPanel.tileSize < gPanel.player.worldY + gPanel.player.screenY){
                    g2D.drawImage(image, screenX, screenY, gPanel.tileSize, gPanel.tileSize, null);
                }
        else if(gPanel.player.screenX > gPanel.player.worldX ||
                gPanel.player.screenY > gPanel.player.worldY ||
                rightOffset > gPanel.worldWidth - gPanel.player.worldX ||
                bottomOffset > gPanel.worldHeight - gPanel.player.worldY){
                g2D.drawImage(image, screenX, screenY, gPanel.tileSize, gPanel.tileSize, null);
        }

    }
}