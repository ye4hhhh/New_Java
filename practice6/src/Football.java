import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame implements ActionListener {
    private int milsc = 0;
    private int madrsc = 0;
    private JLabel result;
    private JLabel lastsc;
    private JLabel winner;

    public Football() {
        setTitle("Osipov.UIBO-01-22.Football");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.gray);
        buttonPanel.setPreferredSize(new Dimension(400, 200));
        buttonPanel.setLayout(new GridLayout(1, 2));

        JButton milanButton = new JButton("AC Milan");
        milanButton.setForeground(Color.MAGENTA);
        milanButton.setPreferredSize(new Dimension(100, 100));
        milanButton.addActionListener(this);
        buttonPanel.add(milanButton);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.setForeground(Color.RED);
        madridButton.setBackground(Color.GRAY);
        madridButton.setPreferredSize(new Dimension(100, 100));
        madridButton.addActionListener(this);
        buttonPanel.add(madridButton);

        add(buttonPanel, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));

        result = new JLabel("Result: " + milsc + " X " + madrsc, JLabel.CENTER);
        infoPanel.add(result);

        lastsc = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        infoPanel.add(lastsc);

        winner = new JLabel("Winner: DRAW", JLabel.CENTER);
        infoPanel.add(winner);

        add(infoPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent act) {
        String command = act.getActionCommand();

        if (command == "AC Milan") {
            milsc++;
            lastsc.setText("Last Scorer: AC Milan");
        } else if (command == "Real Madrid"){
            madrsc++;
            lastsc.setText("Last Scorer: Real Madrid");
        }

        result.setText("Result: " + milsc + " X " + madrsc);
        if (milsc > madrsc) {
            winner.setText("Winner: AC Milan");
        } else if (milsc < madrsc) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Football();
    }
}