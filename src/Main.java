import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 값을 입력하세요");
        String value = scanner.nextLine();

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i+=2) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);

            if (symbol.equals("+")) {
                first = first + second;
            } else if (symbol.equals("-")) {
                first = first - second;
            } else if (symbol.equals("*")) {
                first = first * second;
            } else if (symbol.equals("/")) {
                first = first / second;
            } else {
                System.out.println("잘못된 기호를 입력했습니다");
            }
        }
        System.out.println(first);

    }
}