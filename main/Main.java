package main;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //I cannot edit arghhhhhh
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("PaoPao Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
    
}
