package ru.aparfenov.spring3.di.car;

import ru.aparfenov.spring3.di.engine.Engine;
import ru.aparfenov.spring3.di.headlamp.HeadLamp;
import ru.aparfenov.spring3.di.wheel.Wheel;

import java.util.List;

/**
 * Created by ArtemParfenov on 08.03.2018.
 */
public class Car {
    /**инжектируется как интерфейс, поле бина Car в application.xml*/
    private Engine engineField;
    /**инжектируется как коллекция интерфейсов*/
    private List<Wheel> wheels;
    /**инжектируется как класс, а не как интерфейс*/
    private HeadLamp headLamp;

    public void drive() {
        for (Wheel nextWheel: wheels) {
            if (Wheel.WheelState.DAMAGED == nextWheel.checkWheel()) {
                System.out.println("Can`t drive - the wheel is damaged");
                return;
            }
        }
        engineField.start();
        headLamp.turnOn();
        System.out.println("Car is moving");
    }

    public Engine getEngineField() {
        return engineField;
    }

    public void setEngineField(Engine engineField) {
        this.engineField = engineField;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public HeadLamp getHeadLamp() {
        return headLamp;
    }

    public void setHeadLamp(HeadLamp headLamp) {
        this.headLamp = headLamp;
    }
}
