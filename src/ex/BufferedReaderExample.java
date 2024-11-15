package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // BufferedReader 를 사용하여 입력 스트림을 읽기 위한 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자에게 입력을 요구하는 메시지를 출력
        System.out.print("BufferedReader에 숫자를 입력하세요 : ");

        // 사용자가 입력한 값을 읽어서 문자열로 반환하고, 이를 정수로 변환
        int number = Integer.parseInt(br.readLine());

        // 입력된 숫자를 출력
        System.out.println("BufferedReader에 입력한 숫자 출력 : " + number);

        // BufferedReader 사용이 끝났으면 스트림을 닫아 리소스를 해제
        br.close();
    }
}
