package on1217;


/*********************************************
 *                  접근제어자                  *
 * public : 같은 클래스, 패키지, 자손클래스, 전체     *
 * proteced : 같은 패키지, 다른패키지의 자손클래스    *
 * default : 같은 패키지                        *
 * private : 같은 클래스                        *
 *  public > protected > (default) > private *
 *********************************************/
// 외부로부터 데이를 보호, 외부에는 불필요한, 내부적으로 사용되는 부분을 감추기 위해 접근제어자 사용

public class Ch07_ex13_TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);
//        t.hour = 13;
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
class Time{
    private int Hour,Min,Sec;

    Time(int hour, int min, int sec){
        setHour(hour);
        setMin(min);
        setSec(sec);
    }
    public int getHour(){return Hour;}
    public void setHour(int hour){
        if(hour < 0 || hour > 23) return;
        this.Hour = hour;
    }
    public int getMin(){return Min;}
    public void setMin(int min){
        if(min < 0 || min > 59) return;
        this.Min = min;
    }
    public int getSec(){return Sec;}
    public void setSec(int sec){
        if(sec < 0 || sec > 59) return;
        this.Sec = sec;
    }
    public String toString(){return Hour+":"+Min+":"+Sec;}
}

