package on1217;

/**********************************************************
 *                         오버라이딩                        *
 * 오버로딩 : 기존에 없던 새로운 메서드를 추가하는 것               : *
 *          매개변수의 타입과 개수가 달라야함                     *
 * 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것                 *
 *           이름,매개변수,반환타입이 같이야함                    *
 *********************************************************/
//
//public class Ch07_ex5_SuperTest {
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.method();
//    }
//}
//class Parent{
//    int x= 10;
//}
//class Child extends Parent{
//    void method(){
//        System.out.println("x = "+ x);
//        System.out.println("this.x = " + this.x);
//        System.out.println("super.x = " + super.x);
//    }
//}


public class Ch07_ex5_SuperTest { // CH07_ex6
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
class Parent{
    int x= 10;
}
class Child extends Parent{
    int x = 20;

    void method(){
        System.out.println("x = "+ x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}