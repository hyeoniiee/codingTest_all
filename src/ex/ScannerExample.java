package ex;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 System.in(표준 입력)에서 데이터를 읽도록 설정
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 입력을 요구하는 메시지를 출력
        System.out.print("Scanner에 숫자를 입력하세요 : ");

        // 사용자가 입력한 정수를 읽어서 변수에 저장
        int number = scanner.nextInt();

        // 입력된 숫자를 출력
        System.out.println("Scanner에 입력한 숫자 출력 : " + number);

        // Scanner 사용이 끝났으므로 스트림을 닫아 리소스를 해제
        scanner.close();
    }
}
