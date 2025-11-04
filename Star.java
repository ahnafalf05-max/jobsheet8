import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        for (int i = 0; i > N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

/* 
1.If in for loop, the initialization i = 1 is changed to i = 0, what is the result? How can It be like that?   
  This prints N+1 stars
2.If in for loop, condition i <= N is changed to i > N, what is the result? How can It be like that? 
  
*/