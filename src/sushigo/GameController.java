/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class GameController implements Initializable {
    @FXML private ImageView p2handPreview;
    @FXML private ImageView p2p1pc1;
    @FXML private ImageView p2p1pc2;
    @FXML private ImageView p2p1pc3;
    @FXML private ImageView p2p1pc4;
    @FXML private ImageView p2p1pc5;
    @FXML private ImageView p2p1pc6;
    @FXML private ImageView p2p1pc7;
    @FXML private ImageView p2p1pc8;
    @FXML private ImageView p2p1pc9;
    @FXML private ImageView p2p1pc10;
    @FXML private ImageView p2p2pc1;
    @FXML private ImageView p2p2pc2;
    @FXML private ImageView p2p2pc3;
    @FXML private ImageView p2p2pc4;
    @FXML private ImageView p2p2pc5;
    @FXML private ImageView p2p2pc6;
    @FXML private ImageView p2p2pc7;
    @FXML private ImageView p2p2pc8;
    @FXML private ImageView p2p2pc9;
    @FXML private ImageView p2p2pc10;
    @FXML private Button startbutt;
    @FXML private Button playcardbutt;
    @FXML private Button endbutt;
    @FXML private Button nextbutt;
    @FXML private Label p2hcard1;
    @FXML private Label p2hcard2;
    @FXML private Label p2hcard3;
    @FXML private Label p2hcard4;
    @FXML private Label p2hcard5;
    @FXML private Label p2hcard6;
    @FXML private Label p2hcard7;
    @FXML private Label p2hcard8;
    @FXML private Label p2hcard9;
    @FXML private Label p2hcard10;
    @FXML private Label p5player1namedisplay;
    @FXML private Label p5player2namedisplay;
    @FXML private Label p5player3namedisplay;
    @FXML private Label p5player4namedisplay;
    @FXML private Label p5player5namedisplay;
    @FXML private Label p4player1namedisplay;
    @FXML private Label p4player2namedisplay;
    @FXML private Label p4player3namedisplay;
    @FXML private Label p4player4namedisplay;
    @FXML private Label p3player1namedisplay;
    @FXML private Label p3player2namedisplay;
    @FXML private Label p3player3namedisplay;
    @FXML private Label p2player1namedisplay;
    @FXML private Label p2player2namedisplay;
    @FXML private Label p2p1dic;
    @FXML private Label p2p2dic;
    @FXML private Label p2p1dicno;
    @FXML private Label p2p2dicno;
    public ArrayList<Label> labels = new ArrayList();
    public ArrayList<Label> labels1 = new ArrayList();
    public ArrayList<Label> labels2 = new ArrayList();
    public ArrayList<Label> labels3 = new ArrayList();
    public ArrayList<Label> labels4 = new ArrayList();
    public ArrayList<Label> handLabels = new ArrayList();
    public ArrayList<Label> scores = new ArrayList();
    public ArrayList<Label> dicctr = new ArrayList();
    public ArrayList<Player> players = new ArrayList();
    public ArrayList<ImageView> playedCards1 = new ArrayList();
    public ArrayList<ImageView> playedCards2 = new ArrayList();
    public ArrayList<ImageView> playedCards3 = new ArrayList();
    public ArrayList<ImageView> playedCards4 = new ArrayList();
    public ArrayList<ImageView> playedCards5 = new ArrayList();
    public Deck deck;
    public FXMLLoader loader;
    public Image selectedImg;
    public String winner;
    public int numOfPlayers = 2;
    public int startingCardNo = 12;
    public int setsElapsed = 0;
    public int roundsElapsed = 0;
    public int turnsElapsed = 0;
    public int picno = 1;
    public int selectedCardInd;
    
    @Override public void initialize(URL url, ResourceBundle rb) {
        labels1.add(p2player1namedisplay);
        labels1.add(p2player2namedisplay);
        labels2.add(p3player1namedisplay);
        labels2.add(p3player2namedisplay);
        labels2.add(p3player3namedisplay);
        labels3.add(p4player1namedisplay);
        labels3.add(p4player2namedisplay);
        labels3.add(p4player3namedisplay);
        labels3.add(p4player4namedisplay);
        labels4.add(p5player1namedisplay);
        labels4.add(p5player2namedisplay);
        labels4.add(p5player3namedisplay);
        labels4.add(p5player4namedisplay);
        labels4.add(p5player5namedisplay);
        handLabels.add(p2hcard1);
        handLabels.add(p2hcard2);
        handLabels.add(p2hcard3);
        handLabels.add(p2hcard4);
        handLabels.add(p2hcard5);
        handLabels.add(p2hcard6);
        handLabels.add(p2hcard7);
        handLabels.add(p2hcard8);
        handLabels.add(p2hcard9);
        handLabels.add(p2hcard10);
        
        playedCards1.add(p2p1pc1);
        playedCards1.add(p2p1pc2);
        playedCards1.add(p2p1pc3);
        playedCards1.add(p2p1pc4);
        playedCards1.add(p2p1pc5);
        playedCards1.add(p2p1pc6);
        playedCards1.add(p2p1pc7);
        playedCards1.add(p2p1pc8);
        playedCards1.add(p2p1pc9);
        playedCards1.add(p2p1pc10);
        playedCards2.add(p2p2pc1);
        playedCards2.add(p2p2pc2);
        playedCards2.add(p2p2pc3);
        playedCards2.add(p2p2pc4);
        playedCards2.add(p2p2pc5);
        playedCards2.add(p2p2pc6);
        playedCards2.add(p2p2pc7);
        playedCards2.add(p2p2pc8);
        playedCards2.add(p2p2pc9);
        playedCards2.add(p2p2pc10);
        
        dicctr.add(p2p1dicno);
        dicctr.add(p2p2dicno);
        
         deck = new Deck();
    }
    
    @FXML public void playGame() throws IOException{
        
        switch(this.numOfPlayers){
            case 2:
                labels.clear();
                for(int i = 0; i < labels1.size(); i++){
                    labels.add(labels1.get(i));
                }
                break;
            case 3:
                labels.clear();
                for(int i = 0; i < labels2.size(); i++){
                    labels.add(labels2.get(i));
                }
                break;
            case 4:
                labels.clear();
                for(int i = 0; i < labels3.size(); i++){
                    labels.add(labels3.get(i));
                }
                break;
            case 5:
                labels.clear();
                for(int i = 0; i < labels4.size(); i++){
                    labels.add(labels4.get(i));
                }
                break;
            default:
                break;
        }
        
        for(int i = 0; i < labels.size(); i++){
            String s = this.players.get(i).name;
            labels.get(i).setText(s+", 0 points");
        }
        
        p2p1dic.setText(this.players.get(0).name);
        p2p2dic.setText(this.players.get(1).name);
        startbutt.setVisible(false);
        
        startingCardNo-=numOfPlayers;
        for(int i = 0; i < this.players.size(); i++){
            this.players.get(i).playedCards.clear();
        }
        distribute();
        startTurn();
        
    } 
    
    @FXML public void reclaim(){
        for(int i = 0; i < this.players.size(); i++){
            this.players.get(i).playedCards.clear();
        }
        for(int j = 0; j < playedCards1.size(); j++){
            playedCards1.get(j).setImage(null);
        }
        for(int j = 0; j < playedCards2.size(); j++){
            playedCards2.get(j).setImage(null);
        }
        
    }
    
    @FXML public void distribute(){
        for(int i = 0; i < this.players.size(); i++){
            for(int j = 1; j <= startingCardNo; j++){
                this.players.get(i).hand.add(this.deck.draw());
            }
        }
    }
    
    @FXML public void startTurn(){
        if(setsElapsed != 3){
            if(roundsElapsed != startingCardNo){
                if(turnsElapsed == this.players.size()){
                    turnsElapsed = 0;
                    roundsElapsed++;
                    passHands();
                }
                nextbutt.setVisible(false);
            }
            if(roundsElapsed == startingCardNo){
                reclaim();
                distribute();
                updateScores();
                roundsElapsed = 0;
                setsElapsed++;
            }
            setHandLabels();
        }
        if(setsElapsed == 3){
            reclaim();
            hideHandLabels();
            ArrayList<Player> mostdic = new ArrayList();
            mostdic.clear();
            mostdic.add(new Player(-1));
            for(int i = 0; i <this.players.size(); i++){
                if(this.players.get(i).DICCount >= mostdic.get(0).score){
                    if(this.players.get(i).DICCount > mostdic.get(0).score){
                        mostdic.clear();
                    }
                    mostdic.add(this.players.get(i));
                }
            }
            for(int i = (6  - 6 % mostdic.size())/mostdic.size(); i > 0;){
                for(int j = 0; j < this.players.size(); j++){
                    mostdic.get(0).score++;
                    i--;
                }
            }
            updateScores();
            nextbutt.setVisible(false);
            playcardbutt.setVisible(false);
            endbutt.setVisible(true);
        }
    }
    
    @FXML public void previewCard(MouseEvent event){
        Label a = (Label)event.getSource();
        selectedImg = new Image("file:src/images/" + a.getText() + ".png");
        p2handPreview.setImage(selectedImg);
        String p = a.getId();
        selectedCardInd = a.getId().charAt(1) - 48;
        playcardbutt.setVisible(true);
    }
    
    @FXML public void updateScores(){
        for(int i = 0; i < this.players.size(); i++){
            int j = this.players.get(i).isawCount;
            this.players.get(i).score += 5*((j-j%2)/2);
        }
        for(int i = 0; i < this.players.size(); i++){
            int j = this.players.get(i).betamaxCount;
            this.players.get(i).score += 10*((j-j%3)/3);
        }
        for(int i = 0; i < this.players.size(); i++){
            for(int j = 0; j <= this.players.get(i).bananacueCount; j++){
                this.players.get(i).score += j;
                if(j == 5){
                    break;
                }
            }
        }
        if(players.get(0).balutCount > players.get(1).balutCount){
            players.get(0).score += 6;
            players.get(1).score += 3;
        }else if(players.get(0).balutCount < players.get(1).balutCount){
            players.get(0).score += 3;
            players.get(1).score += 6;
        }else{
            players.get(0).score += 3;
            players.get(1).score += 3;
        }
        
        for(int i = 0; i < this.players.size(); i++){
            this.labels.get(i).setText(this.players.get(i).name + ", " + this.players.get(i).score + " points");
        }
    }
    
    @FXML public void playCardd(ActionEvent event){
        if(!"DirtyIceCream".equals(this.players.get(turnsElapsed).hand.get(selectedCardInd).type)){
            switch(turnsElapsed){
                case 0:
                    this.playedCards1.get(this.players.get(turnsElapsed).playedCards.size()).setImage(selectedImg);
                    break;
                case 1:
                    this.playedCards2.get(this.players.get(turnsElapsed).playedCards.size()).setImage(selectedImg);
                    break;
                case 2:
                   this.playedCards3.get(this.players.get(turnsElapsed).playedCards.size()).setImage(selectedImg);
                    break;
                case 3:
                    this.playedCards4.get(this.players.get(turnsElapsed).playedCards.size()).setImage(selectedImg);
                    break;
                case 4:
                    this.playedCards5.get(this.players.get(turnsElapsed).playedCards.size()).setImage(selectedImg);
                    break;
                default:
                    break;
            }
        }
        this.players.get(turnsElapsed).playCard(selectedCardInd);
        dicctr.get(turnsElapsed).setText(""+this.players.get(turnsElapsed).DICCount);
        turnsElapsed++;
        p2handPreview.setImage(null);
        hideHandLabels();
        playcardbutt.setVisible(false);
    }

    @FXML public void endGame(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Winner.fxml"));
        try{
            Loader.load();
        }catch(IOException ex){
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        EndGameController display = Loader.getController();
        if(players.get(0).score > players.get(1).score){
            winner = this.players.get(0).name;
        }else if(players.get(0).score < players.get(1).score){
            winner = this.players.get(1).name;
        }else{
            winner = "No one";
        }
        display.getWinners(winner);
        
        Parent p = Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.show();
        
        Button anyButton = (Button)event.getSource();
        Stage oldStage = (Stage)anyButton.getScene().getWindow();
        oldStage.close();
    }
    
    @FXML public void getArray(String[] a){
        players.clear();
        for(int i = 0; i < a.length; i++){
            this.players.add(new Player(a[i]));
        }
        this.numOfPlayers = a.length;
    }
    
    @FXML public void passHands(){
        for(int i = 0; i < numOfPlayers; i++){
            if(i == numOfPlayers - 1){
                for(int j = 0; j < startingCardNo - roundsElapsed; j++){
                    this.players.get(i).hand.add(this.players.get(0).hand.get(j));
                }
            }else{
                for(int j = 0; j < startingCardNo - roundsElapsed; j++){
                    this.players.get(i).hand.add(this.players.get(i+1).hand.get(j));
                }
            }
        }
        for(int i = 0; i < numOfPlayers; i++){
            for(int j = 0; j < startingCardNo - roundsElapsed; j++){
                this.players.get(i).hand.remove(j);
            }
        }
    }
    
    @FXML public void setHandLabels(){
        for(int i = 0; i < this.players.get(turnsElapsed).hand.size(); i++){
            this.handLabels.get(i).setText(this.players.get(turnsElapsed).hand.get(i).type);
        }
        for(int i = this.players.get(turnsElapsed).hand.size(); i < startingCardNo; i++){
            this.handLabels.get(i).setText("");
        }
    }
    
    @FXML public void hideHandLabels(){
        nextbutt.setVisible(true);
        for(int i = 0; i < startingCardNo; i++){
            this.handLabels.get(i).setText("");
        }
    }
}
