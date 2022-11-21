import java.util.Scanner;

public class LessThenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 크기 입력");

        int count = sc.nextInt();
        int[] N = new int[count];

        System.out.println("배열 입력");
        for(int i=0; i<count;i++){
            N[i] = sc.nextInt();
        }
        System.out.println("숫자 X 입력");
        int X = sc.nextInt();
        for(int i =0; i<count; i++){
            if(X > N[i]){
                System.out.println(N[i]);
            }
        }

    }
}
