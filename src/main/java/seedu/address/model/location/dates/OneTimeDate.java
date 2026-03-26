package seedu.address.model.location.dates;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.parser.DateParser;

import java.time.LocalDate;
import java.util.Date;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a {@code VisitDate} that occurs only once
 */
public class OneTimeDate extends VisitDate {

    public static final String MESSAGE_CONSTRAINTS = DateParser.MESSAGE_WRONG_DATE_FORMAT;

    private final LocalDate date;

    /**
     * Constructs a {@code VisitDate}.
     *
     * @param visitDate A valid localdate object
     */
    public OneTimeDate(LocalDate visitDate) {
        requireNonNull(visitDate);
        this.date = visitDate;
    }

    /**
     * Constructs a {@code VisitDate}.
     *
     * @param dateString A valid visit date string in YYYY-MM-DD format.
     */
    public OneTimeDate(String dateString) {
        requireNonNull(dateString);
        checkArgument(isValidVisitDate(dateString), VisitDate.MESSAGE_CONSTRAINTS);
        try {
            this.date = DateParser.parse(dateString);
        } catch (IllegalValueException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isOn(LocalDate date) {
        return this.date.equals(date);
    }

    @Override
    public String toString() {
        return DateParser.dateToPrettyString(date);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof OneTimeDate)) {
            return false;
        }

        OneTimeDate otherDate = (OneTimeDate) other;
        return date.equals(otherDate.date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
