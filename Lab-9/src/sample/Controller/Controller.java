package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Exception.UnluckyException;

public class Controller {

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField DivisorInput;

    @FXML
    private TextField DividerInput;

    @FXML
    private Label ResultLabel;

    @FXML
    private Label ErrorLabel;

    @FXML
    private Label UnluckyErrorMessage;

    @FXML
    private Label WelcomeMessageLabel;

    @FXML
    void initialize() throws UnluckyException {

        ErrorLabel.setVisible(false); // do not show errors labels at first render
        UnluckyErrorMessage.setVisible(false);

        // utils object with some helper functions
        Utils utils = new Utils(WelcomeMessageLabel, UnluckyErrorMessage, ErrorLabel);

        SubmitButton.setOnAction(event -> {
            // get the inputs
            String valueDivisor = DivisorInput.getText();
            String valueDivider = DividerInput.getText();

            // if both inputs are valid
            if (utils.validateInput(valueDivisor) && utils.validateInput(valueDivider)) {
                ErrorLabel.setVisible(false); // hide error label
                utils.resetStyles(DivisorInput); // reset styles for input fields (if previous was an error banner)
                utils.resetStyles(DividerInput);

                float divisor = Float.parseFloat(valueDivisor); // parse inputs to float, could be double
                float divider = Float.parseFloat(valueDivider);

                try {
                    if (divider == 13 || divider == -13) { // if divider is -13/13 -> throw my custom error
                        throw new UnluckyException();

                    } else if (divider == 0) { // when divide floats by 0, the result is infinite
                        // So I decide to throw an arithmetic exception, I think it will more correctly
                        throw new ArithmeticException("Do not divide by zero");
                    }
                    // if no errors occurs
                    WelcomeMessageLabel.setVisible(true); // show welcome banner
                    UnluckyErrorMessage.setVisible(false); // hide the banner for my custom exception

                    float result = divisor / divider; // get the result of the division
                    utils.setValidStyles(ResultLabel); // apply styles for the label with the result
                    ResultLabel.setText(String.format("%.3f", result) + " ✔"); // display the result

                } catch (UnluckyException e) { // if divider == 13 -> I will catch my custom exception
                    WelcomeMessageLabel.setVisible(false); // hide welcome label
                    UnluckyErrorMessage.setVisible(true); // display label for the custom exception
                    UnluckyErrorMessage.setText(e.getMessage()); // set label's text to the custom exception message

                    DividerInput.getStyleClass().add("error");
                    utils.setInvalidStyles(ResultLabel); // apply new styles to the result label
                    ResultLabel.setText(String.format(":(( unlucky")); // set text for result label
                    System.out.println(e.getMessage()); // print in console custom exception message

                } catch (ArithmeticException e) { // if divider == 0 -> catch arithmetic exception
                    WelcomeMessageLabel.setVisible(true);
                    UnluckyErrorMessage.setVisible(false);
                    DividerInput.getStyleClass().add("error"); // apply stiles for the divider input field
                    utils.resetStyles(DivisorInput); // delete old styles for the divisor input field
                    ErrorLabel.setVisible(true); // display error label
                    System.out.println(e); // print the exception
                    String exception = "Exception: " + e.getClass().getSimpleName(); // make the error message to be displayed
                    String description = "\nDescription: " + e.getMessage();
                    String errorMessage = "ERROR AMIGOS :(\n" + "Where ➔ Divider is ZERO\n" + exception + description;
                    ErrorLabel.setText(errorMessage); // display the error message
                    utils.setInvalidStyles(ResultLabel);
                    ResultLabel.setText("Invalid Input ✘"); // update text on result label

                }

            }

            // in both inputs are not valid
            else if (!utils.validateInput(valueDivisor) && !utils.validateInput(valueDivider)) {
                utils.setInvalidLabelsVisibility(); // hide unnecessary error labels and display the needed ones

                DivisorInput.getStyleClass().add("error"); // apply styles to the inputs
                DividerInput.getStyleClass().add("error");

                String error = utils.getInputError(valueDivisor); // get the error message
                String errorMessage = "ERROR AMIGOS :(\n" + "Where ➔ Both Field have INVALID inputs\n" + error;
                ErrorLabel.setText(errorMessage); // display error message

                utils.setInvalidStyles(ResultLabel); // apply styles to results label
                ResultLabel.setText("Invalid Input ✘");
            }

            // if divisor is not valid
            else if (!utils.validateInput(valueDivisor)) {
                utils.setInvalidLabelsVisibility();

                DivisorInput.getStyleClass().add("error");
                utils.resetStyles(DividerInput); // reset the divider styles as it contains a valid input

                String error = utils.getInputError(valueDivisor);
                String errorMessage = "ERROR AMIGOS :(\n" + "Where ➔ Divisor INVALID input\n" + error;
                ErrorLabel.setText(errorMessage);

                utils.setInvalidStyles(ResultLabel);
                ResultLabel.setText("Invalid Input ✘");

            }

            else if (!utils.validateInput(valueDivider)) {
                utils.setInvalidLabelsVisibility();

                DividerInput.getStyleClass().add("error");
                utils.resetStyles(DivisorInput); // reset the divisor styles as it contains a valid input

                String error = utils.getInputError(valueDivider);
                String errorMessage = "ERROR AMIGOS :(\n" + "Where ➔ Divider INVALID input\n" + error;
                ErrorLabel.setText(errorMessage);

                utils.setInvalidStyles(ResultLabel);
                ResultLabel.setText("Invalid Input ✘");

            }
        });
    }
}