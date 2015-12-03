
/**
 * MVC-like model class representing a named person.
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * Construct a Person with the supplied names
     * @param firstName First name of the person
     * @param lastName Last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the person
     * @return first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the person
     * @return last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the full name of the person (first name + last name)
     * @return full name of the person
     */
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    /**
     * Sets the first name of the person.
     * @param firstName first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the person.
     * @param lastName last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
