
/**
 * MVC-like controller handling renaming of Persons.
 */
public class PersonRenameController implements RenameViewDelegate {

    private Person person;

    /**
     * Constructs a PersonRenameController for the specified Person
     * @param person person to rename
     */
    public PersonRenameController(Person person) {
        this.person = person;
    }

    /**
     * {@inheritDoc}
     */
     public String getName() {
        return person.getFullName();
     }

    /**
     * {@inheritDoc}
     */
    public String renameButtonWasClicked(String newName) {

        // Validate new name
        String[] nameTokens = newName.split(" ");
        if (nameTokens.length != 2) {
            return "There must be exactly two names (first and last) separated with one space.";
        } else {
            // Set new name
            person.setFirstName(nameTokens[0]);
            person.setLastName(nameTokens[1]);
        }

        // Name successfully set: return null
        return null;
    }

}
