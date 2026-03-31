package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.Optional;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.location.Name;
import seedu.address.model.location.VisitDate;

/**
 * Records a note in AddressMe (backend implementation deferred).
 */
public class NoteCommand extends Command {

    public static final String COMMAND_WORD = "note";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Records a note in AddressMe (work in progress).\n"
            + "Parameters: "
            + "n/NOTE_CONTENT "
            + "[d/DATE] "
            + "\nExample: " + COMMAND_WORD + " n/Great place d/2026-03-24";

    public static final String MESSAGE_SUCCESS = "New note recorded: %1$s";

    private final Name noteContent;
    private final Optional<VisitDate> date;

    /**
     * Creates a NoteCommand with the given note text and optional date.
     */
    public NoteCommand(Name noteContent, Optional<VisitDate> date) {
        requireNonNull(noteContent);
        requireNonNull(date);
        this.noteContent = noteContent;
        this.date = date;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        String detail = noteContent.toString();
        if (date.isPresent()) {
            detail += " (" + date.get().toString() + ")";
        }

        return new CommandResult(String.format(MESSAGE_SUCCESS, detail));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof NoteCommand)) {
            return false;
        }

        NoteCommand otherCommand = (NoteCommand) other;
        return noteContent.equals(otherCommand.noteContent)
                && date.equals(otherCommand.date);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("noteContent", noteContent)
                .add("date", date)
                .toString();
    }
}
