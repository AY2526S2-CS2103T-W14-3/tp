package seedu.address.model.location.dates;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import java.time.DayOfWeek;
import java.time.LocalDate;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.parser.DateParser;

/**
 * Represents a Location's visit date in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidVisitDate(String)}
 */
public abstract class VisitDate {

    public static final String MESSAGE_CONSTRAINTS = DateParser.MESSAGE_WRONG_DATE_FORMAT;

    /**
     * Factory method for creating VisitDates from a string
     */
    public static VisitDate of(String dateString) {
        requireNonNull(dateString);
        if (isValidVisitDate(dateString)) {

        }
        return null;
    }

    /**
     * Returns true if a given string is a valid visit date.
     */
    public static boolean isValidVisitDate(String test) {
        requireNonNull(test);
        try {
            DateParser.parseDate(test);
            return true;
        } catch (IllegalValueException e) {
            return false;
        }
    }

    public abstract boolean isOn(LocalDate date);

    public abstract String toDataString();
}
