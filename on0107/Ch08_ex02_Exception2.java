package on0107;

public class Ch08_ex02_Exception2 {
    public static void main(String[] args) {
        int number  =100;
        int result = 0;

//       #02
//        for(int i =0; i <10; i++){
//            result = number / (int)(Math.random()*10);
//            System.out.println(result);
//        }

//        #03
        for(int i =0; i <10; i++){
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println("0");
            }

        }


    }
}
