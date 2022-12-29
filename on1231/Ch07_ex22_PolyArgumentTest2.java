package on1231;
class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
    Product2(){}
}
class Tv2 extends Product2{
    Tv2() {
        super(100);
    }
    public String toString(){ return "Tv";}
}
class Computer2 extends Product2{
    Computer2(){ super(200);}
    public String toString(){ return "Computer";}
}
class Audio extends Product2{
    Audio(){ super(50);}
    public String toString(){return "Audio";}
}
class Buyer2{
    int money = 1000;
    int bonusPoint =0;

    Product2[] item = new Product2[10];
    int i = 0;
    void buy( Product2 p2){
        if(money < p2.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p2.price;
        bonusPoint += p2.bonusPoint;
        item[i++] = p2;
        System.out.println(p2+" 구입 ");
    }
    void summary(){
        int sum =0;
        String itemList="";

        for(int i =0 ; i<item.length;i++){
            if(item[i] == null){
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("총 구입 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + " 입니다.");
    }
}
public class Ch07_ex22_PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();
    }
}
