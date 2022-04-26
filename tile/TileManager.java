package tile;

import main.GamePanel;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];

    public TileManager(GamePanel gp){

        this.gp = gp;

        tile = new Tile[10];
        mapTileNum = new int [gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("/res/maps/world-1.txt");
    }
    public void getTileImage(){
        try {
            // plain grass(grass-0)
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass-0.png"));

            //big grass
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass-1.png"));
            
            //medium grass
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass-2.png"));

            //small grass
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass-3.png"));

            //sand
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/Sand.png"));

            //water
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-1.png"));
            tile[5].collision = true;

            //tree
            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/tree-1.png"));
            tile[6].collision = true;
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR : lost tiles file");
        }
    }
    public void loadMap(String filepath){
        try {
            InputStream is = getClass().getResourceAsStream(filepath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while(col < gp.maxWorldCol && row < gp.maxWorldRow){
                String line = br.readLine();

                while(col < gp.maxWorldCol){
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col == gp.maxWorldCol){
                    col = 0;
                    row++;
                }
            }
            br.close();
            
        } catch (Exception e) {
            System.out.println("ERROR : Can't load map file");
        }
    }
    
    public void draw(Graphics2D g2){

        int worldCol = 0;
        int worldRow = 0;

        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow){

            int tileNum = mapTileNum[worldCol][worldRow];

            //worldX and worldY for player position in world map
            //screenX and screenY for player position on the screen
            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            //Stop camera at the edge
            if(gp.player.screenX > gp.player.worldX){
                screenX = worldX;
            }
            if(gp.player.screenY > gp.player.worldY){
                screenY = worldY;
            }
            int rightOffset = gp.ScreenWidth - gp.player.screenX;
            if(rightOffset > gp.worldWidth - gp.player.worldX){
                screenX = gp.ScreenWidth - (gp.worldWidth - worldX);
            }
            int bottomOffset = gp.ScreenHeight - gp.player.screenY;
            if(bottomOffset > gp.worldHeight - gp.player.worldY){
                screenY = gp.ScreenHeight - (gp.worldHeight - worldY);
            }

            //draw map only tiles that player can see on the screen
            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY){
                    g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
                }
            else if(gp.player.screenX > gp.player.worldX ||
            gp.player.screenY > gp.player.worldY ||
            rightOffset > gp.worldWidth - gp.player.worldX ||
            bottomOffset > gp.worldHeight - gp.player.worldY){
                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }
            
            worldCol++;

            if(worldCol == gp.maxWorldCol){
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
