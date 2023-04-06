import java.util.Scanner;

public class Main {

    public static String input(Scanner scanner) {
        System.out.println("계산할 값을 입력하세요");
        String value = scanner.nextLine();
        return value;
    }

    public static int calculate(int first, String symbol, int second) {
        int result = 0;
        if (symbol.equals("+")) {
            result = first + second;
        } else if (symbol.equals("-")) {
            result = first - second;
        } else if (symbol.equals("*")) {
            result = first * second;
        } else if (symbol.equals("/")) {
            result = first / second;
        } else {
            System.out.println("잘못된 기호를 입력했습니다");
        }
        return result;
    }

    public static void print(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = input(scanner);

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);
        int result = first;

        for (int i = 1; i < values.length; i+=2) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);
            result = calculate(result, symbol, second);
        }
        print(result);
    }
}