package sample.Controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Utils {

    Label WelcomeMessageLabel; // used labels
    Label UnluckyErrorMessage;
    Label ErrorLabel;

    public Utils(Label WelcomeMessageLabel,Label UnluckyErrorMessage,Label ErrorLabel ) {
        this.WelcomeMessageLabel = WelcomeMessageLabel;
        this.UnluckyErrorMessage = UnluckyErrorMessage;
        this.ErrorLabel = ErrorLabel;
    }

    public boolean validateInput(String s){
        try{
            Float.parseFloat(s); // if the string can be parsed to float
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getInputError(String s) {
        try {
            Float.parseFloat(s);
            return "Valid Input";
        } catch (Exception e) { // returns details about exceptions
            String errorMessage = "Exception ➔ " + e.getClass().getSimpleName() + "\nDescription ➔ " + e.getMessage();
            System.out.println(errorMessage); // print error details in console
            return errorMessage;
        }
    }

    public void resetStyles(TextField field){
        field.getStyleClass().clear(); // resets styles for the text fields,
        field.getStyleClass().addAll("text-field", "text-input");
    }

    public void setValidStyles(Label label) {// sets the styles for the valid result label
        label.setStyle("-fx-border-color: #abebc6; -fx-border-width: 2; -fx-border-radius: 5; -fx-text-fill: #abebc6");
    }

    public void setInvalidStyles(Label label) { // sets the styles for the invalid result label
        label.setStyle("-fx-border-color: #e74c3c; -fx-border-width: 2; -fx-border-radius: 5; -fx-text-fill: #e74c3c");
    }

    public void setInvalidLabelsVisibility() { // in case that is a error with some of the input fields
        this.WelcomeMessageLabel.setVisible(true); // still display the welcome label
        this.UnluckyErrorMessage.setVisible(false); // hide custom exception label
        this.ErrorLabel.setVisible(true); // display the main exception label
    }
}
