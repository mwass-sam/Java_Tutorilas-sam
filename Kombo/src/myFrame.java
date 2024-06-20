import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JComboBox combobox;

    myFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        String[] animals = {"dog","cat","birds"};

       combobox = new JComboBox(animals);
       combobox.addActionListener(this);
       //combobox.setEditable(true);
        //System.out.println(combobox.getItemCount());
        //combobox.addItem("cows");
        //combobox.insertItemAt("pig",0);
        //combobox.setSelectedIndex(0);
        //combobox.removeItem("pig");
        //combobox.removeItemAt(1);
       // combobox.removeAllItems();




        this.pack();
        this.add(combobox);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==combobox){
            //System.out.println(combobox.getSelectedItem());
            System.out.println(combobox.getSelectedIndex());

        }


    }
}
