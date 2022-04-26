package main;

import java.io.File;
import java.io.IOException;

import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.text.DecimalFormat;

public class UI {
    GamePanel gp;
    Font pixelFont;
    Graphics2D g2;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;
    public int commandNum = 0;

    public double playTime;
    BufferedImage image,BGImage,StartButton,StartButton_C,EXITButton,EXITButton_C;
    
    int min;
    DecimalFormat dFormat = new DecimalFormat("#0.00");
    DecimalFormat dFormat2 = new DecimalFormat("#00");

    public UI(GamePanel gp){
        this.gp = gp;
    }
    public void getFont(){
        try {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File ("/res/Font/DigitalDisco-Thin.ttf")).deriveFont(30F);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File ("/res/Font/DigitalDisco-Thin.ttf")));
        } catch (IOException | FontFormatException e) {

        }
    }
    public void showMessage(String text){
        message = text;
        messageOn = true;
    }
    public void showMessageCenter (Graphics2D g2,String text){
            int x = getXforCenteredText(text);
            int y = gp.ScreenHeight/2;
            
            g2.drawString(text, x, y);
    }
    public int getXforCenteredText (String text){
        int textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.ScreenWidth/2 - textLength/2;
        return x;
    }
    public void draw(Graphics2D g2){
        this.g2 = g2;
        g2.setFont(pixelFont);
        g2.setColor(Color.white);
        //Title screen
        if(gp.gameState == gp.titleState){
            drawTitleScreen();
        }
        if(gp.gameState == gp.playState){
            //playstate
        }
        if(gp.gameState == gp.pauseState){
            drawPauseScreen();
        }

        if(gameFinished){
            showMessageCenter(g2, "Congratulations!");
            showMessageCenter(g2, "The end!");
            showMessageCenter(g2, "Your play time is "+min+"."+dFormat2.format(playTime)+" min");

            gp.gameThread = null;

        }else{
            if(gp.gameState == gp.playState){
                g2.setColor(Color.white);
                g2.setFont(g2.getFont().deriveFont(Font.PLAIN,20F));
                g2.drawString("Power : "+gp.player.Power,25,gp.tileSize*2);
                playTime += (double)1/60;

                g2.setColor(Color.white);
                g2.setFont(g2.getFont().deriveFont(Font.PLAIN,15F));
                //TIME 
                if (playTime > 60){
                    min += 1;
                    playTime -= 60;
                }
                if (min == 0){
                    g2.drawString("Time : "+dFormat.format(playTime)+" sec", gp.tileSize*13, gp.tileSize*10);
                }else{
                    g2.drawString("Time : "+min+"."+dFormat2.format(playTime)+" min", gp.tileSize*13, gp.tileSize*10);
            }
            
            }
            


            if(messageOn){
                g2.setFont(g2.getFont().deriveFont(Font.PLAIN,20F));
                g2.drawString(message, gp.tileSize/2, gp.tileSize*5);
                messageCounter++;
                if(messageCounter > 120){
                    messageOn = false;
                    messageCounter = 0;
                }
            }

        }
        

    }
    public void drawPauseScreen(){
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,80F));
        g2.setColor(Color.black);
        String text = "PAUSED";
        showMessageCenter(g2, text);
    }
    public void drawTitleScreen(){
        int x = 0;
        int y = 0;
        //Background
        try{
            BGImage = ImageIO.read(getClass().getResourceAsStream("/res/BG/Start-BG-withoutButton.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost BG image");
        }
        g2.drawImage(BGImage, 0, 0, gp.ScreenWidth, gp.ScreenHeight, null);

        //Menu
        //StartButton
        try{
            StartButton = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-start.png"));
            StartButton_C = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-startclick.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost Start-Button image");
        }
        x = gp.ScreenWidth/2;
        g2.drawImage(StartButton, 278, 248, 175, 60, null);
        if(commandNum == 0){
            g2.drawImage(StartButton_C, 278, 248, 175, 60, null);
            
        }
        //EXITButton
        try{
            EXITButton = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-exit.png"));
            EXITButton_C = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-exitclick.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost EXIT-Button image");
        }
        g2.drawImage(EXITButton, 278, 342, 175, 60, null);
        if(commandNum == 1){
            g2.drawImage(EXITButton_C, 278, 342, 175, 60, null);
            
        }

    }
}
