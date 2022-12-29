package on1231;

import java.text.Format;

public class Ch07_ex15_CastinTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive.");
    }

    void stop() {
        System.out.println("drive.");
    }

}
class FireEngine extends Car{
    void water(){
        System.out.println("water.");
    }
}
