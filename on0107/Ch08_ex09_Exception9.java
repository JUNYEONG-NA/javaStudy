package on0107;

public class Ch08_ex09_Exception9 {
    public static void main(String[] args) {

//        #09
//        try{
//            Exception e = new Exception("i made Exception");
//            throw e;
////            throw new Exception(); // 위의 두 줄은 이런 형태로 줄여쓸 수 있음.
//        }catch(Exception e){
//            System.out.println("Error message : "+ e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("프로그램 정상 종료");

//        #10
//        throw new Exception("이딴안되는것좀쳐넣지마요제발");

//        #11
        {
            throw new RuntimeException();
        }

    }
}
