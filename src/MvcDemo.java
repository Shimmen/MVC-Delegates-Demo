import javax.swing.*;

/**
 * Entry point class for MVC-Demo application.
 */
public class MvcDemo {

    public static void main(String[] args) {

        // Create model
        Person johnDoe = new Person("John", "Doe");

        // Create controller and hand it the relevant model(s)
        PersonRenameController personRenameController = new PersonRenameController(johnDoe);

        // Create view and hand it some kind of delegate/data-source that can supply the view
        RenameView renameView = new RenameView(personRenameController);

        // Create window and add view to window
        JFrame frame = new JFrame("MVC-Demo");
        frame.add(renameView);

        // Etc. window handling
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
