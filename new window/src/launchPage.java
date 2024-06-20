import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchPage implements ActionListener  {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("new window");

    launchPage() {

        myButton.setFocusable(false);
        myButton.setBounds(100,160,200,40);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(myButton);


    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==myButton){
            frame.dispose();
            newWindow myWindow = new newWindow();

        }

    }
}
