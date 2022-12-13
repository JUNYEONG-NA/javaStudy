package on1217;
/***************************************************
 *                 6.1 변수의 초기화                  *
 * 멤버변수(클래스변수, 인스턴스변수)와 배열의 초기화는 선택적   *
 * 지역변수는 사용하기 전에 반드시 초기화                   *
 ***************************************************/

/****************************************************
 *                 6.2 명시적 초기화                   *
 * 명시적 초기화 : 변수를 선언과 동시에 초기화 하는 것         *
 * 복잡한 초기화 작업이 필요할 땐 '초기화 블럭' 또는 생성자 사용 *
 ***************************************************/

/***************************************************
 *                 6.3 초기화 블럭                    *
 * 클래스 초기화 블럭 : 클래스변수의 복잡한 초기화에 사용       *
 * 인스턴스 초기화 블럭 : 인스턴스변수의 복잡한 초기화에 사용    *
 ***************************************************/
class Ch06_ex27_Initialize{
    static{
        System.out.println("************************");
        System.out.println("        Static { }      "); // 클래스 초기화 블럭
        System.out.println("************************");
    }
    {
        System.out.println(" { } "); // 인스턴스 초기화 블럭
    }

    public Ch06_ex27_Initialize(){
        System.out.println(" 생성자 ");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        Ch06_ex27_Initialize bt = new Ch06_ex27_Initialize();

        System.out.println("BlockTest bt2 = new BlockTest();");
        Ch06_ex27_Initialize bt2 = new Ch06_ex27_Initialize();
    }
}

