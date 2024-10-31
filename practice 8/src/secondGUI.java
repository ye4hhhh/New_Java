import javax.swing.*;
import java.awt.*;

public class secondGUI extends JFrame {

    public secondGUI() {
        setTitle("Две панелями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLayout(new GridLayout(2, 1));


        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("ПЕРВАЯ панель", JLabel.CENTER);
        label1.setForeground(Color.MAGENTA);
        label1.setFont(new Font("Arial", Font.ITALIC, 22));
        panel1.add(label1);


        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("ВТОРАЯ панель", JLabel.CENTER);
        label2.setForeground(Color.BLUE);
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        panel2.add(label2);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new secondGUI();
    }
}