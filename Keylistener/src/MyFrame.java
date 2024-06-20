import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;


    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label=new JLabel();
        icon = new ImageIcon("src/rocket.png");


        label.setBounds(0,0,500,200);
        label.setIcon(icon);
       // label.setBackground(Color.RED);
       // label.setOpaque(true);
        this.getContentPane().setBackground(Color.BLACK);



        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's': label.setLocation(label.getX()+10,label.getY());
                break;
            case 'd': label.setLocation(label.getX(),label.getY()+10);
                break;

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("you released: "+ e.getKeyChar());
        System.out.println("you released a keycode "+ e.getKeyCode());

    }
}
