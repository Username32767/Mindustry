package io.anuke.mindustry.input;

import io.anuke.arc.Application.ApplicationType;
import io.anuke.arc.Core;
import io.anuke.arc.KeyBinds.Axis;
import io.anuke.arc.KeyBinds.KeyBind;
import io.anuke.arc.KeyBinds.KeybindValue;
import io.anuke.arc.input.InputDevice.DeviceType;
import io.anuke.arc.input.KeyCode;

public enum Binding implements KeyBind{
    move_x(new Axis(KeyCode.A, KeyCode.D), "general"),
    move_y(new Axis(KeyCode.S, KeyCode.W)),
    select(KeyCode.MOUSE_LEFT),
    deselect(KeyCode.MOUSE_RIGHT),
    break_block(KeyCode.MOUSE_RIGHT),
    rotate(new Axis(KeyCode.SCROLL)),
    pick(KeyCode.MOUSE_MIDDLE),
    dash(KeyCode.SHIFT_LEFT),
    drop_unit(KeyCode.SHIFT_LEFT),
    gridMode(KeyCode.GRAVE),
    gridModeShift(KeyCode.ALT_LEFT),
    zoom_hold(KeyCode.CONTROL_LEFT, "view"),
    zoom(new Axis(KeyCode.SCROLL)),
    zoom_minimap(new Axis(KeyCode.MINUS, KeyCode.PLUS)),
    menu(Core.app.getType() == ApplicationType.Android ? KeyCode.BACK : KeyCode.ESCAPE),
    pause(KeyCode.SPACE),
    toggle_menus(KeyCode.C),
    screenshot(KeyCode.P),
    player_list(KeyCode.TAB, "multiplayer"),
    chat(KeyCode.ENTER),
    chat_history_prev(KeyCode.UP),
    chat_history_next(KeyCode.DOWN),
    chat_scroll(new Axis(KeyCode.SCROLL)),

    ;

    private final KeybindValue defaultValue;
    private final String category;

    Binding(KeybindValue defaultValue, String category){ this.defaultValue = defaultValue; this.category = category; }
    Binding(KeybindValue defaultValue){ this(defaultValue, null); }

    @Override public KeybindValue defaultValue(DeviceType type){ return defaultValue; }
    @Override public String category(){ return category; }
}
