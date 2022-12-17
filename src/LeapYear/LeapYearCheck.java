package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearCheck extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearCheck() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yearCheck();
            }
        });
    }

    private void yearCheck() {
        double yearInput = Double.parseDouble(tfYear.getText());
        boolean leap;

        try {
            if (tfYear.getText().equals("")) {
                throw new IllegalArgumentException("Empty String!");
            }
            if (yearInput < 0) {
                throw new IllegalArgumentException("Input is invalid!");
            }

            if (yearInput % 4 == 0) {
                if (yearInput % 100 == 0) {
                    leap = yearInput % 400 == 0;
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }

            if (leap) {
                JOptionPane.showMessageDialog(panel1, "This is a Leap Year");
            } else {
                JOptionPane.showMessageDialog(panel1, "This is not a Leap Year");
            }
            tfYear.setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
        }
    }

    public static void main(String[] args) {
        LeapYearCheck app = new LeapYearCheck();
        app.setContentPane(app.panel1);
        app.setSize(350, 350);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}