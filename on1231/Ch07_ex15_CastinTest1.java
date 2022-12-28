package on1231;

public class Ch07_ex15_CastinTest1 {
    public static void main(String[] args) {
        Car car = null;

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
