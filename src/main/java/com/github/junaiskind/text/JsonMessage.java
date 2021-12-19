package com.github.junaiskind.text;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;

public class JsonMessage {
    public static void sendMessage(Player player, BaseComponent component) {
        player.sendMessage(ChatMessageType.CHAT, component);
    }

    public static void sendMessage(Player player, BaseComponent mainComponent, BaseComponent...extraComponent) {
        BaseComponent component = mainComponent.duplicate();
        for(BaseComponent c : extraComponent) component.addExtra(c);
        sendMessage(player, component);
    }

    public static void sendMessage(Player player, JM mainJM, JM...extraJM) {
        BaseComponent component = mainJM.r().duplicate();
        for(JM j : extraJM) component.addExtra(j.r());
        sendMessage(player, component);
    }
}
