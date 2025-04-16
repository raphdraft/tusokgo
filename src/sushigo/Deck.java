
package sushigo;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public ArrayList<Card> deck = new ArrayList();

    public Deck() {
        this.reshuffle();
    }

    public Card draw() {
        Random rand = new Random();
        int cardInd = rand.nextInt(this.deck.size());
        Card cardDrawn = this.deck.get(cardInd);
        this.deck.remove(cardInd);
        return cardDrawn;
    }

    public void reshuffle() {
        this.deck.clear();
        for(int i = 1; i <= 14; i++){
            this.deck.add(new Card("Isaw"));
            this.deck.add(new Card("Betamax"));
            this.deck.add(new Card("BananaCue"));
        }
        for(int i = 1; i <= 12; i++){
            this.deck.add(new Card("Balut2"));
        }
        for(int i = 1; i <= 10; i++){
            this.deck.add(new Card("Fishball"));
            this.deck.add(new Card("DirtyIceCream"));
        }
        for(int i = 1; i <= 8; i++){
            this.deck.add(new Card("Balut3"));
        }
        for(int i = 1; i <= 6; i++){
            this.deck.add(new Card("Toyo"));
            this.deck.add(new Card("Balut1"));
        }
        for(int i = 1; i <= 5; i++){
            this.deck.add(new Card("Squidball"));
            this.deck.add(new Card("QwekQwek"));
        }
    }
}
