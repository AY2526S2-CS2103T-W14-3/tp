package seedu.address.model.location.dates;

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
        super(visitDate);
    }
}
