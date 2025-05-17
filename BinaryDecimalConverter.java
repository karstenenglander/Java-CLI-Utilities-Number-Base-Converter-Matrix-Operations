import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("(1) Convert binary to decimal");
            System.out.println("(2) Convert decimal to binary");
            System.out.println("(3) Quit");
            int operation = scanner.nextInt();

            if (operation == 3) {
                break;
            }

            if (operation == 1) {
                System.out.println("Enter a binary number:");
                String binary = scanner.next();
                System.out.println("Decimal: " + binaryToDecimal(binary));
            } else {
                System.out.println("Enter a decimal number:");
                int decimal = scanner.nextInt();
                System.out.println("Binary: " + decimalToBinary(decimal));
            }
        }

        scanner.close();
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary.isEmpty()) {
                break;
            } else {
                String take = binary.substring(binary.length() - 1);
                decimal += (int) (Integer.parseInt(take) * Math.pow(2, n));
                binary = binary.substring(0, binary.length() - 1);
                n++;
            }
        }
        return decimal;
    }

    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int rem = decimal % 2;
            binary.insert(0, rem);
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}