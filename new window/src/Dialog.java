import javax.swing.*;

public class Dialog {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "this is a useless information", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is a useless information", "title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is a useless information", "title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is a useless information", "title",JOptionPane.INFORMATION_MESSAGE);

         //JOptionPane.showMessageDialog(null, "this is a useless information", "title", JOptionPane.ERROR_MESSAGE);

         //JOptionPane.showConfirmDialog(null, "bro do you code", "this is me",JOptionPane.YES_NO_CANCEL_OPTION);

         //String name = JOptionPane.showInputDialog("what is your name?: ");
        //System.out.println("hello "  + name);

        JOptionPane.showOptionDialog(null, "you are awesome", "this is option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null, null,0);

        }
}
