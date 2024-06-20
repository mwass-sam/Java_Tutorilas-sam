import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class myFrame extends JFrame implements ActionListener {

    JButton button;

myFrame(){
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //this.setSize(200,200);
    this.setLayout(new FlowLayout());

     button= new JButton("select  file");
    button.addActionListener(this);
    button.setFocusable(false);


    this.pack();
    this.add(button);
    this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==button){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
       //int response = fileChooser.showOpenDialog(null);
        int response = fileChooser.showSaveDialog(null);

       if (response==JFileChooser.APPROVE_OPTION){
           File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
           System.out.println(file);
       }
    }

    }

}



