package on1217;

/*********************************
 *              상  속            *
 *  생성자와 초기화 블럭은 상속되지 않음  *
 *********************************/
class Tv{
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
public class Ch07_ex1_CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello world");
        ctv.caption = true;
        ctv.displayCaption("Hello world");
    }
}
