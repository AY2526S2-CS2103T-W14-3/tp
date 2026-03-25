package seedu.address.model.location.dates;

/**
 * Represents a {@code VisitDate} that occurs only once
 */
public class OneTimeDate extends VisitDate {
    /**
     * Constructs a {@code VisitDate}.
     *
     * @param visitDate A valid visit date string in YYYY-MM-DD format.
     */
    public OneTimeDate(String visitDate) {
        super(visitDate);
    }
}
