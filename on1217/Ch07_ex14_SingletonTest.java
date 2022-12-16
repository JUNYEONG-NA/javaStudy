package on1217;

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
        Singleton s = new Singleton.getInstance();

    }
}
