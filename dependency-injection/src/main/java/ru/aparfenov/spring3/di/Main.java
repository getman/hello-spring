package ru.aparfenov.spring3.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aparfenov.spring3.di.car.Car;

/**
 * Created by ArtemParfenov on 08.03.2018.
 */
public class Main {
    public static void main(String [] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car myCar = (Car) ctx.getBean("car");
        myCar.drive();
    }
}
