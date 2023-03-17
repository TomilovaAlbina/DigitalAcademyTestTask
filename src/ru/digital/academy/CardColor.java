package ru.digital.academy;

public enum CardColor {
    WHITE("W"), RED ("R"), GREEN ("G"), BLUE ("B");
    private final String colorCode;

    CardColor(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
