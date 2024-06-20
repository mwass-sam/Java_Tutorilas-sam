import javax.swing.*;
import java.awt.*;

public class newWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("hello this is my new window");

    newWindow() {
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.ITALIC, 25));
        label.setBounds(10,10, 400, 40);

        frame.add(label);
        frame.setVisible(true);
    }

}