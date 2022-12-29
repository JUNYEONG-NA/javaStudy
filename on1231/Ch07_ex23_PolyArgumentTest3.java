package on1231;

import java.util.Vector;

class Product3{
    int price;
    int bonusPoint;

    Product3(int price){
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
    Product3(){
        price = 0;
        bonusPoint = 0;
    }
}
class Tv3 extends Product3{
    Tv3() {
        super(100);
    }
    public String toString(){ return "Tv";}
}
class Computer3 extends Product3{
    Computer3(){ super(200);}
    public String toString(){ return "Computer";}
}
class Audio3 extends Product3{
    Audio3(){ super(50);}
    public String toString(){return "Audio";}
}
class Buyer3{
    int money = 1000;
    int bonusPoint =0;
    Vector item = new Vector();

    void buy( Product3 p3){
        if(money < p3.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p3.price;
        bonusPoint += p3.bonusPoint;
        item.add(p3);
        System.out.println(p3+" 구입 ");
    }
    void refund(Product3 p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " 반품 ");
        }else{
            System.out.println("해당제품은 품절입니다.");
        }
    }
    void summary3(){
        int sum =0;
        String itemList="";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for(int i =0 ; i<item.size();i++){
            Product3 p = (Product3)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("총 구입 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + " 입니다.");
    }
}
public class Ch07_ex23_PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv3 tv = new Tv3();
        Computer3 com = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary3();
        System.out.println();
        b.refund(com);
        b.summary3();
    }
}
