import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("찾을 정수를 입력하세요.");
        int[] Num = {11,1,4,1,2,4,2,4,2,3,4,4,2};
        int v = sc.nextInt();
        int Count =0;

        for(int i=0; i <Num.length; i++){

            if(Num[i] == v){
                     Count+=1;
            }

        }
        System.out.println(v+" 는 "+Count+" 개 입니다.");

    }
}
