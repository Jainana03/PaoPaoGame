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
    GamePanel gPanel;
    Font pixelFont;
    Graphics2D g2D;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;
    public int commandNum = 0;
    public double score = 0;

    public double playTime;
    BufferedImage image,BGImage,StartButton,StartButton_C,EXITButton,EXITButton_C;
    
    int min;
    DecimalFormat dFormat = new DecimalFormat("#0.00");
    DecimalFormat dFormat2 = new DecimalFormat("#00");

    public int stagelevel = 1;

    public UI(GamePanel gPanel){
        this.gPanel = gPanel;
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
            int y = gPanel.ScreenHeight/2;
            
            g2.drawString(text, x, y);
    }
    public int getXforCenteredText (String text){
        int textLength = (int)g2D.getFontMetrics().getStringBounds(text, g2D).getWidth();
        int x = gPanel.ScreenWidth/2 - textLength/2;
        return x;
    }
    public void draw(Graphics2D g2D){
        this.g2D = g2D;
        g2D.setFont(pixelFont);
        g2D.setColor(Color.white);
        //Title screen
        if(gPanel.gameState == gPanel.titleState){
            drawTitleScreen();
        }
        if(gPanel.gameState == gPanel.playState){
            //playstate
            score = 0;
            g2D.setColor(Color.white);
            g2D.setFont(g2D.getFont().deriveFont(Font.PLAIN,20F));
            g2D.drawString("Power : "+gPanel.player.Power,25,gPanel.tileSize*1);
            g2D.drawString("Stage : "+stagelevel,650,gPanel.tileSize*1);
            playTime += (double)1/60;

            g2D.setColor(Color.white);
            g2D.setFont(g2D.getFont().deriveFont(Font.PLAIN,15F));
            //TIME 
            if (playTime > 60){
                min += 1;
                playTime -= 60;
            }
            if (min == 0){
                g2D.drawString("Time : "+dFormat.format(playTime)+" sec", gPanel.tileSize*13, gPanel.tileSize*10);
            }else{
                g2D.drawString("Time : "+min+"."+dFormat2.format(playTime)+" min", gPanel.tileSize*13, gPanel.tileSize*10);
            }    
        }
        if(gPanel.gameState == gPanel.pauseState){
            drawPauseScreen();
        }
        if(gPanel.gameState == gPanel.loadingState){
            score = (gPanel.player.Power*5)-(60*min-playTime)*5;
            String text = "Your score : "+dFormat.format(score);
            showMessage(text);
            if(messageOn){
                g2D.setFont(g2D.getFont().deriveFont(Font.PLAIN,50F));
                g2D.drawString(message,getXforCenteredText(text),gPanel.ScreenHeight/2);
                messageCounter++;
                if(messageCounter > 120){
                    messageOn = false;
                    messageCounter = 0;
                    stagelevel += 1;
                    score = 0;
                }
            }
        }
    }
    public void drawPauseScreen(){
        g2D.setFont(g2D.getFont().deriveFont(Font.PLAIN,80F));
        g2D.setColor(Color.black);
        String text = "PAUSED";
        showMessageCenter(g2D, text);
    }
    public void drawLoadingScreen(){
        double score = (gPanel.player.Power*5)-(60*min-playTime)*5;
        String text = "Your score : "+dFormat.format(score);
        showMessage(text);
        if(messageOn){
            g2D.setFont(g2D.getFont().deriveFont(Font.PLAIN,50F));
            g2D.drawString(message,getXforCenteredText(text),gPanel.ScreenHeight/2);
            messageCounter++;
            if(messageCounter > 120){
                messageOn = false;
                messageCounter = 0;
                gPanel.gameState = gPanel.titleState;
            }
        }

    }
    public void drawTitleScreen(){
        //Background
        try{
            BGImage = ImageIO.read(getClass().getResourceAsStream("/res/BG/Start-BG-withoutButton.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost BG image");
        }
        g2D.drawImage(BGImage, 0, 0, gPanel.ScreenWidth, gPanel.ScreenHeight, null);

        //Menu
        //StartButton
        try{
            StartButton = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-start.png"));
            StartButton_C = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-startclick.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost Start-Button image");
        }

        g2D.drawImage(StartButton, 278, 248, 175, 60, null);
        if(commandNum == 0){
            g2D.drawImage(StartButton_C, 278, 248, 175, 60, null);
            
        }
        //EXITButton
        try{
            EXITButton = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-exit.png"));
            EXITButton_C = ImageIO.read(getClass().getResourceAsStream("/res/BG/button-exitclick.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR : lost EXIT-Button image");
        }
        g2D.drawImage(EXITButton, 278, 342, 175, 60, null);
        if(commandNum == 1){
            g2D.drawImage(EXITButton_C, 278, 342, 175, 60, null);
            
        }

    }
}
