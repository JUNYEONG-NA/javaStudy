package on1217;
// 싱글톤 패턴은 객체가 하나임을 증명하고 싶을때 사용 - HS
final class Singleton{
    private static Singleton s = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(s == null){
            s = new Singleton();
        }
        return s;
    }
}
public class Ch07_ex14_SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();
        Singleton s = Singleton.getInstance();

    }
}
