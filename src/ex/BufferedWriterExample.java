package ex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        // BufferedWriter 를 사용하여 출력 스트림을 초기화
        // OutputStreamWriter 는 바이트 스트림을 문자 스트림으로 변환
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // BufferedWriter 를 통해 문자열을 출력
        bw.write("Hello, BufferedWriter!");

        // 줄바꿈을 추가
        bw.newLine();

        // 버퍼에 저장된 내용을 강제로 출력
        bw.flush();

        // BufferedWriter 사용이 끝났으면 스트림을 닫아 리소스를 해제
        bw.close();
    }
}
