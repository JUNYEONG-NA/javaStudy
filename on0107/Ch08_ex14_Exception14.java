package on0107;

public class Ch08_ex14_Exception14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            System.out.println("method1 exception");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception{
        throw new Exception();
    }
}
