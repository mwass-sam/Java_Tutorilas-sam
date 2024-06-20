import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("this is my Gui");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("sam.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(123,245,243));
        frame.setVisible(true);
        frame.setLayout(null);


        Border border = BorderFactory.createLineBorder(Color.green,3);

        ImageIcon image = new ImageIcon("sam.png");
        JLabel label = new JLabel();
        label.setText("am samwel");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(234,45,24));
        label.setFont(new Font("Mv Boli", Font.ITALIC,23));
        label.setIconTextGap(18);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250);

        frame.add(label);




    }
}
