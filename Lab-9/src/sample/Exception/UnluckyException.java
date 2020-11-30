package sample.Exception;

public class UnluckyException extends Exception {
    public UnluckyException() {
        super("Super Unlucky Exception, 13 is a unlucky number! \uD83D\uDC80");
    }

    public UnluckyException(String message) {
        super(message);
    } // for a custom message
}
