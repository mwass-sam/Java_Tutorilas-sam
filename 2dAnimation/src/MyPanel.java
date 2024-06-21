import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image  enemy;
    Image backgroundimage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.WHITE);
        enemy = new ImageIcon("src/img_1.png").getImage();
        backgroundimage = new ImageIcon("src/img_2.png").getImage();
        timer = new Timer(10, this);
        timer.start();


    }
public  void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundimage,0, 0,null);
    g2D.drawImage(enemy,x, y,null);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>=PANEL_WIDTH-enemy.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x +xVelocity;

        if (y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y +yVelocity;
        repaint();

    }
}
