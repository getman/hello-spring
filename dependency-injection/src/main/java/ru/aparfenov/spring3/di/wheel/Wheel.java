package ru.aparfenov.spring3.di.wheel;

/**
 * Created by ArtemParfenov on 08.03.2018.
 */
public interface Wheel {
    enum WheelState {
        OK, DAMAGED
    }
    public WheelState checkWheel();
}
