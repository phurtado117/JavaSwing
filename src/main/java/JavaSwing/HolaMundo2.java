package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HolaMundo2 extends JPanel {
    private JLabel label;
    private JButton button;

    public HolaMundo2() {
        label = new JLabel("Hola mundo");
        button = new JButton("Click");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has clickeado el botón");
            }
        });

        setSize(250, 100);
        setLayout(new FlowLayout());
        add(label);
        add(button);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 100);
        frame.getContentPane().add(new HolaMundo2());
        frame.setVisible(true);
    }
}