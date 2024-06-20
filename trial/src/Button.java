import javax.swing.*;
import java.awt.event.ActionListener;

public class Button extends JFrame{

    Button(){
        JButton button =new JButton();
        button.setBounds(50,50,100,60);
        button.setText("samwel");
        button.setFocusable(false);

        this.setSize(300,300);this.setTitle("this is my Gui");
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(button);

    }


}
