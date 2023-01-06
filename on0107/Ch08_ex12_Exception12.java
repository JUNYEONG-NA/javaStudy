package on0107;

public class Ch08_ex12_Exception12 {
    public static void main(String[] args) throws Exception{
        method1();
    }

//    #12
//    static void method1() throws Exception{
//        method2();
//    }
//    static void method2() throws Exception{
//        throw new Exception();
//    }

//    #13
    static void method1(){
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("Method1 예외");
            e.printStackTrace();
        }
    }




}
