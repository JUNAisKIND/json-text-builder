package com.github.junaiskind.text.enums;

public enum Action {
    CHANGE_PAGE(0),
    COPY_TO_CLIPBOARD(0),
    OPEN_FILE(0),
    OPEN_URL(0),
    RUN_COMMAND(0),
    SUGGEST_COMMAND(0),

    SHOW_ACHIEVEMENT(1),
    SHOW_ENTITY(1),
    SHOW_ITEM(1),
    SHOW_TEXT(1);

    private int event;

    Action(int event) {
        this.event = event;
    }

    public int getEvent() {
        return event;
    }
}
