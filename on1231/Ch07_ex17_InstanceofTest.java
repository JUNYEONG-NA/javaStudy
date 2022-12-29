package on1231;

public class Ch07_ex17_InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine");
        }
        if(fe instanceof Car){
            System.out.println("this is Car instance");
        }
        if(fe instanceof Object){
            System.out.println("This is an Object instance");
        }
        System.out.println(fe.getClass().getName());
    }
}
