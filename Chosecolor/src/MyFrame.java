import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("pick a color");
        button.addActionListener(this);

        label= new JLabel();
        label.setBackground(Color.GREEN);
        label.setText("this is my name");
        label.setFont(new Font("MV Boli",Font.BOLD,70));
        label.setOpaque(true);


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"pick a color i guess", Color.BLACK);
           // label.setForeground(color);
            label.setBackground(color);


        }

    }
}
