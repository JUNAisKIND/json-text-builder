package com.github.junaiskind.text.enums;

public enum Styles {
    Bold(0),
    Italic(0),
    Obfuscated(0),
    Strikethrough(0),
    Underlined(0),

    BLACK(1),
    DARK_BLUE(1),
    DARK_GREEN(1),
    DARK_AQUA(1),
    DARK_RED(1),
    DARK_PURPLE(1),
    GOLD(1),
    GRAY(1),
    DARK_GRAY(1),
    BLUE(1),
    GREEN(1),
    AQUA(1),
    RED(1),
    LIGHT_PURPLE(1),
    YELLOW(1),
    WHITE(1);

    private int type;

    Styles(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
