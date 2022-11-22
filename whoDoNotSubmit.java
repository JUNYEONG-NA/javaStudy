import java.util.Scanner;

public class whoDoNotSubmit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("총 제출 과제 수");
        int n = sc.nextInt();
        int[] studentNum = new int[30];
        int[] submit = new int[n];
        int[] notSub = new int[30-n];


        int count = 0;
        System.out.println(" 출석 번호 :");
        for(int i=0; i<studentNum.length;i++){
            count +=1;
            studentNum[i] = count;
            if(i>0) {
                System.out.print(" , ");
            }
            System.out.print(studentNum[i]);
        }
    // Math.random() 중복제거
        for (int i = 0; i < submit.length; i++) {
            submit[i] = (int) (Math.random() * n)+1;
            for (int j = 0; j < i; j++) {
                if (submit[i] == submit[j]) {
                    i--;
                    break;
                }
            }
        }



        System.out.println("\n 과제 낸 사람 ");
        for(int i=0; i<submit.length;i++) {
            if(i>0){
                System.out.print(" , ");
            }
            System.out.print(submit[i]);
        }
        for(int i = 0; i < studentNum.length; i++){
            for(int j = 0; j < studentNum.length; j++){
                if(studentNum[i] == submit[j]) {
                        if(  )
                }

            }
            System.out.println(" \n과제 안 낸 사람");
            System.out.println(notSub[i]);
        }


    }
}



