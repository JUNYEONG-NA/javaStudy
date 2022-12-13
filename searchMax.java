import java.util.Scanner;

public class searchMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 생성
        int[] arr = new int[9];

        int max = 0;
        int count=0;
        // 난수 생성해서 배열에 입력
        for(int i = 0; i<arr.length;i++){

            arr[i] = (int)(Math.random()*100)+1;

            System.out.println("arr["+i+"] : "+arr[i]); // 배열 출력

            if(arr[0]<arr[i]){  // 최대값, 인덱스 번호 찾기
                arr[0] = arr[i];
                max = arr[i];
                count = i;
            }else if(arr[0]>arr[i]){
                max = arr[0];
            }
        }
            System.out.println("최댓값 : "+max+"\n배열의 인덱스 : arr[" + count+"]\n자릿수 : "+ (count+1));
    }
}
