package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(44);
        car.getAir().flow();

    }


}
class  Car{

    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature>26){
                System.out.println("吹冷气");
            }else if (temperature>0){
                System.out.println("空调关闭");
            }else {
                System.out.println("吹暖气");
            }



        }
    }


    public Air getAir(){
        return new Air();
    }
}