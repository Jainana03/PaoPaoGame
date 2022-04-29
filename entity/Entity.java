package entity;

import java.awt.image.BufferedImage;
import java.awt.Rectangle;

public class Entity {

    //player position in world map
    public int worldX,worldY;

    //player default status:
    public int speed;
    public int Power;

    // action pao stand
    public BufferedImage downstand1,downstand2,downstand3,downstand4,
                        leftstand1,leftstand2,leftstand3,leftstand4,
                        rightstand1,rightstand2,rightstand3,rightstand4;

    // action pao walk
    public BufferedImage upwalk1,upwalk2,upwalk3,upwalk4,
                        downwalk1,downwalk2,downwalk3,downwalk4,
                        leftwalk1,leftwalk2,leftwalk3,leftwalk4,
                        rightwalk1,rightwalk2,rightwalk3,rightwalk4;

    //Nomjib
    public BufferedImage NJstand1,NJstand2;
    public String direction;
    public String action;
    public int spriteCounter = 0;
    public int spriteNum = 1;

    //player collision
    public Rectangle solidArea;
    //check collision if collisionOn is true, Player can't go
    public boolean collisionUpOn = false;
    public boolean collisionDownOn = false;
    public boolean collisionLeftOn = false;
    public boolean collisionRightOn = false;
    
}
