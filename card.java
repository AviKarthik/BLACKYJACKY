import java.util.*;

public class card {
    String suit;
    int val;
    String num;

    public card(){
        suit = "";
        val = 0;
        num = "";
    }

    public card(String suit, int val, String num){
        this.suit = suit;
        this.val = val;
        this.num = num;
    }

    public String getSuit(){
        return suit;
    }

    public int getVal(){
        return val;
    }

    public String getNum(){
        return num;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setVal(int val){
        this.val = val;
    }

    public void setNum(String num){
        this.num = num;
    }

    public static void create_deck(ArrayList<card> deck){
        deck.clear();

        deck.add(new card("hearts", 2, "deuce"));
        deck.add(new card("diamonds", 2, "deuce"));
        deck.add(new card("spades", 2, "deuce"));
        deck.add(new card("clubs", 2, "deuce"));

        deck.add(new card("hearts", 3, "three"));
        deck.add(new card("diamonds", 3, "three"));
        deck.add(new card("spades", 3, "three"));
        deck.add(new card("clubs", 3, "three"));

        deck.add(new card("hearts", 4, "four"));
        deck.add(new card("diamonds", 4, "four"));
        deck.add(new card("spades", 4, "four"));
        deck.add(new card("clubs", 4, "four"));

        deck.add(new card("hearts", 5, "five"));
        deck.add(new card("diamonds", 5, "five"));
        deck.add(new card("spades", 5, "five"));
        deck.add(new card("clubs", 5, "five"));

        deck.add(new card("hearts", 6, "six"));
        deck.add(new card("diamonds", 6, "six"));
        deck.add(new card("spades", 6, "six"));
        deck.add(new card("clubs", 6, "six"));

        deck.add(new card("hearts", 7, "seven"));
        deck.add(new card("diamonds", 7, "seven"));
        deck.add(new card("spades", 7, "seven"));
        deck.add(new card("clubs", 7, "seven"));

        deck.add(new card("hearts", 8, "eight"));
        deck.add(new card("diamonds", 8, "eight"));
        deck.add(new card("spades", 8, "eight"));
        deck.add(new card("clubs", 8, "eight"));

        deck.add(new card("hearts", 9, "nine"));
        deck.add(new card("diamonds", 9, "nine"));
        deck.add(new card("spades", 9, "nine"));
        deck.add(new card("clubs", 9, "nine"));

        deck.add(new card("hearts", 10, "ten"));
        deck.add(new card("diamonds", 10, "ten"));
        deck.add(new card("spades", 10, "ten"));
        deck.add(new card("clubs", 10, "ten"));

        deck.add(new card("hearts", 10, "jack"));
        deck.add(new card("diamonds", 10, "jack"));
        deck.add(new card("spades", 10, "jack"));
        deck.add(new card("clubs", 10, "jack"));

        deck.add(new card("hearts", 10, "queen"));
        deck.add(new card("diamonds", 10, "queen"));
        deck.add(new card("spades", 10, "queen"));
        deck.add(new card("clubs", 10, "queen"));

        deck.add(new card("hearts", 10, "king"));
        deck.add(new card("diamonds", 10, "king"));
        deck.add(new card("spades", 10, "king"));
        deck.add(new card("clubs", 10, "king"));

        deck.add(new card("hearts", 11, "ace"));
        deck.add(new card("diamonds", 11, "ace"));
        deck.add(new card("spades", 11, "ace"));
        deck.add(new card("clubs", 11, "ace"));

    }

}
