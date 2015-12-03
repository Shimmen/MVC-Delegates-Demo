import javax.swing.*;
import java.awt.*;

/**
 * MVC-like view showing an end-user interface for renaming stuff
 */
public class RenameView extends JPanel {

    private RenameViewDelegate delegate;

    private JLabel currentNameLabel = new JLabel();
    private JTextField newNameInputField = new JTextField();
    private JButton renameButton = new JButton("Rename");

    /**
     * Constructs a new RenameView with the supplied delegate
     * @param delegate delegate to handle events etc.
     */
    public RenameView(RenameViewDelegate delegate) {
        this.delegate = delegate;
        updateCurrentNameLabel();

        // Hande rename action
        renameButton.addActionListener((event) -> {
            String inputedName = newNameInputField.getText();
            String currentName = currentNameLabel.getText();
            if (inputedName.length() > 0 && !inputedName.equals(currentName)) {
                String errorMessage = delegate.renameButtonWasClicked(inputedName);
                if (errorMessage == null) {
                    updateCurrentNameLabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Could not rename! Reason: " + errorMessage);
                }
            }
        });

        // Layout view (it's not very pretty but it serves its purpose)
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Current name: "));
        add(currentNameLabel);
        add(new JLabel("New name: "));
        add(newNameInputField);
        add(renameButton);
    }

    private void updateCurrentNameLabel() {
        currentNameLabel.setText(delegate.getName());
    }

}
