package ui;

import java.awt.*;

public interface Buttons {
    public abstract void loadImgs();
    public abstract void draw (Graphics g);
    public abstract void update();
    public abstract void initBound();
    public abstract Rectangle getBounds();
}
