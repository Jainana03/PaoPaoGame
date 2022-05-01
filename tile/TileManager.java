package tile;

import main.GamePanel;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import javax.imageio.ImageIO;

import java.awt.Graphics2D;

import java.util.Random;

public class TileManager {
    GamePanel gPanel;
    public Tile[] tile;
    public int mapTileNum[][];
    Random random = new Random();
    public int[] mapNum = {1,2,3,4,5,6,7,8,9,10};
    public int randomMapsNum = random.nextInt(10);
    int lastMapsNum = 11;


    public TileManager(GamePanel gp){

        this.gPanel = gp;

        tile = new Tile[40];
        mapTileNum = new int [gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("/res/maps/map-1.txt");
        
        if(mapNum[randomMapsNum] != lastMapsNum){
            lastMapsNum = mapNum[randomMapsNum];
            randomMapsNum = 0;
            System.out.println("map random number : "+randomMapsNum);
            System.out.println("This is map-"+mapNum[randomMapsNum]);
            String filepath = "/res/maps/map-"+mapNum[randomMapsNum]+".txt";
            loadMap(filepath);
        }else{
            randomMapsNum = random.nextInt(10);
        }
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

            //wood
            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/wood-1.png"));

            //water-grass up
            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassup.png"));
            tile[8].collision = true;

            //water-grass down
            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassdown.png"));
            tile[9].collision = true;

            //water-grass left 
            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassleft.png"));
            tile[10].collision = true;

            //water-grass right
            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassright.png"));
            tile[11].collision = true;
            
            //water-sand up
            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandup.png"));

            //water-sand down
            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanddown.png"));

            //water-sand left
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandleft.png"));

            //water-sand right
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandright.png"));
            
            //water-grass up left
            //water-grass up left
            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassupleft.png"));
            tile[16].collision = true;

            //water-grass up right
            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassupright.png"));
            tile[17].collision = true;

            //water-grass down left
            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassdownleft.png"));
            tile[18].collision = true;

            //water-grass down right
            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassdownright.png"));
            tile[19].collision = true;

            //water-grass up left corner
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassupleftcorner.png"));
            tile[20].collision = true;

            //water-grass up right corner
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassuprightcorner.png"));
            tile[21].collision = true;

            //water-grass down left corner
            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassdownleftcorner.png"));
            tile[22].collision = true;

            //water-grass down right corner
            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-grassdownrightcorner.png"));
            tile[23].collision = true;

            //water-sand up left
            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandupleft.png"));

            //water-sand up right
            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandupright.png"));

            //water-sand down left
            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanddownleft.png"));

            //water-sand down right
            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanddownright.png"));

            //water-sand up left corner
            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sandupleftcorner.png"));

            //water-sand up right corner
            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanduprightcorner.png"));

            //water-sand down left corner
            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanddownleftcorner.png"));

            //water-sand down right corner
            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water-sanddownrightcorner.png"));

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

            while(col < gPanel.maxWorldCol && row < gPanel.maxWorldRow){
                String line = br.readLine();

                while(col < gPanel.maxWorldCol){
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col == gPanel.maxWorldCol){
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

        while(worldCol < gPanel.maxWorldCol && worldRow < gPanel.maxWorldRow){

            int tileNum = mapTileNum[worldCol][worldRow];

            //worldX and worldY for player position in world map
            //screenX and screenY for player position on the screen
            int worldX = worldCol * gPanel.tileSize;
            int worldY = worldRow * gPanel.tileSize;
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
                    g2.drawImage(tile[tileNum].image, screenX, screenY, gPanel.tileSize, gPanel.tileSize, null);
                }
            else if(gPanel.player.screenX > gPanel.player.worldX ||
            gPanel.player.screenY > gPanel.player.worldY ||
            rightOffset > gPanel.worldWidth - gPanel.player.worldX ||
            bottomOffset > gPanel.worldHeight - gPanel.player.worldY){
                g2.drawImage(tile[tileNum].image, screenX, screenY, gPanel.tileSize, gPanel.tileSize, null);
            }
            
            worldCol++;

            if(worldCol == gPanel.maxWorldCol){
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
