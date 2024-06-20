import javax.swing.*;
import java.awt.*;

public class Pane {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setBounds(50,50,200, 200);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(100,100,200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLACK);
        label2.setBounds(150,150,200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label);
        layeredPane.add(label1);
        layeredPane.add(label2);

        JFrame frame =new JFrame();
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(layeredPane);
    }
}
