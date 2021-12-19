package com.github.junaiskind.text.events;

import com.github.junaiskind.text.enums.Action;

public class ClickEvent {

    private net.md_5.bungee.api.chat.ClickEvent event;

    public ClickEvent(Action action, String value) {
        if(action.getEvent() == 0) {
            this.event = new net.md_5.bungee.api.chat.ClickEvent(net.md_5.bungee.api.chat.ClickEvent.Action.valueOf(action.name()), value);
        }
    }
    public net.md_5.bungee.api.chat.ClickEvent r() {
        return this.event;
    }

}
