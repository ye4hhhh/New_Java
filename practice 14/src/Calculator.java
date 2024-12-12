import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame {
    JTextField number1Field = new JTextField(10);
    JTextField number2Field = new JTextField(10);
    JButton addButton = new JButton("Сложить");
    JButton subtractButton = new JButton("Вычесть");
    JButton multiplyButton = new JButton("Умножить");
    JButton divideButton = new JButton("Разделить");

    Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Первое число:"));
        add(number1Field);
        add(new JLabel("Второе число:"));
        add(number2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        addButton.addActionListener(e -> performOperation("Сложить"));
        subtractButton.addActionListener(e -> performOperation("Вычесть"));
        multiplyButton.addActionListener(e -> performOperation("Умножить"));
        divideButton.addActionListener(e -> performOperation("Разделить"));

        setVisible(true);
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(number1Field.getText().trim());
            double num2 = Double.parseDouble(number2Field.getText().trim());
            double result = 0;

            switch (operation) {
                case "Cложить":
                    result = num1 + num2;
                    break;
                case "Вычесть":
                    result = num1 - num2;
                    break;
                case "Умножить":
                    result = num1 * num2;
                    break;
                case "Разделить":
                    if (num2 == 0) {
                        throw new ArithmeticException("Нельзя делить на ноль!");
                    }
                    result = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "Результат = " + result, "Ответ", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Нужно вводить только цифры", "Ошибка!", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Ошибка!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}