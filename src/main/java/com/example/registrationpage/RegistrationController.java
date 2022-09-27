package com.example.registrationpage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class RegistrationController implements Initializable {
    @FXML
    private ComboBox<String> comboclass , combogroup;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String Choose_classroom[] =
                {"202", "201", "200"};
        ObservableList<String> data = FXCollections.observableArrayList(Choose_classroom);
        comboclass.setItems(data);
        String Choose_group[] =
                {"3e", "4e", "2e"};
        ObservableList<String> data1 = FXCollections.observableArrayList(Choose_group);
        combogroup.setItems(data1);
    }
    @FXML
     Button cancelButton2, registrationButton2;
    @FXML
    TextField emailTextField , repeatpasswordTextField , passwordTextField ;
    public void cancelButton2Clicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("LOGIN PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    public void registrationButton2Clicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcomepage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("WELCOME PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        String comboBoxText = comboclass.getValue();
        System.out.println(comboBoxText);
    }}