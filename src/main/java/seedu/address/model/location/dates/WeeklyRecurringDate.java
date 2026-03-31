package seedu.address.model.location.dates;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.parser.DateParser;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a {@code VisitDate} that occurs once a week on a specific day
 */
public class WeeklyRecurringDate extends VisitDate {

    public static final String MESSAGE_CONSTRAINTS = DateParser.MESSAGE_WRONG_DATE_FORMAT;

    private final DayOfWeek day;

    /**
     * Constructs a {@code WeeklyRecurringDate}.
     * @param dow A valid DayOfWeek
     */
    public WeeklyRecurringDate(DayOfWeek dow) {
        requireNonNull(dow);
        this.day = dow;
    }

    /**
     * Constructs a {@code WeeklyRecurringDate}. TODO
     * @param dateString A valid visit date string representing a Day of the week
     */
    public WeeklyRecurringDate(String dateString) {
        requireNonNull(dateString);
        //checkArgument(isValidVisitDate(dateString), MESSAGE_CONSTRAINTS);
        try {
            this.day = DateParser.parseDate(dateString).getDayOfWeek();
        } catch (IllegalValueException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isOn(LocalDate date) {
        return false;
    }

    @Override
    public String toDataString() {
        return "r-" + day.toString();
    }

    @Override
    public String toString() {
        return "Every " + day.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof WeeklyRecurringDate)) {
            return false;
        }

        WeeklyRecurringDate otherDate = (WeeklyRecurringDate) other;
        return this.day.equals(otherDate.day);
    }

    @Override
    public int hashCode() {
        return day.hashCode();
    }
}
