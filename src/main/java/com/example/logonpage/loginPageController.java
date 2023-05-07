package com.example.logonpage;


import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class loginPageController {
    public Text text_pass;
    public Text text_pass1;
    public Label logon_error;
    public TextField username;
    public PasswordField passoword;
    public Button button_login;
    public Button button_Registr;
    public CheckBox remember;

    public void Clear(ActionEvent actionEvent) {
        text_pass.setText("");
        text_pass1.setText("");
        logon_error.setText("");
        username.setText("");
        passoword.setText("");
        passoword.setStyle("-fx-background-radius: 20");
        username.setStyle("-fx-background-radius: 20");
    }

    public void changeText(ActionEvent actionEvent) {
        Stage register = new Stage();
        VBox registerPage = new VBox(new Label("Welcome to Register page"), new Label("This is register page......"));
        Scene registerScene = new Scene(registerPage, 662, 551);
        register.setTitle("Registration page");
        register.setScene(registerScene);
        register.show();
    }
    public void button_login(ActionEvent actionEvent) {
        .3

}

