package on1217;
/****************************************
 *            자바는 단일상속만 허용          *
 *  모든 클래스 상위에는 Object class가 위치   *
 ****************************************/
class VCR{
    boolean power;
    int counter = 0;
    void power(){ power = !power; }
    void play(){ }
    void stop(){}
    void rew(){}
    void ff(){}
}
public class Ch07_ex4_TVCR extends Tv{ // CH07_ex1 Tv class
    VCR vcr = new VCR();

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }

}
