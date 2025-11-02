import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        
        for (int i = 1; i <= N; i++) {
            // Loop kolom
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            // Pindah ke baris baru
            System.out.println();
        }
    }
}