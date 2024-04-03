package Main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;


public class GameWindow extends JFrame {
    public GameWindow (GamePanel gamePanel){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(gamePanel);
        setResizable(false);
        pack();
        setVisible(true);
        addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();
            }

            @Override
            public void windowLostFocus(WindowEvent e) {

            }
        });

    }

}
