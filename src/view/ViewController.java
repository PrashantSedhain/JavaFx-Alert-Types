package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class ViewController {
	
	
    @FXML
    void warningButtonClicked(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.WARNING);
    	alert.setTitle("Title of Warning");
    	alert.setContentText("This is the place where you include the context of your warning. ");
    	alert.showAndWait();
    	
    }

    @FXML
    void alertButtonClicked(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Title of Error");
    	alert.setContentText("This is the place where you include the context of your alert. ");
    	alert.showAndWait();
    	

    }

    @FXML
    void informationButtonClicked(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Title of Information");
    	alert.setContentText("This is the place where you include the context of your information alert. ");
    	alert.showAndWait();

    }
    
    @FXML
    void  ConfirmationButtonClicked(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Title of Confirmation");
    	alert.setContentText("This is the place where you include the context of your confirmation. ");
    	alert.showAndWait();

    }
    
    
    /*For the NONE alert type, closing the dialog box is different. You would need to manually add a OK button just like
     in the code below. */
    @FXML
    void  NoneButtonClicked(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.NONE);
    	alert.setTitle("Title of Alert");
       	alert.setContentText("This is the place where you include the context of your none alert type. ");
       	alert.getDialogPane().getButtonTypes().add(ButtonType.OK);
    	alert.showAndWait();

    }


}
