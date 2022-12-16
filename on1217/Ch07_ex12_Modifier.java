package on1217;


/*********************************************
 *                  접근제어자                  *
 *   public , protected , default , private  *
 *   static, final, abstract, native,        *
 *   transient,syncronized,volatile,srtictfp *
 *********************************************/
// static : 클래스변수(static멤버변수)는 인스턴스에 관계없이 같은 값, / 멤버변수, 메서드 , 초기화블럭 -> static 메서드 안에서는 인스턴스멤버 사용불가

// final : 상수 , 클래스 메서드 멤버변수 지역변수 -> 다른클래스의 조상, 오버라이딩, 재정의 모두 불가


class Card1{
    final int NUM;
    final String PATTERN;
    static int width = 100;
    static int height = 250;
    Card1(String pattern, int num){
        NUM = num;
        PATTERN = pattern;
            }

    Card1(){
        this("HEART",1);
    }
    public String toString(){
        return PATTERN + " " + NUM;
    }
}

public class Ch07_ex12_Modifier {
    public static void main(String[] args) {
        Card1 c = new Card1("Heart", 10);
//        c.NUM = 5;
        System.out.println(c.PATTERN);
        System.out.println(c.NUM);
        System.out.println(c);
    }
}
