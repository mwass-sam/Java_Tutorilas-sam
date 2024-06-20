import javax.swing.*;

public class Trial {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);



        JLabel username = new JLabel("Username");
        username.setBounds(20,30, 100, 20);
        panel.add(username);
        JTextField name = new JTextField();
        name.setBounds(150,30, 100,20);
        panel.add(name);

        JLabel password = new JLabel("password");
        password.setBounds(20,50,100,20);
        panel.add(password);
        JPasswordField userPassword = new JPasswordField();
        userPassword.setBounds(150,50,100,20);
        panel.add(userPassword);
    }
}
