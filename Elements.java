

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Elements {

    double x, y;
    int width, height;


  
    public Elements(double x, double y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }



    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.fillRect(((int) (x)), (int) (y), width, height);
        

    }


}