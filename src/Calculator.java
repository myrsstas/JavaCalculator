//Application development in popular integrated development environments © 2023 by Myrsini Stasinou is licensed under CC BY 4.0
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField tfFirstNumber;
    private JTextField tfSecondNumber;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JPanel calculatorPanel;
    private JTextField tfResult;

    public Calculator() {
        setContentPane(calculatorPanel);
        setSize(350, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText());
                tfResult.setText(String.valueOf(firstNumber + secondNumber));

            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText());
                tfResult.setText(String.valueOf(firstNumber - secondNumber));


            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText());
                tfResult.setText(String.valueOf(firstNumber * secondNumber));


            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText());

                if (secondNumber!= 0.0) {
                    tfResult.setText(String.valueOf(firstNumber / secondNumber));

                } else {
                    tfResult.setText("Undefined");

                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }

}
