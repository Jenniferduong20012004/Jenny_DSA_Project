package Main;

import javax.swing.*;

public class GamePanel extends JPanel {
    private Game game;
    public GamePanel (Game game){
        this.game = game;
    }
    public Game getGame(){
        return game;
    }
}
