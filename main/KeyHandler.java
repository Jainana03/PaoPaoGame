package main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    GamePanel gPanel;

    public KeyHandler(GamePanel gPanel){
        this.gPanel = gPanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        //Title State
        if(gPanel.gameState == gPanel.titleState){
            if(code == KeyEvent.VK_W){
                gPanel.ui.commandNum--;
                if(gPanel.ui.commandNum < 0){
                    gPanel.ui.commandNum = 1;
                }
            }
            if(code == KeyEvent.VK_S){
                gPanel.ui.commandNum++;
                if(gPanel.ui.commandNum > 1){
                    gPanel.ui.commandNum = 0;
                }
            }
            if(code == KeyEvent.VK_ENTER){
                if(gPanel.ui.commandNum == 0){
                    gPanel.gameState = gPanel.playState;
                }
                else if(gPanel.ui.commandNum == 1){
                    System.exit(0);
                }
            }

        }

        //Play State
        if(gPanel.gameState == gPanel.playState){
            if(code == KeyEvent.VK_W){
                upPressed = true;
            }
            if(code == KeyEvent.VK_S){
                downPressed = true;
            }
            if(code == KeyEvent.VK_A){
                leftPressed = true;
            }
            if(code == KeyEvent.VK_D){
                rightPressed = true;
            }
            if(code == KeyEvent.VK_P){
                gPanel.gameState = gPanel.pauseState;
            }
            if(code == KeyEvent.VK_ESCAPE){
                gPanel.gameState = gPanel.optionState;
            }
        }
        //Pause State
        else if(gPanel.gameState == gPanel.pauseState){
            if(code == KeyEvent.VK_P){
                gPanel.gameState = gPanel.playState;
            }
            if(code == KeyEvent.VK_ESCAPE){
                gPanel.gameState = gPanel.optionState;
            }
        }

        //Option State
        else if(gPanel.gameState == gPanel.optionState){
            if(code == KeyEvent.VK_ESCAPE){
                gPanel.gameState = gPanel.playState;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;
        }
        if(code == KeyEvent.VK_S){
            downPressed = false;
        }
        if(code == KeyEvent.VK_A){
            leftPressed = false;
        }
        if(code == KeyEvent.VK_D){
            rightPressed = false;
        }
        
    }
    
}
