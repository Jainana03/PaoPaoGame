package main;

import java.io.File;
import java.io.IOException;

import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Color;

import java.text.DecimalFormat;

public class UI {
    GamePanel gp;
    Font pixelFont;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;

    double playTime;
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
            int textLength;
            int x;
            int y;

            textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.ScreenWidth/2 - textLength/2;
            y = gp.ScreenHeight/2 - (gp.tileSize*3);
            g2.drawString(text, x, y);
    }
    public void draw(Graphics2D g2){
        if(gameFinished){
            g2.setFont(pixelFont);
            g2.setColor(Color.white);

            showMessageCenter(g2, "Congratulations!");
            showMessageCenter(g2, "The end!");
            showMessageCenter(g2, "Your play time is "+min+"."+dFormat2.format(playTime)+" min");

            gp.gameThread = null;

        }else{
            g2.setFont(pixelFont);
            g2.setColor(Color.white);
            g2.drawString("HP : "+gp.player.HP,25,gp.tileSize*1);
            g2.drawString("ATK : "+gp.player.Attack,25,gp.tileSize*2);

            //TIME
            playTime += (double)1/60;
            if (playTime > 60){
                min += 1;
                playTime -= 60;
            }
            if (min == 0){
                g2.drawString("Time : "+dFormat.format(playTime)+" sec", gp.tileSize*13, gp.tileSize*11);
            }else{
                g2.drawString("Time : "+min+"."+dFormat2.format(playTime)+" min", gp.tileSize*13, gp.tileSize*11);
            }
            


            if(messageOn){
                g2.setFont(pixelFont.deriveFont(30F));
                g2.drawString(message, gp.tileSize/2, gp.tileSize*5);
                messageCounter++;
                if(messageCounter > 120){
                    messageOn = false;
                    messageCounter = 0;
                }
            }

        }
        

    }
}
