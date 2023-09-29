import java.util.Scanner;

/**
 * Author: Müllner Johann Marcel
 * Date: 15.09.2023
 * Version: 1.0
 * Description: my simple calculator
 */
public class AdvancedCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String p1 = "Bitte gib die erste Zahl oder -1 zum beenden ein: ";
            String p2 = "Gib die zweite Zahl ein: ";
            String p3 = "Gib die dritte zahl ein: ";

            double num1 = readDouble(p1);
            if (num1 == -1) {
                System.out.println("Programm beendet");
                break;
            }
            double num2 = readDouble(p2);
            double num3 = readDouble(p3);
            String operation = getOperation();

            switch (operation) { // this is  the operation addition
                case "+" -> System.out.println(num1 + num2 + num3);
                // ergebnis print out
                case "-" -> System.out.println(num1 - num2 - num3);
                // ergebnis print out
                case "*" -> // this is the operation multiplication
                        System.out.println(num1 * num2 * num3);
                // ergebnis print out
                case "/" -> { // this is the operation division
                    if (num2 != 0 && num3 != 0) {
                        System.out.println(num1 / num2 / num3);
                    } else {
                        System.out.println("Eine Division duch 0 ist nicht möglich");
                    }
                }
                case "min" -> System.out.println(Math.min(num1, Math.min(num2, num3)));
                case "max" -> System.out.println(Math.max(num1, Math.max(num2, num3)));
                case "sqt" -> System.out.println(Math.sqrt(num1));
                case "mean" -> System.out.println((num1 + num2 + num3) / 3);
                default -> System.out.println("Ungültige Operation"); // print out Error massage
            }
        }
    }

    /**
     * Liest eine Rechenoption ein
     *
     * @return operation als String
     */
    private static String getOperation() {
        System.out.println("Gib einen Operator (* + - / min max sqt mean) ein");
        // prompt user to enter an operator
        return scanner.next();
    }

    /**
     * Liest die zahlen ein
     *
     * @param prompt zahlen ausgebe
     * @return Zahlen als double
     */
    public static double readDouble(String prompt) {
        System.out.println(prompt);
        double d;
        while (true) {

            String s = scanner.next();
            try {
                d = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Error bitte gib einen Zahl ein ");
                continue;
            }
            return d;

        }
    }
}