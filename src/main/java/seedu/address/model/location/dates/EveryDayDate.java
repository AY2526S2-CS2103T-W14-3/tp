package seedu.address.model.location.dates;

/**
 * Represents a {@code VisitDate} that occurs every day
 */
public class EveryDayDate extends VisitDate {
    /**
     * Constructs a {@code VisitDate}.
     *
     * @param visitDate A valid visit date string in YYYY-MM-DD format.
     */
    public EveryDayDate(String visitDate) {
        super(visitDate);
    }
}
