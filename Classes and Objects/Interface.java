import java.awt.*;

public class Interface {
    
    public static void main(String[] args) {
        Circle one = new Circle();
        one.setColor(Color.BLUE);
        one.setRadius(100);
        one.drawCircle();

        Circle two = new Circle();
        two.setYPos(250);
        two.setRadius(30);
        two.setColor(Color.green);
        two.drawCircle();
        two.setXPos(200);
        two.setYPos(400);
        two.setRadius(40);
        two.drawCircle();

        Rectangle three = new Rectangle(253, 382, 50, 50);
        three.setColor(Color.pink);
        three.drawRectangle();


    }
}
