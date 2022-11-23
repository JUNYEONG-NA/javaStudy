import java.util.Scanner;

public class searchMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
//        int[] createArr = new int[arr.length];
        int max = 0;
        int count=0;
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
//            createArr = arr;
            System.out.println("arr["+i+"] : "+arr[i]);

            if(arr[0]<arr[i]){
                arr[0] = arr[i];
                max = arr[i];
                count = i;
            }else if(arr[0]>arr[i]){
                max = arr[0];

            }
//            if(max == createArr[i]){
//            }

        }

            System.out.println("최댓값 : "+max+"\n배열의 인덱스 : arr[" + count+"]\n자릿수 : "+ (count+1));

    }
}
