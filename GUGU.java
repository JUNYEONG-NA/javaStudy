import java.util.Scanner;

public class GUGU {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for(int i=A;i<10;i++){
            for(int j=1;j<10;j++) {
                System.out.println(A+"X"+j+"="+A * j);
            }
        }
    }
}
