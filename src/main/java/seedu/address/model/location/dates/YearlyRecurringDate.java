package seedu.address.model.location.dates;

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
        super(visitDate);
    }
}
