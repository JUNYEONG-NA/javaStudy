import java.util.Scanner;

public class twoDemensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열 생성
        System.out.println("행 길이");
        int n = sc.nextInt();
        System.out.println("열 길이");
        int m = sc.nextInt();
        int[][] arr;
        arr = new int[n][m];
        System.out.println("n : "+n+", m  :" + m);
        int count = 0;

        int sum =0;



        // 배열에 값 넣기
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++) {
                count += 1;
                arr[i][j] = count;
                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
            }
        }
        // 배열 더하기
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j< arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("배열의 합 : "+ sum);

    }
}
