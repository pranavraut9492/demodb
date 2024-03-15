package com.azure.demodb.model;

public enum Level {
    LEVEL4("4"),
    LEVEL5("5"),
    LEVEL6("6"),
    LEVEL7("7"),
    LEVEL8("8");
    private final String level;

    public String getLevel() {
        return level;
    }

    Level(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Level{" +
                "level='" + level + '\'' +
                '}';
    }
}
