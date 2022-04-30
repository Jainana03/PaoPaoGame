package main;

import entity.Player;
import object.SuperObject;
import tile.TileManager;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable {
    int weird = 0;

    //screen settings
    //1 tile in originaltilesize(16x16 pixels) is too small in computer screen. then, increase all tile scale to 3
    final int originalTileSize = 16; //16x16 pixels
    final int scale = 3;

    //final size on the screen is 16x12 tiles : 768x576 pixels
    public final int tileSize = originalTileSize * scale; // 48x48 pixels
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int ScreenWidth = maxScreenCol * tileSize; // 768 pixels
    public final int ScreenHeight = maxScreenRow * tileSize; // 576 pixels

    //world settings
    //maxWorldCol and maxWorldRow use for 50x50 tiles map. if you change map, you should change these border to new one.
    public final int maxWorldCol = 20;
    public final int maxWorldRow = 50;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;

    // FPS
    int FPS = 60;
    long lastTimeDraw = 0;

    // SYSTEM
    public TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler(this);
    public CollisionChecker collisionCheck = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public UI ui = new UI(this);
    Thread gameThread;

    //ENTITY AND OBJECT
    public Player player = new Player(this,keyH);
    public SuperObject obj[] = new SuperObject[10];

    //GAME STATE : Play, Pause and Title
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int optionState = 3;
    
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    public void setupGame(){
         aSetter.setObject();
        //playMusic(0);
        gameState = titleState;
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        long drawCount = 0;

        while(gameThread != null){
            //currentTime = System.nanoTime();

            //delta += (currentTime - lastTime) / drawInterval;
            //timer += (currentTime - lastTime);
            //lastTime = System.nanoTime();

            /*if(delta >= 1){
                //Update : update game information
                update();
    
                //Draw : draw the screen with the update information
                repaint();

                delta--;
                drawCount++;
            }*/
            if(System.nanoTime() - lastTime >= drawInterval) {
                //Update : update game information
                update();
    
                //Draw : draw the screen with the update information
                repaint();

                //delta--;
                drawCount++;
                lastTime = System.nanoTime();
            }
            if(System.currentTimeMillis() - lastTimeDraw >= 1000){
                if(gameState == titleState){
                    drawCount = 0;
                }else{
                    System.out.println("FPS : "+drawCount);
                    drawCount = 0;
                }
                lastTimeDraw = System.currentTimeMillis();
            }
            

        }
    }
    // call update method from Player to redraw player animation from 1-4 up to spritenumber.
    public void update(){
        if(gameState == playState){
            player.update();
        }
        if(gameState == pauseState){
            //nothing
        }
        
    }
    //draw
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;
        //Title Screen
        if(gameState == titleState){
            ui.draw(g2D);

        }else{
            //draw tiles
            tileM.draw(g2D);

            //OBJECT(No object now)
            
            for(int i=0;i<obj.length;i++){
                if(obj[i]!=null){
                    obj[i].draw(g2D , this);
                }
            }

            //draw player
            player.draw(g2D);

            //UI
            ui.draw(g2D);

        }

        

        g2D.dispose();
    }

}
