package on0107;

import jdk.nashorn.internal.runtime.ECMAException;

public class Ch08_ex04_Exception4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
//        #04
//        try {
//            System.out.println(3);
//            System.out.println(4);
//        }catch (Exception e){
//            System.out.println(5);
//        }
//        System.out.println(6);

//        #05
//        try{
//            System.out.println(3);
//            System.out.println(0/0);
//            System.out.println(4);
//        }catch (ArithmeticException ae){
//            System.out.println("Exception");
//        }

//        #06
//        try{
//            System.out.println(3);
//            System.out.println(0/0);
//            System.out.println(4);
//        }catch(Exception e){
//            System.out.println(5);
//        }
//        System.out.println(6);

//        #07
//        try{
//            System.out.println(3);
//            System.out.println(0/0);
//            System.out.println(4);
//        }catch (ArithmeticException ae){
//            if(ae instanceof  ArithmeticException){
//                System.out.println("true");
//            }
//            System.out.println("ArithmeticException");
//        }catch (Exception e){
//            System.out.println("Exception");
//        }
//        System.out.println(6);

//        #08
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            ae.printStackTrace(); // 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다.
            System.out.println("예외메세지 : "+ ae.getMessage());
        }
        System.out.println(6);




    }
}
