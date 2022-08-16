import javax.swing.*;

public class A9 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"What is your name? ");
        System.out.println(name);
        JOptionPane.showMessageDialog(null,"Hello");
        JOptionPane.showMessageDialog(null,name);
    }
}
