package Cautrucdieukhienlap;
import java.util.Scanner;
public class bai_10 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        // Số nguyên tố là số lớn hơn 1
        if (n <= 1) {
            return false;
        }
        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n chia hết cho i, không phải số nguyên tố
            }
        }
        return true; // n không chia hết cho số nào khác ngoài 1 và chính nó
    }
}
