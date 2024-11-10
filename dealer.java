import java.util.*;

public class dealer {
    int score = 0;
    ArrayList<card> cards = new ArrayList<card>();

    public dealer(int score, ArrayList<card> cards) {
        this.score = score;
        this.cards = cards;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<card> getCards() {
        return cards;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCards(ArrayList<card> cards) {
        this.cards = cards;
    }

    public void draw(ArrayList<card> deck){
        int temp = (int)(Math.random()*deck.size());
        this.cards.add(deck.get(temp));
        deck.remove(temp);
    }


    public void wipe(){
        cards.clear();
        score = 0;
    }

    public boolean ace(){
        for (card card : cards) {
            if(card.val == 11){
                return true;
            }
        }
        return false;
    }

    public void score(){
        score = 0;
        for (card card : cards) {
            score = score + card.getVal();
        }
        if(score>21 && this.ace()){
            score = score - 10;
        }
    }

    public void hand(){
        score = 0;
        System.out.println("THE DEALER's cards are: ");
        for (card card : cards) {
            System.out.println((card.getNum() + " of " + card.getSuit()));
            score = score + card.getVal();
        }
        if(score>21 && this.ace()){
            score = score - 10;
        }
        System.out.println();
        System.out.println("The DEALER's score is " + score);
    }

}
