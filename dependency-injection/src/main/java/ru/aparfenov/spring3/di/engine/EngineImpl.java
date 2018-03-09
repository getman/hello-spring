package ru.aparfenov.spring3.di.engine;

/**
 * Created by ArtemParfenov on 08.03.2018.
 */
public class EngineImpl implements Engine {
    public void start() {
        System.out.println("Engine is started!");
    }

    public void stop() {
        System.out.println("Engine is stopped!");
    }
}
