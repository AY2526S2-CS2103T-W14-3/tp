package seedu.address.model.location.dates;

import seedu.address.logic.parser.DateParser;

import java.time.LocalDate;

/**
 * Represents a {@code VisitDate} that occurs once a year on a specific day of a month
 */
public class YearlyRecurringDate extends VisitDate {
    /**
     * Constructs a {@code VisitDate}.
     *
     * @param visitDate A valid visit date string in YYYY-MM-DD format.
     */
    public YearlyRecurringDate(String visitDate) {
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean isOn(LocalDate date) {
        return false;
    }

//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//
//        if (!(other instanceof OneTimeDate)) {
//            return false;
//        }
//
//        OneTimeDate otherDate = (OneTimeDate) other;
//        return date.equals(otherDate.date);
//    }
//
//    @Override
//    public int hashCode() {
//        return date.hashCode();
//    }
}
