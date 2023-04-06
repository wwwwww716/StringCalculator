import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = Input.input(scanner);

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);
        int result = first;

        for (int i = 1; i < values.length; i+=2) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);
            result = Calculator.calculate(result, symbol, second);
        }
        Output.print(result);
    }
}