package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderSAO extends JFrame {
    private JPanel panel1;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public FoodOrderSAO() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orders();
            }
        });
    }

    public void orders() {
        try {
            double currT = 0;
            double res = 0;
            boolean dump = false;

            if (cPizza.isSelected()) {
                currT += 100;
                dump = true;
            }
            if (cBurger.isSelected()) {
                currT += 80;
                dump = true;
            }
            if (cFries.isSelected()) {
                currT += 65;
                dump = true;
            }
            if (cSoftDrinks.isSelected()) {
                currT += 55;
                dump = true;
            }
            if (cTea.isSelected()) {
                currT += 50;
                dump = true;
            }
            if (cSundae.isSelected()) {
                currT += 40;
                dump = true;
            }
            if (rbNone.isSelected()) {
                currT = currT;
                dump = true;
            }
            if (rb5.isSelected()) {
                res = currT * 0.05;
                currT = currT - res;
                dump = true;
            }
            if (rb10.isSelected()) {
                res = currT * 0.10;
                currT = currT - res;
                dump = true;
            }
            if (rb15.isSelected()) {
                res = currT * 0.15;
                currT = currT - res;
                dump = true;
            }

            if(dump == false) {throw new Exception("Invalid"); }
            JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", currT));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        FoodOrderSAO app = new FoodOrderSAO();
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}