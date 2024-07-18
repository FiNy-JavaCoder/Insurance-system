package SystemOfInsureds.models.exceptions;

public class InsuredNotFoundException extends RuntimeException {
    public InsuredNotFoundException(long insuredId) {
        super("Pojištěnec s ID " + insuredId + " nenalezen");
    }
}