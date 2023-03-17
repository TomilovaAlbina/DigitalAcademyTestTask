package ru.digital.academy;

import java.util.List;

public class Player {

    private int number;
    private List<Card> cards;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", cards=" + cards +
                '}';
    }
}
