package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton addCustomer, viewCustomer, bookPackage, viewPackage, viewHotels, payment, viewBookedPackage, logout;

    Dashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Full screen
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Top panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(133, 193, 233));
        panel.setBounds(0, 0, 1600, 65);
        add(panel);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(20, 10, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBackground(new Color(0, 0, 102));
        buttonPanel.setBounds(0, 65, 300, 900);
        add(buttonPanel);

        addCustomer = createButton("Add Customer", 0);
        viewCustomer = createButton("View Customer", 60);
        bookPackage = createButton("Book Package", 120);
        viewPackage = createButton("View Package", 180);
        viewHotels = createButton("View Hotels", 240);
        payment = createButton("Payment", 300);
        viewBookedPackage = createButton("View Booked Package", 360);
        logout = createButton("Logout", 420);

        buttonPanel.add(addCustomer);
        buttonPanel.add(viewCustomer);
        buttonPanel.add(bookPackage);
        buttonPanel.add(viewPackage);
        buttonPanel.add(viewHotels);
        buttonPanel.add(payment);
        buttonPanel.add(viewBookedPackage);
        buttonPanel.add(logout);

        setVisible(true);
    }

    private JButton createButton(String text, int y) {
        JButton button = new JButton(text);
        button.setBounds(0, y, 300, 50);
        button.setBackground(new Color(133, 193, 233));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logout) {
            setVisible(false);
            new Login(); // Go back to login
        } else if (ae.getSource() == addCustomer) {
            JOptionPane.showMessageDialog(null, "Add Customer clicked");
        } else if (ae.getSource() == viewCustomer) {
            JOptionPane.showMessageDialog(null, "View Customer clicked");
        } else if (ae.getSource() == bookPackage) {
            JOptionPane.showMessageDialog(null, "Book Package clicked");
        } else if (ae.getSource() == viewPackage) {
            JOptionPane.showMessageDialog(null, "View Package clicked");
        } else if (ae.getSource() == viewHotels) {
            JOptionPane.showMessageDialog(null, "View Hotels clicked");
        } else if (ae.getSource() == payment) {
            JOptionPane.showMessageDialog(null, "Payment clicked");
        } else if (ae.getSource() == viewBookedPackage) {
            JOptionPane.showMessageDialog(null, "View Booked Package clicked");
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
