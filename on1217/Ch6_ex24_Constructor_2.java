package on1217;
/*********************
 * 매개변수가 있는 생성자 *
*********************/
class Car{
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class Ch6_ex24_Constructor_2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door= 4;

        Car c2 =  new Car("white", "manual", 2);
        System.out.println("c1의 속성 = "+ c1.color+" , "+c1.gearType+" , "+c1.door);
        System.out.println("c2의 속성 = "+ c2.color+" , "+c2.gearType+" , "+c2.door);

    }
}
/* 매개변수가 있는 생성자를 사용하게 되면 인스턴스를 생성하는 동시에 원하는 값으로 초기화 할 수 있다. */