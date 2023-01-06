package on0107;

public class Ch08_ex17_FinallyTest {

//    #17
//    public static void main(String[] args) {
//        try{
//            startInstall();
//            copyFiles();
//            deleteTempFiles();
//        }catch (Exception e){
//            e.printStackTrace();
//            deleteTempFiles();
//        }
//    }
    static void startInstall(){}
    static void copyFiles(){}
    static void deleteTempFiles(){}


//    #18
    public static void main(String[] args) {
        try {
            startInstall();
        }catch (Exception e){
            copyFiles();
        }finally {
            deleteTempFiles();
        }
    }
}
class FinallyTest3{
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1 수행 후 main");
    }
    static void method1(){
        try {
            System.out.println("called method1()");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Run method1() finally block");
        }
    }
}