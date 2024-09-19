import javax.swing.*;
import java.awt.*;

public class paint extends JPanel {
    protected void paintComponent(Graphics page) {
        super.paintComponent(page);

        final int maxSize = 300;
        final int pageWidth = 600;
        final int pageHeight = 400;
        int x = 200;
        int y = 150;
        int width = 100;
        int height = 70;


        setBackground(Color.yellow);
        page.setColor (Color.blue);

        page.fillRect(x,y,width, height);
    }
    public static void main (String[] args) {
        JFrame frame = new JFrame("Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new paint());
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

}



