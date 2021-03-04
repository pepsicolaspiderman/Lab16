import javax.swing.*;
import java.awt.*;

public class Lab16_1 extends Canvas {
    public static void main(String[] args){
        JFrame frame = new JFrame("Дом один");
        Canvas canvas = new Lab16_1();
        canvas.setSize(450,350);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawLine(150, 75, 150, 100);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);
        g.drawOval(275, 50, 150, 200);
        g.drawLine(340, 250, 340, 300);
        g.drawLine(360, 250, 360, 300);
        g.drawLine(25, 300, 425, 300);
    }
}