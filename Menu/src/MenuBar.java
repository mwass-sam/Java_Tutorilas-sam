import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MenuBar() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("src/load.png");
        saveIcon = new ImageIcon("src/file.jpeg");
        exitIcon = new ImageIcon("src/exit.jpeg");



        menuBar = new JMenuBar();
        fileMenu = new JMenu("file");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");

        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");


        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        loadItem.setPreferredSize(new Dimension(50, 50));
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        fileMenu.setMnemonic(KeyEvent.VK_F); //alt + F
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + E
        helpMenu.setMnemonic(KeyEvent.VK_H);// alt + H
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_X);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        this.setJMenuBar(menuBar);
        //this.add(menuBar);

        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == saveItem) {
            System.out.println("file is saved");
        }
        if (e.getSource() == loadItem) {
            System.out.println("you loaded a file");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);

        }
    }
}

