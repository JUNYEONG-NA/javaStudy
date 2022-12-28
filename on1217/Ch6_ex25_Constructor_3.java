package on1217;
/*************************
  생성자에서 다른 생성자 호출하기
 *************************/
class Car2{
    String color;
    String gearType;
    int door;

    Car2(){
        this("white","auto",4);
    }
    Car2(String color){
        this(color, "auto", 4);
    }
    /* 생성자 간 호출에는 생성자 이름이 아닌 this 를 사용해야하며 반드시 첫줄에서 호출 해야함
    * this
    *  인스턴스멤버만 사용할 수 있음. static 메서드에서는 사용 불가.
    *  인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소 저장.
    *  모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재.
    *  this(), this(pram) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용.
    */
    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Ch6_ex25_Constructor_3 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
//        Car2 c3 = new Car2("red", "stick", 8);

        System.out.println("c1의 속성 = "+ c1.color+" , "+c1.gearType+" , "+c1.door);
        System.out.println("c2의 속성 = "+ c2.color+" , "+c2.gearType+" , "+c2.door);
//        System.out.println("c3의 속성 = "+ c3.color+" , "+c3.gearType+" , "+c3.door);
    }
}
