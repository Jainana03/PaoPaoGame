package main;

import object.OBJ;

public class AssetSetter {
    GamePanel gPanel;

    public AssetSetter(GamePanel gPanel){
        this.gPanel = gPanel;
    }

    public void setObject(){
        gPanel.obj[0] = new OBJ(gPanel);
        gPanel.obj[0].worldX = 14 * gPanel.tileSize;
        gPanel.obj[0].worldY = 39 * gPanel.tileSize;
    }
    
}
