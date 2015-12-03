
/**
 * Interface for handling callbacks from the RenameView.
 */
public interface RenameViewDelegate {

    /**
     * Called by RenameView to get the name to display. Should always return
     * the current name of whatever is renamed by the view.
     * @return name of whatever is renamed by the view
     */
    String getName();

    /**
     * Called by RenameView when the end user initiated a name change.
     * @param newName the new name specified by the end-user
     * @return null if the new name is valid; otherwise a String specifying the reason it is invalid.
     */
    String renameButtonWasClicked(String newName);

}
