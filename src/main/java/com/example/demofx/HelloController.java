package com.example.demofx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button loginButton;
    @FXML
    private Label loginErrorMSGField;
    @FXML
    private ImageView logoImageView;
    @FXML
    private ImageView closeScreenImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logoFile = new File("IMG/Screenshot.png");
        Image logoImage = new Image(logoFile.toURI().toString());
        logoImageView.setImage(logoImage);

    }

        public void loginButtonOnAction(ActionEvent event){
            loginErrorMSGField.setText("Login button clicked");
        }
}