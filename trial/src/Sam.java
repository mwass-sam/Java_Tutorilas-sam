import javax.swing.*;
import java.awt.*;

public class Sam {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        JButton button = new JButton();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.GREEN);
        panel.setLayout(new FlowLayout());



        button.setText("sam");
        button.setFocusable(true);
        panel.add(new JButton("samwel"));
        panel.add(new JButton("samwel"));
        panel.add(new JButton("samwel"));
        panel.add(button);

        frame.setVisible(true);
        frame.add(panel);
    }
}
