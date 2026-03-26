package seedu.address.model.location.dates;

import java.time.LocalDate;

/**
 * Represents a {@code VisitDate} that occurs once a week on a specific day
 */
public class WeeklyRecurringDate extends VisitDate {
    /**
     * Constructs a {@code VisitDate}.
     *
     * @param visitDate A valid visit date string in YYYY-MM-DD format.
     */
    public WeeklyRecurringDate(String visitDate) {

    }

    @Override
    public boolean isOn(LocalDate date) {
        return false;
    }

//    @Override
//    public String toString() {
//        return date.toString();
//    }
//
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
