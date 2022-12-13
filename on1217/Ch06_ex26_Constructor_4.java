package on1217;
/*************************
 생성자를 이용한 인스턴스의 복사
 *************************/
class Car3{
    String color;
    String gearType;
    int door;

    Car3(){
        this("white","auto",4);
    }
    Car3(Car3 c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car3(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Ch06_ex26_Constructor_4 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1);

        System.out.println("c1의 속성 = "+ c1.color+" , "+c1.gearType+" , "+c1.door);
        System.out.println("c2의 속성 = "+ c2.color+" , "+c2.gearType+" , "+c2.door);
        /* 인스턴스 c2 는 c1을 복사하여 생성된 것이므로 같은 상태를 갖지만,
        *  서로 독립적인 메모리 공간에 존재하는 별도의 인스턴스 이기 때문에
        *  c1의 값이 변경 되더라도 c2는 변하지않는다. */
        c1.door = 100;
        System.out.println("c1의 속성 = "+ c1.color+" , "+c1.gearType+" , "+c1.door);
        System.out.println("c1의 속성 = "+ c2.color+" , "+c2.gearType+" , "+c2.door);
    }
}
