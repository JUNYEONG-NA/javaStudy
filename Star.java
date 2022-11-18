import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for(int i = 0; i<=A ;i++){
            System.out.println(' ');
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        }
    }
}
