package Rectangle;

import java.util.HashMap;
import java.awt.Color;

public class RectFactory {

    //HashMap that will store rect's created
    private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();

    //Create rect or retrieve rect from rectsByColor takes the color of the rect to be returned as an argument
    public static MyRect getRect(Color color) {

        MyRect rect = (MyRect)rectsByColor.get(color);

        if(rect == null) {

            rect = new MyRect(color);

            rectsByColor.put(color, rect);
        }

        return rect;

    }
    
}
