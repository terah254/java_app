// PetSelectionApp.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelectionApp {
    private static JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Pet Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton fishButton = new JRadioButton("Fish");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");

        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(dogButton);
        petGroup.add(catButton);
        petGroup.add(birdButton);
        petGroup.add(fishButton);
        petGroup.add(rabbitButton);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPet = ((AbstractButton) e.getSource()).getText();
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet, "Pet Selection", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        dogButton.addActionListener(listener);
        catButton.addActionListener(listener);
        birdButton.addActionListener(listener);
        fishButton.addActionListener(listener);
        rabbitButton.addActionListener(listener);

        panel.add(dogButton);
        panel.add(catButton);
        panel.add(birdButton);
        panel.add(fishButton);
        panel.add(rabbitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
