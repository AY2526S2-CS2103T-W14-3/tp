package seedu.address.logic.parser;

import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.Assert.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.PlanCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class PlanCommandParserTest {
    private final PlanCommandParser parser = new PlanCommandParser();

    @Test
    public void parse_emptyArgs_returnsPlanCommandWithNullDate() throws Exception {

        String userInput = "   ";
        PlanCommand expectedCommand = new PlanCommand(null);
        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_validDate_returnsPlanCommandWithDate() throws Exception {
        LocalDate expectedDate = LocalDate.of(2025, 3, 15);

        String userInput = "15/3/25";
        PlanCommand expectedCommand = new PlanCommand(expectedDate);
        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_invalidDate_throwsParseException() {
        assertThrows(ParseException.class, () -> {
            parser.parse("plan invalid-date");
        });
    }
}
