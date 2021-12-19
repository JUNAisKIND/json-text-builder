package com.github.junaiskind.text.events;

import com.github.junaiskind.text.enums.Action;
import com.github.junaiskind.text.JM;
import net.md_5.bungee.api.chat.BaseComponent;

public class HoverEvent {
    private net.md_5.bungee.api.chat.HoverEvent event;

    public HoverEvent(Action action, String value) {
        if(action.getEvent() == 1) {
            BaseComponent[] coms = {new JM(value).r()};
            this.event = new net.md_5.bungee.api.chat.HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.valueOf(action.name()), coms);
        }
    }

    public HoverEvent(Action action, BaseComponent value) {
        if(action.getEvent() == 1) {
            BaseComponent[] coms = {value};
            this.event = new net.md_5.bungee.api.chat.HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.valueOf(action.name()), coms);
        }
    }

    public net.md_5.bungee.api.chat.HoverEvent r() {
        return this.event;
    }
}
