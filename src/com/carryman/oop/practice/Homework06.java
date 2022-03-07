package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Human t = new Human("唐僧",null);
        t.passRiver();
        t.passRoad();
    }
}


interface Vehicles{
    void work();
}

class  Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("老🐎过河");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("船过河");
    }
}

class TrafficFactory{


    private static Horse horse=new Horse();

    private TrafficFactory(){}


    public static Horse getHorse(){


        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }
}
class Human{
    private String name;
    private Vehicles vehicles;

    public Human(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void pass(){
        if (vehicles instanceof Horse){
            vehicles = TrafficFactory.getHorse();
        }
        vehicles.work();
    }

    public  void  passRiver(){
        if (!(vehicles instanceof Horse)){
            vehicles = TrafficFactory.getBoat();
        }
        vehicles.work();
    }


    public void passRoad(){
        if (!(vehicles instanceof Horse)){
            vehicles = TrafficFactory.getHorse();
        }
        vehicles.work();
    }


}



