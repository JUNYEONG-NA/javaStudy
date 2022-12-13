package on1217;

//public class Ch07_ex7_PointTest {
//    public static void main(String[] args) {
//        Point3D p3 = new Point3D(1,2,3);
//    }
//}
//class Point1{
//    int x,y;
//    Point1(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//    String getLocation(){
//        return "x : " + x + ", y : " + y ;
//    }
//}
//class Point3D extends Point{
//    int z ;
//    Point3D(int x, int y, int z){
//        super(); // 왜 자꾸 안되는거 집어넣어 더헷갈리게 시팔
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//    String getLocation(){
//        return "x : " + x + ", y : " + y + ", z : " + z ;
//    }
//}

public class Ch07_ex7_PointTest { //초07_ㄷㅌ8
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}
class Point1{
    int x,y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x : " + x + ", y : " + y ;
    }
}
class Point3D extends Point{
    int z ;
    Point3D(int x, int y, int z){
        super(); // 왜 자꾸 안되는거 집어넣어 더헷갈리게 시팔
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation(){
        return "x : " + x + ", y : " + y + ", z : " + z ;
    }
}
