package on1217;
/******************************************
       기본생성자( default Constructor )

  생성자 - 객체를 사용하기 위해 메모리에 적재하는 과정
 ******************************************/
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }
}
public class Ch6_ex23_Constructor_1 {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // 에러발생

    }
}

// Data1 에는 생성자가 없어 기본 생성자를 자동으로 생성해 주었지만
// Data2에는 매개변수가 있는 생성자가 정의되어 있으므로 컴파일 에러를 발생시키기 않으려면
// Data2 d2 = new Data2(10) => 매개변수를 넣어야 주어야 한다.
/* 기본생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.*/