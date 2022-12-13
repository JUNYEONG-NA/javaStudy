package on1217;
/************************************************************
 *               6.4 멤버변수의 초기화 시기와 순서                 *
 * 클래스변수의 초기화 시점 : 클래스가 로딩될 때 단 한번 초기화           *
 * 인스턴스변수의 초기화 시점 : 인스턴스가 생성될 때 마다 인스턴스별로 초기화 *
 *                                                          *
 *                      초기화 순서                            *
 * 클래스 변수의 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭         *
 * 인스턴스 변수 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 ->생성자  *
 ************************************************************/
class product {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public product(){} // 기본생성자 생략가능
}
class Ch06_ex29_ProductTest{
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

        System.out.println("p1의 제품번호 : " + p1.serialNo);
        System.out.println("p2의 제품번호 : " + p2.serialNo);
        System.out.println("p3의 제품번호 : " + p3.serialNo);
        System.out.println("생산된 제품 수는 " + product.count +"개 입니다.");
    }
}


