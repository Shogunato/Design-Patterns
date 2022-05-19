package Rectangle;

import java.awt.Color;
import java.awt.Graphics;

//Complementary class for a more "realistic" code
public class MyRect {
    
    private Color color;

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int x2, int y2) {
        g.setColor(color);
        g.fillRect(x, y, x2,  y2);
    }

}
