import javax.swing.*;

import java.awt.*;

import static java.util.Collections.fill;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    JLabel label = new JLabel();


    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,29));
        bar.setForeground(Color.red);
        bar.setBackground(Color.GREEN);

        label.setBounds(100,100,200,200);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);
        frame.add(label);
        frame.setVisible(true);

        fill();




    }

    public void fill(){
      int counter=0;
      while (counter<=100) {
          bar.setValue(counter);
          try {
              Thread.sleep(50);
          }
          catch (InterruptedException e){
              e.printStackTrace();
          }
          counter+=1;
          if (counter==100){

             label.setText("download complete!");
              bar.setString("Done !");

      }


      }
    }
}
