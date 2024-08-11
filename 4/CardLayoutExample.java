import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    private JPanel mainPanel;
    private CardLayout cardLayout;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardLayoutExample::new);
    }
    
    public CardLayoutExample() {
        // Create the main frame
        JFrame frame = new JFrame("OS Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the main panel with CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add the first card: OS Categories
        mainPanel.add(createCategoryPanel(), "Categories");

        // Add the second card: Desktop OS Options
        mainPanel.add(createDesktopOSPanel(), "Desktop");

        // Add the third card: Mobile OS Options
        mainPanel.add(createMobileOSPanel(), "Mobile");

        // Set the main panel as the content pane of the frame
        frame.setContentPane(mainPanel);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    private JPanel createCategoryPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2, 10, 10));
        JButton desktopButton = new JButton("Desktop OS");
        JButton mobileButton = new JButton("Mobile OS");

        // Action listeners for navigating to specific OS selection panels
        desktopButton.addActionListener(e -> cardLayout.show(mainPanel, "Desktop"));
        mobileButton.addActionListener(e -> cardLayout.show(mainPanel, "Mobile"));

        panel.add(desktopButton);
        panel.add(mobileButton);

        return panel;
    }

    private JPanel createDesktopOSPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Select a Desktop OS", JLabel.CENTER);
        String[] desktopOS = {"Windows", "macOS", "Linux"};
        JComboBox<String> comboBox = new JComboBox<>(desktopOS);
        
        // Add Back button to navigate back to Categories
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Categories"));

        panel.add(label, BorderLayout.NORTH);
        panel.add(comboBox, BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createMobileOSPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Select a Mobile OS", JLabel.CENTER);
        String[] mobileOS = {"Android", "iOS", "Windows Phone"};
        JComboBox<String> comboBox = new JComboBox<>(mobileOS);
        
        // Add Back button to navigate back to Categories
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Categories"));

        panel.add(label, BorderLayout.NORTH);
        panel.add(comboBox, BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);

        return panel;
    }
}
