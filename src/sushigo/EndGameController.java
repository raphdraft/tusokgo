/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sushigo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EndGameController implements Initializable {
    @FXML private Label winner;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML public void getWinners(String a){
        winner.setText(a+" has won!");
    }
    @FXML private void goStart(ActionEvent event) throws IOException{
        changeScene("Start", event);
    }
    @FXML public void changeScene(String fxml, ActionEvent event) throws IOException{
        Button anyButton = (Button)event.getSource();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml+".fxml"));
        anyButton.getScene().setRoot(loader.load());
    }
}
