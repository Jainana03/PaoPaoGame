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
                    gPanel.gameState = gPanel.HowToPlayState;
                }
                else if(gPanel.ui.commandNum == 1){
                    System.exit(0);
                }
            }

        }
        if(gPanel.gameState == gPanel.HowToPlayState ){
            if(code == KeyEvent.VK_SPACE){
                gPanel.gameState = gPanel.playState;
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

        //Loading State
        else if(gPanel.gameState == gPanel.loadingState){
            if(code == KeyEvent.VK_SPACE){
                gPanel.gameState = gPanel.playState;
                gPanel.ui.stagelevel += 1;
                gPanel.ui.score = 0;
                gPanel.ui.playTime = 0;
                gPanel.ui.min = 0;
            }
            if(code == KeyEvent.VK_ESCAPE){
                gPanel.gameState = gPanel.titleState;
                gPanel.ui.stagelevel += 1;
                gPanel.ui.score = 0;
                gPanel.ui.playTime = 0;
                gPanel.ui.min = 0;
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
