package com.github.junaiskind.text;


import com.github.junaiskind.text.enums.Styles;
import com.github.junaiskind.text.events.ClickEvent;
import com.github.junaiskind.text.events.HoverEvent;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;

public class JM {

    private TextComponent textComponent;

    public JM(String text) {
        textComponent = new TextComponent(text);
    }

    public JM(String text, Styles...styles) {
        textComponent = new TextComponent(text);
        setStyle(styles);
    }

    public JM(String text, ClickEvent clickEvent, HoverEvent hoverEvent) {
        textComponent = new TextComponent(text);

        if(clickEvent != null)
            textComponent.setClickEvent(clickEvent.r());
        if(hoverEvent != null)
            textComponent.setHoverEvent(hoverEvent.r());
    }

    public TextComponent r() {
        return textComponent;
    }

    public JM setClickEvent(ClickEvent clickEvent) {
        textComponent.setClickEvent(clickEvent.r());
        return this;
    }

    public JM setHoverEvent(HoverEvent hoverEvent) {
        textComponent.setHoverEvent(hoverEvent.r());
        return this;
    }

    public JM setInsertion(String insertion) {
        textComponent.setInsertion(insertion);
        return this;
    }

    public JM addExtra(BaseComponent component) {
        textComponent.addExtra(component);
        return this;
    }

    public JM addExtra(JM jm) {
        textComponent.addExtra(jm.r());
        return this;
    }

    public JM addExtra(String text) {
        textComponent.addExtra(text);
        return this;
    }

    public JM setStyle(Styles...styles) {

        for(Styles sty : styles) {
            if(sty.getType() == 0) {
                switch (sty) {
                    case Bold:
                        textComponent.setBold(true);
                        break;
                    case Italic:
                        textComponent.setItalic(true);
                        break;
                    case Obfuscated:
                        textComponent.setObfuscated(true);
                        break;
                    case Strikethrough:
                        textComponent.setStrikethrough(true);
                        break;
                    case Underlined:
                        textComponent.setUnderlined(true);
                        break;
                }
            } else if(sty.getType() == 1) {
                textComponent.setColor(ChatColor.valueOf(sty.name()));
            }

        }
        return this;
    }

}
