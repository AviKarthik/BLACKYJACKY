import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<card> deck = new ArrayList<>();
        card.create_deck(deck);
        int bank = 1000;
        int bet;
        String move;
        boolean pturn = true;
        boolean alive = true;
        boolean busted = false;

        player player = new player(1000, 0, new ArrayList<card>());
        dealer dealer = new dealer(0, new ArrayList<card>());
        while(player.getBank()>0) {
            Scanner input = new Scanner(System.in);
            System.out.println("current balance: " + player.bank);
            System.out.println("How much would you like to bet?: ");
            bet = input.nextInt();
            input.nextLine();
            player.draw(deck);
            player.draw(deck);
            dealer.draw(deck);
            dealer.hand();
            System.out.println();
            while (pturn && player.getScore() < 21) {
                player.hand();
                System.out.println();
                System.out.println("Would you like to: h. hit or s. stand (h/s)");
                move = input.nextLine();
                if (move.equals("h")) {
                    player.draw(deck);
                    player.score();
                    if (player.getScore() > 21) {
                        busted = true;
                        pturn = false;
                    }
                }
                else if (move.equals("s")) {
                    pturn = false;
                }
            }
            if (busted) {
                player.hand();
                System.out.println("BUST, you LOSE!!!");
                player.setBank((player.getBank() - bet));
                player.wipe();
                dealer.wipe();
                card.create_deck(deck);
                busted = false;
                pturn = true;
            } else {
                player.hand();
                dealer.draw(deck);
                dealer.hand();
                while (dealer.getScore() < 17) {
                    System.out.println("Dealer HITS");
                    dealer.draw(deck);
                    dealer.hand();
                }
                System.out.println("Dealer STANDS");
                if (dealer.getScore() > 21) {
                    System.out.println("DEALER BUSTS... YOU WIN!!!");
                    dealer.wipe();
                    player.wipe();
                    card.create_deck(deck);
                    player.setBank((player.getBank() + bet));
                    pturn = true;
                } else if (dealer.getScore() == player.getScore()) {
                    System.out.println("BOTH YOU AND THE DEALER GOT THE SAME SCORE... IT'S A DRAW!!!");
                    dealer.wipe();
                    player.wipe();
                    card.create_deck(deck);
                    pturn = true;
                } else if (dealer.getScore() > player.getScore()) {
                    System.out.println("THE DEALER WAS CLOSER TO 21, YOU LOSE!!!");
                    dealer.wipe();
                    player.wipe();
                    card.create_deck(deck);
                    player.setBank((player.getBank() - bet));
                    pturn = true;
                } else if (dealer.getScore() < player.getScore()) {
                    System.out.println("YOU WERE CLOSER TO 21, YOU WIN!!!");
                    dealer.wipe();
                    player.wipe();
                    card.create_deck(deck);
                    player.setBank((player.getBank() + bet));
                    pturn = true;
                }
            }
            if(player.getBank()>0) {
                System.out.println("Would you like to keep playing? (y/n)");
                String answer = input.nextLine();
                if (answer.equals("n")) {
                    player.setBank(0);
                }
            }
            else{
                System.out.print("u broke foo \uD83D\uDE02");
                System.out.println(" you cant play no mo cuz yous a broke boy \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23");
            }
        }
    }
}