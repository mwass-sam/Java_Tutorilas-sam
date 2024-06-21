import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image = new ImageIcon("src/img.png").getImage();
        this.setPreferredSize(new Dimension(500,500));

    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0,0, null);
        g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0,0,500,500);

       // g2d.setPaint(Color.green);
       // g2d.drawRect(0,0,100,100);

       // g2d.fillRect(0,0,100,100);

        //g2d.setPaint(Color.ORANGE);
        //g2d.drawOval(0,0,100,100);
       // g2d.fillOval(0,0,100,100);

        //g2d.drawArc(0,0,100,100,0,160);
       // g2d.setPaint(Color.RED);
       // g2d.fillArc(0,0,100,100,0,160);

       int[] xPoints = {150,250,350};
       int[] yPoints = {300,150,300};
       g2d.setPaint(Color.green);
        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("you are the winner", 50, 50);



    }
}
