package ru.digital.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGameImpl implements CardGame {

    private List<Player> players;

    @Override
    public void start(int countCards, int countPlayers) {

        Random random = new Random();

        List<Player> cardPlayers = new ArrayList<>();
        for (int i = 1; i <= countPlayers; i++) {
            Player player = new Player();
            player.setNumber(i);
            List<Card> cards = new ArrayList<>();
            for (int j = 0; j < countCards; j++) {
                int randomCardValue = random.nextInt(1, 10);
                CardColor[] cardColors = CardColor.values();
                int countColors = cardColors.length;
                int randomCardColorIndex = random.nextInt(0, countColors - 1);
                CardColor cardColor = cardColors[randomCardColorIndex];
                Card card = new Card(cardColor, randomCardValue);
                cards.add(card);
            }

            player.setCards(cards);
            cardPlayers.add(player);
        }

        players = cardPlayers;

    }

    private String convert(List<Card> cards) {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.getColor().getColorCode()).append(card.getValue()).append(" ");

        }
        return result.toString();

    }

    @Override
    public void getCards(int playerNumber) {
        if (players != null && playerNumber > players.size()) {
            throw new CheckException("Неверный номер игрока");

        }

        for (Player player : players) {
            if (playerNumber == player.getNumber()) {
                String playerCards = player.getNumber() + " " + convert(player.getCards());
                System.out.println(playerCards);
                break;
            }

        }


    }
}
