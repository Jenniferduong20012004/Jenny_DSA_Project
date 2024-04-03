package Main;
import Gamestates.Gamestates;

public class Game implements Runnable{
    private static Game gameInstance = null;
    private GamePanel gamePanel;
    private GameWindow gameWindow;
    private Gamestates state;
    private Game(){
        gamePanel = new GamePanel(this);
        gameWindow = new GameWindow(gamePanel);
        gamePanel.setFocusable (true);
        gamePanel.requestFocus();
    }
    public static Game getGame(){
        if (gameInstance ==null){
            gameInstance = new Game();
        }
        return gameInstance;
    }
    @Override
    public void run() {

    }

    public void windowFocusLost() {
    }
}
