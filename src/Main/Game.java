package Main;

public class Game implements Runnable{
    private static Game gameInstance = null;
    private GamePanel gamePanel;
    private Game(){
        gamePanel = new GamePanel(this);
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
}
