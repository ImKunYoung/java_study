import java.util.Scanner;

public class Main {

    /*Constructor - 클래스 초기화*/
    public Main() {
        System.out.println("Constructor");
    }

    public void calculate() {
        System.out.println("calculate");
    }
    public void calculate2(int param1, int param2) {
        System.out.println("--------calculate2--------");
        System.out.println("param1: "+param1);
        System.out.println("param2: "+param2);

        System.out.println("더하기: "+(param1+param2));
        System.out.println("곱하기: "+(param1*param2));
        System.out.println("나누기 몫: "+(param1/param2));
        System.out.println("나누기 나머지: "+(param1%param2));
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        // 변수 선언
        int temp = 1;
        System.out.println("temp: "+temp);

        String a = "문자입니다";
        System.out.println(a);

        // 객체 선언
        Main main = new Main();
        
        // 함수 호출
        main.calculate();

        int param1 = 1;
        int param2 = 4;

        // 파라미터로 값 넘기기
        main.calculate2(param1, param2);

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("출력:"+i);
    }

}
