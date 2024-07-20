//package com.fastcampus.ch3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//class Car{
//    @Value("red")
//    String color;
//    @Value("100")
//    int oil;
//    @Autowired
//    Engine engine;
//    @Autowired
//    Door[] door;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setOil(int oil) {
//        this.oil = oil;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setDoor(Door[] door) {
//        this.door = door;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", oil=" + oil +
//                ", engine=" + engine +
//                ", door=" + Arrays.toString(door) +
//                '}';
//    }
//}
//
//@Component
//class Engine{}
//
//@Component
//class SuperEngine extends Engine{}
//@Component
//class TurboEngine extends Engine{}
//
//
//@Component
//class Door{}
//
//public class SpringDiTest {
//
//    public static void main(String[] args){
//        ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
//        Car car = (Car) ac.getBean("car");
////        Engine engine = (Engine) ac.getBean("engine");
////        Door door = (Door) ac.getBean("door");
//
////        car.setColor("red");
////        car.setOil(100);
////        car.setEngine(engine);
////        car.setDoor(new Door[]{(Door) ac.getBean("door"), (Door) ac.getBean("door")});
//
//        System.out.println("car : " + car);
//    }
//}
