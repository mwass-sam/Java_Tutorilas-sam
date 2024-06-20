import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

   private static JLabel userLabel;
    private static JLabel password;
    private static JLabel success;
   private static JTextField textField;
   private  static JPasswordField passwordField;
   private static JButton button;


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20,80, 20);
        panel.add(userLabel);

        textField = new JTextField();
        textField.setBounds(100, 20, 90, 20);
        panel.add(textField);

        password = new JLabel("password");
        password.setBounds(10, 50,80,20);
        panel.add(password);

         passwordField = new JPasswordField();
        passwordField.setBounds(100,50,90, 20);
        panel.add(passwordField);


         button = new JButton("Login");
        button.setBounds(40,100,80, 30);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel();
        success.setBounds(40,130,100,30);
        panel.add(success);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = textField.getText();
        String password = passwordField.getText();


        if (user.equals("samwel") && password.equals("sam")){
            success.setText("welcome sam");

        } else {
            success.setText("wrong password");
        }



    }
}
