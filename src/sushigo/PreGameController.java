package sushigo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PreGameController implements Initializable {
    public ArrayList<Player> players = new ArrayList();
    @FXML private TextField enterPlayer1;
    @FXML private TextField enterPlayer2;
    @FXML private TextField enterPlayer3;
    @FXML private TextField enterPlayer4;
    @FXML private TextField enterPlayer5;
    @FXML private TextField field;
    @FXML private Button addPlayer3;
    @FXML private Button addPlayer4;
    @FXML private Button addPlayer5;
    @FXML private Button removePlayer3;
    @FXML private Button removePlayer4;
    @FXML private Button removePlayer5;
    public String[] pnames;
    public int numOfPlayers = 2;
    
    public String[] hey = new String[3];
    public int picno = 1;
    @FXML private Label outpot;
    @FXML private ImageView imagee;
    
    @Override public void initialize(URL url, ResourceBundle rb) {
    }
    
    @FXML private void printOutput(){
        System.out.println(field.getText());
        outpot.setText(field.getText());
    }
    @FXML private void nextpic(){
        int hallo = picno%3;
        hey[0]= "file:src/images/Marian1.jpeg";
        hey[1]= "file:src/images/Marian2.jpeg";
        hey[2]= "file:src/images/Marian3.jpg";
        imagee.setImage(new Image(hey[hallo]));
        picno++;
    }
    
    @FXML public void goInstructions(ActionEvent event) throws IOException{
        changeScene("Instructions", event);
    }
    @FXML private void goStart(ActionEvent event) throws IOException{
        changeScene("Start", event);
    }
    @FXML private void goAddPlay(ActionEvent event) throws IOException{
        changeScene("AddPlayers", event);
    }
    @FXML private void goPracTest(ActionEvent event) throws IOException{
        changeScene("PracTest", event);
    }
    @FXML private void goPlay(ActionEvent event) throws IOException{
        changeScene2(this.numOfPlayers+"PGame", event);
    }
    @FXML private void goWinner(ActionEvent event) throws IOException{
        changeScene("Winner", event);
    }
    @FXML public void addPlayer(ActionEvent event) throws IOException{
        switch(numOfPlayers){
            case 2:
                enterPlayer3.setVisible(true);
                removePlayer3.setVisible(true);
                addPlayer3.setVisible(false);
                addPlayer4.setVisible(true);
                break;
            case 3:
                enterPlayer4.setVisible(true);
                removePlayer3.setVisible(false);
                removePlayer4.setVisible(true);
                addPlayer4.setVisible(false);
                addPlayer5.setVisible(true);
                break;
            case 4:
                enterPlayer5.setVisible(true);
                removePlayer4.setVisible(false);
                removePlayer5.setVisible(true);
                addPlayer5.setVisible(false);
                break;
            default:
                break;
        }
        numOfPlayers++;
    }    
    @FXML public void removePlayer(){
        switch(numOfPlayers){
            case 3:
                enterPlayer3.setVisible(false);
                removePlayer3.setVisible(false);
                addPlayer3.setVisible(true);
                addPlayer4.setVisible(false);
                break;
            case 4:
                enterPlayer4.setVisible(false);
                removePlayer4.setVisible(false);
                addPlayer4.setVisible(true);
                addPlayer5.setVisible(false);
                removePlayer3.setVisible(true);
                break;
            case 5:
                enterPlayer5.setVisible(false);
                removePlayer5.setVisible(false);
                addPlayer5.setVisible(true);
                removePlayer4.setVisible(true);
                break;
            default:
                break;
        }
        numOfPlayers--;
    } 
    
    @FXML public void changeScene(String fxml, ActionEvent event) throws IOException{
        Button anyButton = (Button)event.getSource();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml+".fxml"));
        anyButton.getScene().setRoot(loader.load());
    }
    
    @FXML public void changeScene2(String fxml, ActionEvent event){
        pnames = new String[numOfPlayers];
        
        pnames[0] = enterPlayer1.getText();
        pnames[1] = enterPlayer2.getText();
        if(numOfPlayers > 2){
            pnames[2] = enterPlayer3.getText();
            if(numOfPlayers > 3){
                pnames[3] = enterPlayer2.getText();
                if(numOfPlayers > 4){
                    pnames[4] = enterPlayer2.getText();
                }
            }
        }
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource(fxml+".fxml"));
        try{
            Loader.load();
        }catch(IOException ex){
            Logger.getLogger(PreGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        GameController display = Loader.getController();
        display.getArray(pnames);
        
        Parent p = Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.show();
        
        Button anyButton = (Button)event.getSource();
        Stage oldStage = (Stage)anyButton.getScene().getWindow();
        oldStage.close();
    }
}
