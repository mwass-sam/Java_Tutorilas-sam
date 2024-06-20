import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JRadioButton pizaaButton;
    JRadioButton humbaga;
    JRadioButton hotdog;


    myFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);


        pizaaButton = new JRadioButton("pizza");
        pizaaButton.setBounds(20,20,100, 100);
        pizaaButton.addActionListener(this);

       humbaga = new JRadioButton("humbaga");
        humbaga.setBounds(110,20, 100,100);
        humbaga.addActionListener(this);

        hotdog = new JRadioButton("hotdog");
        hotdog.setBounds(220,20,100,100);
        hotdog.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(hotdog);
        group.add(humbaga);
        group.add(pizaaButton);



        this.add(pizaaButton);
        this.add(hotdog);
        this.add(humbaga);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==hotdog){
            System.out.println("you ordered hot dog");
        } else if (e.getSource()==humbaga) {
            System.out.println("this is humbaga");

        } else if (e.getSource()==pizaaButton) {
            System.out.println("this piza");

        }

    }



}
