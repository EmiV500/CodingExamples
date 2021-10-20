import java.awt.*;
public class Circle {
    public static DrawingPanel panel = new DrawingPanel(500, 500);
    public static Graphics g = panel.getGraphics();
    private static int xpos = 25, ypos = 25, radius = 50;


    public static void drawCircle() {
        g.fillOval(xpos, ypos, radius, radius);
    }

    public static void setRadius(int newRadius) {
        radius = newRadius;
    }

    public static int getRadius() {
        return radius;
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