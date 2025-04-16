
package sushigo;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> hand = new ArrayList();
    public ArrayList<Card> playedCards = new ArrayList();
    public String name;
    public boolean toyo = false;
    public int DICCount = 0;
    public int betamaxCount = 0;
    public int bananacueCount = 0;
    public int isawCount = 0;
    public int balutCount = 0;
    public int score = 0;
    
    public Player(String name){
        this.name = name;
    }
    public Player(int w){
        this.score = w;
    }
    public void playCard(int a){
        if("DirtyIceCream".equals(this.hand.get(a).type)){
            DICCount++;
        }else{
            switch(this.hand.get(a).type){
                case "BananaCue":
                    this.bananacueCount++;
                    break;
                case "Balut1":
                    this.balutCount += 1;
                    break;
                case "Balut2":
                    this.balutCount += 2;
                    break;
                case "Balut3":
                    this.balutCount += 3;
                    break;
                case "Betamax":
                    this.betamaxCount++;
                    break;
                case "Isaw":
                    this.isawCount++;
                    break;
                case "Fishball":
                    if(this.toyo == true){
                        this.score += 6;
                        this.toyo = false;
                    }else{
                        this.score += 2;
                    }
                    break;
                case "Squidball":
                    if(this.toyo == true){
                        this.score += 9;
                        this.toyo = false;
                    }else{
                        this.score += 3;
                    }
                    break;
                case "Qwekqwek":
                    if(this.toyo == true){
                        this.score += 3;
                        this.toyo = false;
                    }else{
                        this.score += 1;
                    }
                    break;
                case "Toyo":
                    this.toyo = true;
                    break;
            }
            playedCards.add(this.hand.get(a));
        }
        this.hand.remove(a);
    }
}
