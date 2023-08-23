import java.util.Scanner;
public class Main {
    public static boolean isTopper(int number) {
        int oddSum = 0;
        int evenSum = 0;
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i)-'0';
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        return oddSum == evenSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = isTopper(number);
        System.out.println(result);
        sc.close();
    }
}