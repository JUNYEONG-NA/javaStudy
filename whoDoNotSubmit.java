import java.util.Scanner;

public class whoDoNotSubmit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("총 제출 과제 수");
        int n = sc.nextInt();
        int[] studentNum = new int[30]; // 출석번호
        int[] submit = new int[n]; // 과제 낸 사람 수(입력한 수 만큼 랜덤)
        int count = 0; // 출석번호 인덱스 저장 변수

        // 1 ~ 30 출석번호 생성
        System.out.println(" 출석 번호 :");
        for (int i = 0; i < studentNum.length; i++) {
            count += 1;
            studentNum[i] = count;
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(studentNum[i]);
        }

        // Math.random() 중복제거
        for (int i = 0; i < submit.length; i++) {
            submit[i] = (int) (Math.random() * 30) + 1;
            for (int j = 0; j < i; j++) {
                if (submit[i] == submit[j]) {
                    i--;
                    break;
                }
            }
        }

        System.out.println("\n 과제 낸 사람 ");
        for (int i = 0; i < submit.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(submit[i]);
        }
        System.out.println();

        System.out.println(" 과제 안 낸 사람");
        for (int i = 0; i < studentNum.length; i++) {
            for (int j = 0; j < submit.length; j++) {
                if (studentNum[i] == submit[j]) {
                    studentNum[i] = 0;
                    }
                }
                if( studentNum[i] != 0 ){
                    if( i > 0 ){System.out.print(" , ");}
                    System.out.print(studentNum[i]);
            }
        }
    }
}



