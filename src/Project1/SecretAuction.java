package Project1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class SecretAuction {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, Integer>bidders = new HashMap<>();
        Scanner scnr = new Scanner(System.in);
        String name;
        int bidAmount;
        boolean end = false;
        String keepGoing;

        while (! end){
            System.out.println("What is your name?");
            name = scnr.nextLine();
            System.out.println("How much money would you like to bid?");
            bidAmount = Integer.valueOf(scnr.nextLine());
            bidders.put(name,bidAmount);

            System.out.println("Are there more people in the bid? Type 'yes' or 'no'.: ");
            keepGoing = scnr.nextLine().toLowerCase(Locale.ROOT);

            if(keepGoing.equals("no")){
                end = true;
            }
        }
        System.out.println(bidders);
        System.out.println(findHighestBidder(bidders));
    }

    private static String findHighestBidder(HashMap<String, Integer> bidders) {
        int highestBid = 0;
        String winner = "";
        for (String person : bidders.keySet()){
            if(bidders.get(person) > highestBid){
                highestBid = bidders.get(person);
                 winner = person;
            }

        }
        return winner + " wins the bid with $" + highestBid + "!";
        //return winner;
    }
}
