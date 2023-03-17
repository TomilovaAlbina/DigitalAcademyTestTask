package ru.digital.academy;

import java.util.Scanner;

public class Main {
public static Scanner inputScanner = new Scanner (System.in);

    public static void main(String[] args) {
        CardGameImpl game = new CardGameImpl();
        boolean isRuning = true;
        while (isRuning) {
            String inputLine = inputScanner.nextLine();
            String[] arguments = inputLine.split(" ");

            if (arguments[0].equals("start")) {
                int countPlayers = Integer.parseInt(arguments[1]);
                int countCards = Integer.parseInt(arguments[2]);
                game.start(countPlayers, countCards);
            }

            if (arguments[0].equals("get-cards")) {
                int playerNumber = Integer.parseInt(arguments[1]);
                game.getCards(playerNumber);
            }

            if (arguments[0].equals("exit")) {
                isRuning = false;

            }
        }


    }
}
