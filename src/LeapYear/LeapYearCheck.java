package LeapYear;

import javax.swing.*;

public class LeapYearCheck extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    public static void main(String[] args) {
        LeapYearCheck app = new LeapYearCheck();
        app.setContentPane(app.panel1);
        app.setSize(350, 350);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}