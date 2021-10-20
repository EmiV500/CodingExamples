import java.awt.*;
public class Rectangle {
    public static DrawingPanel panel = new DrawingPanel(500, 500);
    public static Graphics g = panel.getGraphics();
    private static int xpos, ypos, width, length;

    public Rectangle() {
        xpos = 25;
        ypos = 25; 
        width = 50;
        length = 50;
    }

    public Rectangle(int xpos, int ypos, int width, int length) {
        this.xpos = xpos;
        this.ypos = ypos; 
        this.width = width;
        this.length = length;
    }

    public static void drawRectangle() {
        g.fillRect(xpos, ypos, width, length);
    }

    public static void setWidth(int newWidth) {
        width = newWidth;
    }

    public static int getWidth() {
        return width;
    }

    public static void setLength(int newLength) {
        length = newLength;
    }

    public static int getLength() {
        return length;
    }

    public static void setXPos(int newXPos) {
        xpos = newXPos;
    }

    public static int getXPos() {
        return xpos;
    }

    public static void setYPos(int newYPos) {
        ypos = newYPos;
    }

    public static int getYPos() {
        return ypos;
    }

    public static void setColor(Color newColor) {
        g.setColor(newColor);
    }

    public static Color getColor() {
        return g.getColor();
    } 
}
