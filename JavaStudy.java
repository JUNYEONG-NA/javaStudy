import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
//        System.out.println("helloWolrd!");
//
//        # Chapter 4 : 조건문과 반복문(if, switch, for, while)
//
//        Q1. 다음의 문장들을 조건식으로 표현하라.
////  ① int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for(int i=0; i<x ;i++){
//            for(int j=0; j<x ;j++){
//                System.out.print("*");
//            }
//        }
//
//        if (x >= 10 && x <= 20) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//  ② char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//        char ch = '5';
//        if(ch != ' ' || ch!= '\t' )
//            System.out.println("true");
//  ③ char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//        if(ch == 'x' ^ ch == 'X'){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//  ④ char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//        if((int)ch >= '0' && (int)ch <= '9') {
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//  ⑤ char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식

//  ⑥ int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
//  ⑦ boolean형 변수 powerOn가 false일 때 true인 조건식
//  ⑧ 문자열 참조변수 str이 “yes”일 때 true인 조건식




    1.

        Scanner sc = new Scanner(System.in);
        int A,B;

        System.out.println("A,B 를 입력해 주세요");

         A = sc.nextInt();
         B = sc.nextInt();
        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
//        2.

        int A = sc.nextInt();
//
//        for(int i=A;i<10;i++){
//            for(int j=1;j<10;j++) {
//                System.out.println(A+"X"+j+"="+A * j);
//            }
//        }

//3.
//        for(int i = 0; i<=A ;i++){
//            System.out.println(' ');
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//    }

        int score = A;

        if(score >= 90){
            System.out.println("A");
        }else if(score < 90 && score >= 80){
            System.out.println("B");
        }else if(score < 80 && score >= 70){
            System.out.println("C");
        }else if(score < 70 && score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
