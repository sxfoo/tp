package seedu.duke.command;
import seedu.duke.exceptions.InvalidGpaException;
import seedu.duke.parser.GradeCommandMetadata;


public class DesiredGpaCommand extends Command{
    public final float desiredGPA;

    public DesiredGpaCommand(float desiredGPA) {
        this.desiredGPA = desiredGPA;
    }

    @Override
    public void execute(String userInput) {
        try {
            GradeCommandMetadata.validateGPA(desiredGPA);
            moduleList.calcGradesExpectations(desiredGPA);
        } catch (InvalidGpaException e) {
            System.out.println(e.getMessage());
        }
    }
}
