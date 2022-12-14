package on1231;
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product{
    Tv() {
        super(100);
    }
        public String toString(){ return "Tv";}
}
class Computer extends Product{
    Computer(){ super(200);}
    public String toString(){ return "Computer";}
}
class Buyer{
    int money = 1000;
    int bonusPoint =0;

    void buy( Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+" 구입 ");
    }
}
public class Ch07_ex21_PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 잔액은 " + b.money + " 만원 입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + " 점 입니다.");
    }

}
