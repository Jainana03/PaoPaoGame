package main;
import java.awt.Rectangle;

public class EventHandler {
    GamePanel gPanel;
    Rectangle eventRect;
    int eventRectDefaultX, eventRectDefaultY;
    public EventHandler(GamePanel gPanel){
        this.gPanel = gPanel;
        eventRect = new Rectangle();
        eventRect.x = 2;
        eventRect.y = 2;
        eventRect.width = 44;
        eventRect.height = 44;
        eventRectDefaultX = eventRect.x;
        eventRectDefaultY = eventRect.y;
    }
    public void checkEvent(){
        for(int i=0;i<=19;i++){
            if(hit(i, 0, "up")||hit(i, 0, "down")||hit(i, 0, "left")||hit(i, 0, "right")){
                teleport(gPanel.gameState);
            }
        }
        

    }
    public boolean hit(int eventCol, int eventRow, String reqDirection){
        boolean hit = false;
        gPanel.player.solidArea.x = gPanel.player.worldX + gPanel.player.solidArea.x;
        gPanel.player.solidArea.y = gPanel.player.worldY + gPanel.player.solidArea.y;
        eventRect.x = eventCol*gPanel.tileSize + eventRect.x;
        eventRect.y = eventRow*gPanel.tileSize + eventRect.y;

        if(gPanel.player.solidArea.intersects(eventRect)){
            if(gPanel.player.direction.contentEquals(reqDirection)|| reqDirection.contentEquals("any")){
                hit = true;
            }
        }
        gPanel.player.solidArea.x = gPanel.player.solidAreaDefaultX;
        gPanel.player.solidArea.y = gPanel.player.solidAreaDefaultY;
        eventRect.x = eventRectDefaultX;
        eventRect.y = eventRectDefaultY;

        return hit;
    }
    public void teleport(int gameState){
        gPanel.gameState = gPanel.titleState;

    }
}
