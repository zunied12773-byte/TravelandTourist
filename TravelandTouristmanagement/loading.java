package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame {

    JLabel text;

    public Loading() {
        setBounds(500, 200, 500, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        text = new JLabel("Travel and Tour Management");
        text.setBounds(50, 20, 400, 40);
        text.setForeground(new Color(133, 193, 233));
        text.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(text);

        // Optional: Add a progress bar
        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(50, 100, 400, 30);
        progressBar.setStringPainted(true);
        add(progressBar);

        // Simulate loading
        new Thread() {
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        progressBar.setValue(i);
                        Thread.sleep(30); // Delay to simulate loading
                    }
                    setVisible(false);
                    new Login(); // Open login after loading
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new Loading();
    }
}
