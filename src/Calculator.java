public class Calculator {
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
}
