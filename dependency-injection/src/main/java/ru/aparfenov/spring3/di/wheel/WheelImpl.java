package ru.aparfenov.spring3.di.wheel;

/**
 * Created by ArtemParfenov on 08.03.2018.
 */
public class WheelImpl implements Wheel {
    public WheelState checkWheel() {
        return WheelState.OK;
    }
}
