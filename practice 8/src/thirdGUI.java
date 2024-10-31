import javax.swing.*;
import java.awt.*;

public class thirdGUI extends JFrame {

    public thirdGUI() {
        setTitle("Images");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        JLabel imageLabel1 = new JLabel(new ImageIcon("C:/Users/aa3os/Desktop/cat1.png"));
        JLabel caption1 = new JLabel("кошка 1", JLabel.CENTER);
        panel1.setLayout(new BorderLayout());
        panel1.add(imageLabel1, BorderLayout.CENTER);
        panel1.add(caption1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        JLabel imageLabel2 = new JLabel(new ImageIcon("C:/Users/aa3os/Desktop/cat2.jpeg"));
        JLabel caption2 = new JLabel("кошка 2", JLabel.CENTER);
        panel2.setLayout(new BorderLayout());
        panel2.add(imageLabel2, BorderLayout.CENTER);
        panel2.add(caption2, BorderLayout.SOUTH);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new thirdGUI();
    }
}