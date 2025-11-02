import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Loop baris
        for (int i = 1; i <= N; i++) {
            // Loop kolom: cetak sebanyak nilai baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pindah ke baris baru
            System.out.println();
        }
    }
}