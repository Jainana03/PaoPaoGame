package main;

import entity.Entity;

public class CollisionChecker {

    GamePanel gPanel;

    public CollisionChecker(GamePanel gp){
        this.gPanel = gp;
    }
    public void checkTile(Entity entity){
        int entityLeftWorldX = entity.worldX + entity.solidArea.x;
        int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY = entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        int entityLeftCol = entityLeftWorldX/gPanel.tileSize;
        int entityRightCol = entityRightWorldX/gPanel.tileSize;
        int entityTopRow = entityTopWorldY/gPanel.tileSize;
        int entityBottomRow = entityBottomWorldY/gPanel.tileSize;

        int tileNum1, tileNum2;

        switch(entity.direction){
        case "up" :
            entityTopRow = (entityTopWorldY - entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            break;
        case "down" :
            entityTopRow = (entityTopWorldY - entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityBottomRow = (entityBottomWorldY + entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityBottomRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionDownOn = true;
            }
            break;
        case "left" :
            entityTopRow = (entityTopWorldY - entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityLeftCol = (entityLeftWorldX - entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityLeftCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionLeftOn = true;
            }
            break;
        case "right" :
            entityTopRow = (entityTopWorldY - entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityRightCol = (entityRightWorldX + entity.speed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionRightOn = true;
            }
            break;
        }
    }
    
}
