package oop.data;

public enum Level {
    STANDARD("STANDAR LEVEL"),
    PREMIUM("PREMIUM LEVEL"),
    VIP("VIP LEVEL");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
