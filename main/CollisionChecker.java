package main;

import entity.Entity;

public class CollisionChecker {

    GamePanel gPanel;

    public CollisionChecker(GamePanel gPanel){
        this.gPanel = gPanel;
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
            entityTopRow = (entityTopWorldY - entity.upspeed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            break;
        case "down" :
            entityTopRow = (entityTopWorldY - entity.upspeed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityBottomRow = (entityBottomWorldY + entity.speed)/gPanel.tileSize;
            entityTopRow = entityTopWorldY/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityBottomRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionDownOn = true;
            }
            break;
        case "left" :
            entityTopRow = (entityTopWorldY - entity.upspeed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityLeftCol = (entityLeftWorldX - entity.speed)/gPanel.tileSize;
            entityTopRow = entityTopWorldY/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityLeftCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionLeftOn = true;
            }
            break;
        case "right" :
            entityTopRow = (entityTopWorldY - entity.upspeed)/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityLeftCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionUpOn = true;
            }
            entityRightCol = (entityRightWorldX + entity.speed)/gPanel.tileSize;
            entityTopRow = entityTopWorldY/gPanel.tileSize;
            tileNum1 = gPanel.tileM.mapTileNum[entityRightCol][entityTopRow];
            tileNum2 = gPanel.tileM.mapTileNum[entityRightCol][entityBottomRow];
            if(gPanel.tileM.tile[tileNum1].collision == true || gPanel.tileM.tile[tileNum2].collision == true){
                entity.collisionRightOn = true;
            }
            break;
        }
    }
    public int checkObject(Entity entity, boolean player){
        int index = 999;
        for (int i=0; i<gPanel.obj.length;i++){
            if(gPanel.obj[i] != null){
                entity.solidArea.x = entity.worldX + entity.solidArea.x;
                entity.solidArea.y = entity.worldY + entity.solidArea.y;

                gPanel.obj[i].solidArea.x = gPanel.obj[i].worldX + gPanel.obj[i].solidArea.x;
                gPanel.obj[i].solidArea.y = gPanel.obj[i].worldY + gPanel.obj[i].solidArea.y;
                switch(entity.direction){
                case "up" :
                    entity.solidArea.y -= entity.speed;
                    if(entity.solidArea.intersects(gPanel.obj[i].solidArea)){
                        if(player){
                            index = i;
                        }
                    }
                    break;
                case "down" :
                    entity.solidArea.y += entity.speed;
                    if(entity.solidArea.intersects(gPanel.obj[i].solidArea)){
                        if(player){
                            index = i;
                        }
                    }
                    break;
                case "left" :
                    entity.solidArea.x -= entity.speed;
                    if(entity.solidArea.intersects(gPanel.obj[i].solidArea)){
                        if(player){
                            index = i;
                        }
                    }
                    break;
                case "right" :
                    entity.solidArea.x += entity.speed;
                    if(entity.solidArea.intersects(gPanel.obj[i].solidArea)){
                        if(player){
                            index = i;
                        }
                    }
                    break;
                }
                entity.solidArea.x = entity.solidAreaDefaultX;
                entity.solidArea.y = entity.solidAreaDefaultY;
                gPanel.obj[i].solidArea.x = gPanel.obj[i].solidAreaDefaultX;
                gPanel.obj[i].solidArea.y = gPanel.obj[i].solidAreaDefaultY;
            }
        }
        return index;
    }
    
}
