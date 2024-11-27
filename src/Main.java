public class Main {
    public static void main(String[] args) {
        char ch = '3';
        System.out.println((int) ch);  // 출력 : 51 (문자 '3'의 유니코드 값)
        System.out.println((int) '0'); // 출력 : 48 (문자 '0'의 유니코드 값)
        System.out.println(ch - '0');  // 출력 : 3 (문자 '3'에서 문자 '0'을 빼서 정수 3으로 변환)
    }
}